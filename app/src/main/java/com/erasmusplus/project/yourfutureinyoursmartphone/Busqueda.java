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

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

import cz.msebera.android.httpclient.Header;

public class Busqueda extends AppCompatActivity {

    private ListView lista;
    private AdaptadorSocios adaptador;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lista_socios);

        lista = findViewById(R.id.listaContactos);
        Bundle extras = getIntent().getExtras();
        List<Handler_Contactos.YfRESULTADOBean> listaContactos = (List<Handler_Contactos.YfRESULTADOBean>) extras.get("LISTA");

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
                try {

                    FileReader flujo = new FileReader(getFilesDir() + "/" + MainActivity.FICHERO_LOGIN);
                    BufferedReader filtro = new BufferedReader(flujo);

                    String email = filtro.readLine();

                    filtro.close();
                    flujo.close();

                    Intent i = new Intent(getApplication(), GestorEmail.class);

                    Handler_Contactos.YfRESULTADOBean destinatario = (Handler_Contactos.YfRESULTADOBean)
                            adaptador.getItem(position);

                    i.putExtra("DE", email);
                    i.putExtra("PARA", destinatario.getEMAIL().toString());

                    startActivity(i);

                } catch (java.io.IOException e) {
                    e.printStackTrace();
                }




            }
        });
    }
}
