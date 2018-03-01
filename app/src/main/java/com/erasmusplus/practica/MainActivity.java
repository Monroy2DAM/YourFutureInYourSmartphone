package com.erasmusplus.practica;

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


import java.io.File;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    public static final String FICHERO_LOGIN = "fichero-login";

    Fragment fragment;
    FragmentManager fragmentManager;
    FragmentTransaction transaccionFragment;

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

        mostrarInicio();
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

        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        int id;
        File archivoLog;

        id = item.getItemId(); // Se obtiene el ID de la opción seleccionada.

        archivoLog = new File(this.getFilesDir() + "/" + FICHERO_LOGIN);


        if (id == R.id.nav_registro) {

            if (archivoLog.exists()) {
                Toast.makeText(this, "Para registrar un nuevo usuario primero debe deslogearse.", Toast.LENGTH_SHORT).show();
            } else {
                mostrarRegistro();
            }


        } else if (id == R.id.nav_inicio_sesion) {
            mostrarLogin();


        } else if (id == R.id.nav_buscar) {

            if (archivoLog.exists()) {
                mostrarBusqueda();
            }else {
                Toast.makeText(this, "Debe logearse para acceder a búsqueda", Toast.LENGTH_SHORT).show();
                mostrarLogin();
            }


        } else if (id == R.id.nav_logout) {

            if (archivoLog.exists()) {
                archivoLog.delete();
                Toast.makeText(this, "Se ha desconectado correctamente.", Toast.LENGTH_SHORT).show();
            } else
                Toast.makeText(this, "Para deslogearse primero hay que logearse.", Toast.LENGTH_SHORT).show();

            mostrarLogin();
        }


        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    private void mostrarInicio() {
        fragment = new Home();
        getSupportFragmentManager().beginTransaction().add(R.id.area_pantalla, fragment).commit();
        fragmentManager = getSupportFragmentManager();
        transaccionFragment = fragmentManager.beginTransaction();
        transaccionFragment.replace(R.id.area_pantalla, fragment).commit();
    }

    private void mostrarRegistro() {
        fragment = new Registro();
        getSupportFragmentManager().beginTransaction().add(R.id.area_pantalla, fragment).commit();
        fragmentManager = getSupportFragmentManager();
        transaccionFragment = fragmentManager.beginTransaction();
        transaccionFragment.replace(R.id.area_pantalla, fragment).commit();
    }

    private void mostrarLogin() {
        fragment = new Login();
        getSupportFragmentManager().beginTransaction().add(R.id.area_pantalla, fragment).commit();
        fragmentManager = getSupportFragmentManager();
        transaccionFragment = fragmentManager.beginTransaction();
        transaccionFragment.replace(R.id.area_pantalla, fragment).commit();
    }

    private void mostrarBusqueda() {
        fragment = new Buscar();
        getSupportFragmentManager().beginTransaction().add(R.id.area_pantalla, fragment).commit();
        fragmentManager = getSupportFragmentManager();
        transaccionFragment = fragmentManager.beginTransaction();
        transaccionFragment.replace(R.id.area_pantalla, fragment).commit();
    }
}