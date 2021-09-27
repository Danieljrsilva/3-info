package tcc.myapplication.services;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import tcc.myapplication.models.Comunicados;

public interface ComunicadoService {

    //Rotas GET

    //GET -> retornar TODOS os comunicados
    @GET("comunicados")
    Call<List<Comunicados>> listarTodos();

    //GET -> retornar apenas UM comunicado
    @GET("comunicados/{id}")
    Call<Comunicados> carregarContato(@Path("id") int contatoID);

}
