package br.sp.gov.etec.services;

import java.util.List;

import br.sp.gov.etec.models.Contato;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ContatoService {
    //Rotas GET, POST, PUT, DELETE

    //GET -> retornar TODOS os contatos
    @GET("contatos")
    Call<List<Contato>> listarTodos();

    //GET -> retornar apenas UM contato
    @GET("contato/{id}")
    Call<Contato> carregarContato(@Path("id") int contatoID);

    //POST-> cadastrar um contato

    //PUT -> alterar um contato

    //DELETE -> excluir um contato
}//fim da interface
