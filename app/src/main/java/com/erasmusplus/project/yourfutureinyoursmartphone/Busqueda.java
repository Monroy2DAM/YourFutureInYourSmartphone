package com.erasmusplus.project.yourfutureinyoursmartphone;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.JsonHttpResponseHandler;
import com.loopj.android.http.RequestParams;

import org.json.JSONObject;

import java.util.List;

import cz.msebera.android.httpclient.Header;

public class Busqueda extends AppCompatActivity {

    // Todo disimular elemento_lista_socio

    private ListView lista;
    private AdaptadorSocios adaptador;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lista_socios);

        lista = findViewById(R.id.listaContactos);
        Bundle extras = getIntent().getExtras();
        List<Handler_Contactos.YfRESULTADOBean> listaContactos = (List<Handler_Contactos.YfRESULTADOBean>) extras.get("LISTA");


        //AdaptadorBD db = new AdaptadorBD(getApplicationContext());
        AsyncHttpClient cliente = new AsyncHttpClient();

        RequestParams rp = new RequestParams();
        rp.put("COUNTRY", extras.get("COUNTRY").toString());
        rp.put("KTYPE", extras.get("KTYPE").toString());
        rp.put("AREA", extras.get("AREA").toString());
        rp.put("TYPE", extras.get("TYPE").toString());

        cliente.get(Buscar.URL_SOCIOS, rp, new JsonHttpResponseHandler() {

            @Override
            public void onSuccess(int statusCode, Header[] headers, JSONObject response) {
                if (statusCode == 200) {
                    String respuesta = new String(response.toString());
                    Gson gson = new Gson();
                    Handler_Contactos contactos = gson.fromJson(respuesta, Handler_Contactos.class);

                    int res = contactos.getSuccess();
                    if (res == 1) {
                        List<Handler_Contactos.YfRESULTADOBean> listaContactos = contactos.getYf_RESULTADO();
                        adaptador = new AdaptadorSocios(Busqueda.this, listaContactos);
                        lista.setAdapter(adaptador);
                    } else {
                        Toast.makeText(getApplicationContext(), "No hay resultados", Toast.LENGTH_LONG).show();
                    }
                }
            }
        });

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                String email;
//                // Abrimos la base de datos para recoger el email de la persona que está logueada
//                db.open();
//                email = db.getLogin(1).getString(2);
//                db.close();
//                // Creamos un intent
//                Intent intent = new Intent(getApplication(), EnviarEmail.class);
//                // Cogemos a la persona de contacto correspondiente al elemento pulsado
//                PersonaContacto.YfRESULTADOBean nuevoContacto = (PersonaContacto.YfRESULTADOBean)
//                        adaptador.getItem(position);
//                // Le pasamos al intent como paquete el email de la persona interesada y el del contacto
//                intent.putExtra("DE", email);
//                intent.putExtra("PARA", nuevoContacto.getEMAIL().toString());
//                // Arrancamos el intent
//                startActivity(intent);


            }
        });
    }
}
