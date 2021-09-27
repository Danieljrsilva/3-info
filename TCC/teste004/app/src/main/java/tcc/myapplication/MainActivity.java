package tcc.myapplication;

import android.app.AlarmManager;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.TaskStackBuilder;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.NotificationCompat;
import android.support.v4.view.GravityCompat;
import android.support.v7.app.ActionBarDrawerToggle;
import android.view.MenuItem;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);

        //abrir o app no fragmento principal
        FragmentTransaction tx = getSupportFragmentManager().beginTransaction();
        tx.replace(R.id.conteudo_fragmento, new PrincipalFragment());
        tx.commit();
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // navagacao dos botoes do menu lateral ou navigation drawer
        FragmentManager fragmentManager = getSupportFragmentManager();
        switch(item.getItemId()) {
            case R.id.nav_principal:
                fragmentManager.beginTransaction().replace(R.id.conteudo_fragmento, new PrincipalFragment()).commit();
                break;
            case R.id.nav_curso:
                fragmentManager.beginTransaction().replace(R.id.conteudo_fragmento, new CursosFragment()).commit();
                break;
            case R.id.nav_comunicados:
                fragmentManager.beginTransaction().replace(R.id.conteudo_fragmento, new ComunicadosFragment()).commit();
                break;
            case R.id.nav_sobre:
                fragmentManager.beginTransaction().replace(R.id.conteudo_fragmento, new SobreFragment()).commit();
                break;
            case R.id.nav_compartilhar:
                Intent sendIntent = new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.putExtra(Intent.EXTRA_TEXT, "Da uma olhada no app do liceu ai! O LiceuApp www.playstore.com");
                sendIntent.setType("text/plain");
                startActivity(Intent.createChooser(sendIntent, getResources().getText(R.string.menu_compartilhar)));
                break;
        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
