package br.sp.gov.etec.activitys;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import br.sp.gov.etec.R;
import br.sp.gov.etec.config.ServiceGenerator;
import br.sp.gov.etec.models.Contato;
import br.sp.gov.etec.services.ContatoService;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    //declaração da listViewContatos na classe java
    private ListView listViewContatos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Abre uma nova Activity
                Intent intent = new Intent(MainActivity.this,ContatoActivity.class);
                startActivity(intent);

            }
        });

        //ligação entre o java e o XML(Activity)
        listViewContatos = (ListView)findViewById(R.id.listViewContatos);

        //chamar o método carregarTodos
        carregarTodos();

    }//fim do on create

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void carregarTodos(){

        //cria objeto da classe ServiceGenerator esse objeto será responsavel por criar o servico de requisições nesta classe
        ContatoService service = ServiceGenerator.createService(ContatoService.class);

        //salvar a resposta da requisição
        Call<List<Contato>> call = service.listarTodos();

        //realiza a requisição
        call.enqueue(new Callback<List<Contato>>() {
            @Override
            public void onResponse(Call<List<Contato>> call, Response<List<Contato>> response) {

                //declaração da lista que será respoansável por fazer a relação entre "chave" e valor
                ArrayList<HashMap<String, String>> contatoList = new ArrayList<HashMap<String, String>>();

                //percorrer a resposta da requisição
                for (Contato contato : response.body()){

                    //Informações da cada contato da resposta
                    HashMap<String, String> infoContato = new HashMap<String, String>();

                    infoContato.put("ID",String.valueOf(contato.getID()));
                    infoContato.put("nome", contato.getNome());
                    infoContato.put("cel",String.valueOf(contato.getCel()));

                    //adiciona cada contato a lista de contatos , que sera utilizada para compor a "listView"
                    contatoList.add(infoContato);

                }//fim so for

                //cria a lista personalizada
                ListAdapter adapter = new SimpleAdapter(MainActivity.this,contatoList,R.layout.view_item_lista_contatos,new String[]{"ID","nome","cel"},
                        new int[]{R.id.textViewItemListaID,R.id.textViewItemListaNome,R.id.textViewItemListaCel});

                //adiciona  o "template" a listView
                listViewContatos.setAdapter(adapter);


            }//fim do onResponse

            @Override
            public void onFailure(Call<List<Contato>> call, Throwable t) {

            }//fim do onFailure
        });//fim da requisição

    }//fim da classe
}
