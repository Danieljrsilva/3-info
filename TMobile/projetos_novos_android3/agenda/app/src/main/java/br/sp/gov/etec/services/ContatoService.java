package br.sp.gov.etec.services;

import java.util.List;

import br.sp.gov.etec.models.Contato;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface ContatoService {
    //Rotas GET, POST, PUT, DELETE

    //GET -> retornar TODOS os contatos
    @GET("contatos/")
    Call<List<Contato>> listarTodos();

    //GET -> retornar apenas UM contato
    @GET("contato/{id}")
    Call<Contato> carregarContato(@Path("id") int contatoID);

    //POST-> cadastrar um contato
    @POST("contato")
    Call<Contato>salvarContato(@Body Contato contato);

    //PUT -> alterar um contato
    @PUT("contato/{id}")
    Call<Contato> alterarContato(@Path("id") int id, @Body Contato contato);
    //DELETE -> excluir um contato

}//fim da interface
