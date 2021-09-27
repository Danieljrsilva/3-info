package tcc.myapplication;

import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.sql.Date;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import tcc.myapplication.config.ServiceGenerator;
import tcc.myapplication.models.Comunicados;
import tcc.myapplication.services.ComunicadoService;
import tcc.myapplication.services.CursoService;

public class ComunicadosFragment extends Fragment implements AdapterView.OnItemSelectedListener {

    View minhaView;

    private ListView listView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        minhaView = inflater.inflate(R.layout.comunicados, container, false);
        getActivity().setTitle("Comunicados");

        DialogFragment newFragment = MyDialogFragment.newInstance(R.string.title_dialogcomunicados, R.string.message_dialogcomunicados);
        newFragment.show(getFragmentManager(), "dialog");

        String [] values = {"João Belarmino","Administração","Contabilidade","Design de Interiores","Desenvolvimento de Sistemas","Edificações","Eletrotécnica","Eventos","Enfermagem","Logística","Mecânica","Segurança do Trabalho","Turismo"};
        Spinner spinner = (Spinner) minhaView.findViewById(R.id.spinner_comunicados);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this.getActivity(), android.R.layout.simple_spinner_item, values);
        adapter.setDropDownViewResource(android.R.layout.select_dialog_singlechoice);
        spinner.setAdapter(adapter);

        listView = minhaView.findViewById(R.id.listViewComunicados);

        carregarTodos();

        return minhaView;
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    public void carregarTodos(){

        //cria objeto da classe ServiceGenerator esse objeto será responsavel por criar o servico de requisições nesta classe
        ComunicadoService service = ServiceGenerator.createService(ComunicadoService.class);

        //salvar a resposta da requisição
        Call<List<Comunicados>> call =  service.listarTodos();

        //realiza a requisição
        call.enqueue(new Callback<List<Comunicados>>() {
            @Override
            public void onResponse(Call<List<Comunicados>> call, Response<List<Comunicados>> response) {

                //declaração da lista que será respoansável por fazer a relação entre "chave" e valor
                ArrayList<HashMap<String, String>> contatoList = new ArrayList<HashMap<String, String>>();

                //percorrer a resposta da requisição
                for (Comunicados comunicados : response.body()){

                    //Informações da cada cursos da resposta
                    HashMap<String, String> infoContato = new HashMap<String, String>();

                    infoContato.put("ID",String.valueOf(comunicados.getID()));
                    infoContato.put("titulo",String.valueOf(comunicados.getTitulo()));
                    infoContato.put("descricao",String.valueOf(comunicados.getDescricao()));
                    //infoContato.put("data", String.valueOf(comunicados.getData()));
                    infoContato.put("img",String.valueOf(comunicados.getImg()));

                    //adiciona cada cursos a lista de contatos , que sera utilizada para compor a "listView"
                    contatoList.add(infoContato);

                }//fim so for

                ListAdapter adapter = new SimpleAdapter(getContext(),
                        contatoList,
                        R.layout.content_comunicado,
                        new String[] {"titulo"},
                        new int[] {R.id.textViewTituloComunicado});


                listView.setAdapter(adapter);



            }//fim do onResponse

            @Override
            public void onFailure(Call<List<Comunicados>> call, Throwable t) {
                Log.e("err",""+t);
            }//fim do onFailure
        });//fim da requisição

    }//fim da classe
}
