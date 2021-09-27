package tcc.myapplication;

import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import tcc.myapplication.config.ServiceGenerator;
import tcc.myapplication.models.Cursos;
import tcc.myapplication.services.CursoService;

public class CursosFragment extends Fragment {

    View minhaView;
    ListView listview;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        minhaView = inflater.inflate(R.layout.cursos, container, false);
        getActivity().setTitle("Cursos");

        DialogFragment newFragment = MyDialogFragment.newInstance(R.string.title_dialogcursos, R.string.message_dialogcursos);
        newFragment.show(getFragmentManager(), "dialog");

        String[] menuItens = {"Administração","Contabilidade","Design de Interiores","Desenvolvimento de Sistemas","Edificações","Eletrotécnica","Eventos","Enfermagem","Logística","Mecânica","Segurança do Trabalho","Turismo"};
        listview = (ListView) minhaView.findViewById(R.id.listview_cursos);
        ArrayAdapter<String> listViewAdapter = new ArrayAdapter<String>(
                getActivity(),
                android.R.layout.simple_list_item_1,
                menuItens

        );
        //listview.setAdapter(listViewAdapter);

        /*listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch(position) {
                    case 0:
                        Toast.makeText(getActivity(), "hey", Toast.LENGTH_SHORT).show();
                        break;
                    case 1:
                        Toast.makeText(getActivity(), "hey2", Toast.LENGTH_SHORT).show();
                        break;
                    case 2:
                        Toast.makeText(getActivity(), "hey3", Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });*/


        carregarTodos();
        return minhaView;
    }

    public void carregarTodos(){

        //cria objeto da classe ServiceGenerator esse objeto será responsavel por criar o servico de requisições nesta classe
        CursoService service = ServiceGenerator.createService(CursoService.class);

        //salvar a resposta da requisição
        Call<List<Cursos>> call = (Call<List<Cursos>>) ((CursoService) service).listarTodos();

        //realiza a requisição
        call.enqueue(new Callback<List<Cursos>>() {
            @Override
            public void onResponse(Call<List<Cursos>> call, Response<List<Cursos>> response) {

                //declaração da lista que será respoansável por fazer a relação entre "chave" e valor
                ArrayList<HashMap<String, String>> contatoList = new ArrayList<HashMap<String, String>>();

                //percorrer a resposta da requisição
                for (Cursos cursos : response.body()){

                    //Informações da cada cursos da resposta
                    HashMap<String, String> infoContato = new HashMap<String, String>();

                    infoContato.put("ID",String.valueOf(cursos.getID()));
                    infoContato.put("nome", cursos.getNome());
                    infoContato.put("descricao",String.valueOf(cursos.getDescricao()));
                    infoContato.put("video",String.valueOf(cursos.getVideo()));

                    //adiciona cada cursos a lista de contatos , que sera utilizada para compor a "listView"
                    contatoList.add(infoContato);

                }//fim so for

                ListAdapter adapter = new SimpleAdapter(getContext(),
                        contatoList,
                        R.layout.content_cursos,
                        new String[] {"ID", "nome"},
                        new int[] {R.id.id_curso_lista, R.id.lista_curso_nome});
                listview.setAdapter(adapter);

                listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                        TextView textViewID = (TextView)view.findViewById(R.id.id_curso_lista);


                        Bundle bundle = new Bundle();
                        bundle.putString("id_curso", textViewID.getText().toString());

                        EspecificoCursoFragment sf = new EspecificoCursoFragment();
                        sf.setArguments(bundle);

                        FragmentTransaction transaction = getFragmentManager().beginTransaction();
                        transaction.addToBackStack(null);
                        transaction.replace(R.id.conteudo_fragmento, sf);
                        transaction.commit();


                    }
                });

            }//fim do onResponse

            @Override
            public void onFailure(Call<List<Cursos>> call, Throwable t) {

            }//fim do onFailure
        });//fim da requisição

    }//fim da classe
}
