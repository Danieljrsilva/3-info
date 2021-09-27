package tcc.myapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import tcc.myapplication.config.ServiceGenerator;
import tcc.myapplication.models.Cursos;
import tcc.myapplication.services.CursoService;

public class EspecificoCursoFragment extends Fragment {

    private CursoService service;

    /*1*/private TextView nome_curso;
    /*2*/private TextView descricaoCurso;

    View minhaView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        minhaView = inflater.inflate(R.layout.fragment_curso, container, false);

        /*3*/nome_curso = minhaView.findViewById(R.id.textView);
        /*4*/descricaoCurso = minhaView.findViewById(R.id.textView5);

        return minhaView;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            String p = getArguments().getString("id_curso");
            Toast.makeText(getContext(), p, Toast.LENGTH_SHORT).show();

            carregarContato(Integer.parseInt(p));
        }
    }

    public void carregarContato(int IDContato) {
        /*5*/service = ServiceGenerator.createService(CursoService.class);

        //configura requisição
        Call<Cursos> call = service.carregarContato(IDContato);

        //executar a requisição
        call.enqueue(new Callback<Cursos>() {
            @Override
            public void onResponse(Call<Cursos> call, Response<Cursos> response) {
                /*6*/nome_curso.setText(response.body().getNome());
                /*7*/descricaoCurso.setText(response.body().getDescricao());
            }

            @Override
            public void onFailure(Call<Cursos> call, Throwable t) {

            }
        });
    }//fim do carregarContato
}
