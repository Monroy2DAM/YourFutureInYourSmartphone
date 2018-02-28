package com.erasmusplus.project.yourfutureinyoursmartphone;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
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
        // Inicializamos las variables
        lista = findViewById(R.id.listaContactos);
        Bundle extras = getIntent().getExtras();
        List<Handler_Contactos.YfRESULTADOBean> listaContactos = (List<Handler_Contactos.YfRESULTADOBean>) extras.get("LISTA");
        //AdaptadorBD db = new AdaptadorBD(getApplicationContext());
        AsyncHttpClient cliente = new AsyncHttpClient();

        // Creamos los parametros para la consulta cogiendolos del bundle del intent
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
                        // Todo bien, recogemos la lista del objeto gson
                        List<Handler_Contactos.YfRESULTADOBean> listaContactos = contactos.getYf_RESULTADO();
                        // Inicializamos el adaptador de pantalla pasandole la lista
                        adaptador = new AdaptadorSocios(Busqueda.this, listaContactos);
                        // Y le ponemos el adaptador a nuestra lista
                        lista.setAdapter(adaptador);
                        // Indicamos que todo ha ido bien
                        Toast.makeText(getApplicationContext(), "TODO OK ", Toast.LENGTH_LONG).show();
                    } else {
                        // Si algo ha fallado mostramos un mensaje de error
                        Toast.makeText(getApplicationContext(), "Error", Toast.LENGTH_LONG).show();
                    }
                }


            }
        });
    }
}
