package br.sp.gov.etec.activitys;

import android.content.DialogInterface;
import android.content.Intent;
import android.opengl.EGLExt;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import br.sp.gov.etec.R;
import br.sp.gov.etec.config.ServiceGenerator;
import br.sp.gov.etec.models.Contato;
import br.sp.gov.etec.services.ContatoService;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ContatoActivity extends AppCompatActivity {

    //atributos
    private EditText editTextNome;
    private EditText editTextEmail;
    private EditText editTextTel;
    private EditText editTextCel;

    private ContatoService service;
    private Contato contato;

    private int IDContato;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contato);

        //ligação entre o Java  e o Xml
        editTextNome = (EditText)findViewById(R.id.editTextNome);
        editTextEmail = (EditText)findViewById(R.id.editTextEmail);
        editTextTel = (EditText)findViewById(R.id.editTextTelefone);
        editTextCel = (EditText)findViewById(R.id.editTextCelular);

        //instancia do ContatoService(responsavel or criar o sercico de requisições nesta classe)
        service = ServiceGenerator.createService(ContatoService.class);

        //recebe o parametro
        Intent intent = getIntent();
        IDContato = intent.getIntExtra("ID",0);

        //verifica se o IDContato é igual a Zero
        if (IDContato == 0){
            //inserir
        }
        else{
            //selecionar o contato
            //alterar ou excluir
        }
        }//fim do onCreate

    public void  carregarContato(int IDContato){

        //configura a requisição
        Call<Contato> call = service.carregarContato(IDContato);

        //executar a requisição
        call.enqueue(new Callback<Contato>() {
            @Override
            public void onResponse(Call<Contato> call, Response<Contato> response) {
                editTextNome.setText(response.body().getNome());
                editTextEmail.setText(response.body().getEmail());
                editTextCel.setText(String.valueOf(response.body().getCel()));
                editTextTel.setText(String.valueOf(response.body().getTel()));

            }//fim do onResponse

            @Override
            public void onFailure(Call<Contato> call, Throwable t) {

            }//fim do onFailure

        });//Fim da requisição

    }//fim do carregarContato
    public void salvarContato(View view){

        //Criação do objeto "Contato" que será enviado por POST para a API

        Contato contato = new Contato();
        contato.setNome(editTextNome.getText().toString());
        contato.setEmail(editTextEmail.getText().toString());
        contato.setCel(Long.parseLong(editTextCel.getText().toString()));
        contato.setTel(Long.parseLong(editTextTel.getText().toString()));

        //Salva um novo contato
        if(IDContato == 0){

            //configura a requisição
            Call<Contato> call = service.salvarContato(contato);

            //executar a requisição
            call.enqueue(new Callback<Contato>() {
                @Override
                public void onResponse(Call<Contato> call, Response<Contato> response) {

                    Toast toast = Toast.makeText(getApplicationContext(),"Cadastrado com sucesso mano é noix", Toast.LENGTH_LONG);
                    toast.show();

                    //fecha a activity
                    finish();

                }//fim do onResponse

                @Override
                public void onFailure(Call<Contato> call, Throwable t) {

                    Toast toast = Toast.makeText(getApplicationContext(),"Erro mano", Toast.LENGTH_LONG);
                    toast.show();

                }//fim do onFailure

            });//fim da requisição

        }//fim do "salvar"
        //altera um conato existente
        else{
            contato.setID(IDContato);

            //configura a requisição
            Call<Contato> call = service.alterarContato(IDContato,contato);

            //executar a requisição
            call.enqueue(new Callback<Contato>() {
                @Override
                public void onResponse(Call<Contato> call, Response<Contato> response) {

                    Toast toast = Toast.makeText(getApplicationContext(),"Alterado com sucesso é noix", Toast.LENGTH_LONG);
                    toast.show();

                    //fecha a activity
                    finish();

                }//fim do onResponse

                @Override
                public void onFailure(Call<Contato> call, Throwable t) {

                    Toast toast = Toast.makeText(getApplicationContext(),"Falha ao alterar brow", Toast.LENGTH_LONG);
                    toast.show();

                }//fim do onFailure

            });//fim da requisição

        }//fim do "alterar"

    }//fim do salvarContato

    public void excluirContato(View view){

        //exibe o AlertDiaLog
        new AlertDialog.Builder(this)
                .setTitle("Confirmação")
                .setMessage("Deseja realmente excluir esse contato?")
                .setIcon(android.R.drawable.ic_dialog_alert)
                .setPositiveButton("Sim", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                })
                .setNegativeButton("Não",null).show();

    }//fim do excluirContato

}//fim da classe
