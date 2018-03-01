package com.erasmusplus.project.yourfutureinyoursmartphone;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.loopj.android.http.RequestParams;


import cz.msebera.android.httpclient.Header;


public class GestorEmail extends AppCompatActivity {

    private static final String URL_EMAIL = "http://practicascursodam.esy.es/yourfuture/gson/enviar_email.php";

    private EditText areaTexto, asunto;
    private Button boton;
    private TextView labelDe, labelPara;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.enviar_email);

        areaTexto = findViewById(R.id.email_texto);
        boton = findViewById(R.id.boton_enviar_email);
        labelDe = findViewById(R.id.texto_from);
        labelPara = findViewById(R.id.texto_para);
        asunto = findViewById(R.id.email_asunto);

        final Bundle extras = getIntent().getExtras();

        final AsyncHttpClient client = new AsyncHttpClient();

        labelDe.setText(extras.get("DE").toString());
        labelPara.setText(extras.get("PARA").toString());

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RequestParams rp = new RequestParams();
                rp.put("remitente", extras.get("DE").toString());
                rp.put("destinatario", extras.get("PARA").toString());
                rp.put("asunto", asunto.getText().toString());
                rp.put("mensaje", areaTexto.getText().toString());

                client.get(URL_EMAIL,rp, new AsyncHttpResponseHandler(){

                    @Override
                    public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
                        if (statusCode==200) {
                            Toast.makeText(getApplicationContext(), "Email enviado correctamente", Toast.LENGTH_LONG).show();
                            finish();

                        }else {
                            Toast.makeText(getApplicationContext(), "Hubo un error al enviar el email", Toast.LENGTH_LONG);
                        }
                    }

                    @Override
                    public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {

                    }

                });
            }
        });
    }
}