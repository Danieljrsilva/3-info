package tcc.myapplication.services;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import tcc.myapplication.models.Cursos;

public interface CursoService {

    //Rotas GET

    //GET -> retornar TODOS os cursos
   @GET("cursos")
   Call<List<Cursos>> listarTodos();

    //GET -> retornar apenas UM curso
    @GET("cursos/{id}")
    Call<Cursos> carregarContato(@Path("id") int contatoID);

}
