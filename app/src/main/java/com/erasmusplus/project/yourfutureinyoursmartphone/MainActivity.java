package com.erasmusplus.project.yourfutureinyoursmartphone;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    //==============================================================================================
    // CONSTANTES
    //==============================================================================================
    public static final String FICHERO_LOGIN = "login-status";

    //==============================================================================================
    // VARIABLES
    //==============================================================================================

    //==============================================================================================
    // MÉTODOS SOBREESCRITOS
    //==============================================================================================
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
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
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        /*if (id == R.id.action_settings) {
            return true;
        }*/

        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        Fragment fragment;
        FragmentManager gestorFragment;
        FragmentTransaction transaccionFragment;
        File archivoLog;
        int id;

        id = item.getItemId(); // Se obtiene el ID de la opción seleccionada.

        //==========================================================================================
        // REGISTRO
        //==========================================================================================
        if (id == R.id.nav_registro) {
            archivoLog = new File(this.getFilesDir() + "/" +FICHERO_LOGIN);

            if(archivoLog.exists())
                Toast.makeText(this, "Para registrar un nuevo usuario primero debe deslogearse.", Toast.LENGTH_SHORT).show();
            else{
                fragment = new Registro();
                getSupportFragmentManager().beginTransaction().add(R.id.area_pantalla, fragment).commit();
                gestorFragment = getSupportFragmentManager();
                transaccionFragment = gestorFragment.beginTransaction();
                transaccionFragment.replace(R.id.area_pantalla, fragment).commit();
            }
            
        //==========================================================================================
        // INICIAR SESIÓN
        //==========================================================================================
        } else if (id == R.id.nav_inicio_sesion) {
            fragment = new Login();
            getSupportFragmentManager().beginTransaction().add(R.id.area_pantalla, fragment).commit();
            gestorFragment = getSupportFragmentManager();
            transaccionFragment = gestorFragment.beginTransaction();
            transaccionFragment.replace(R.id.area_pantalla, fragment).commit();

        //==========================================================================================
        // BUSCAR
        //==========================================================================================
        } else if (id == R.id.nav_buscar) {
            try {

                FileReader flujo = new FileReader(FICHERO_LOGIN);
                BufferedReader filtro = new BufferedReader(flujo);
                int estadoLogin = Integer.parseInt(filtro.readLine().trim());
                filtro.close();
                flujo.close();

                if (estadoLogin == 1) {
                    // TODO Lanzar fragment de Búsqueda
                }

            } catch (java.io.IOException e) {
                e.printStackTrace();
            }
        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}