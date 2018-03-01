package com.erasmusplus.project.yourfutureinyoursmartphone;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.gson.Gson;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.JsonHttpResponseHandler;
import com.loopj.android.http.RequestParams;

import org.json.JSONObject;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import cz.msebera.android.httpclient.Header;


public class Login extends Fragment {

    private static final String URL_LOGIN = "http://practicascursodam.esy.es/yourfuture/gson/login.php";

    private EditText email, pass;
    private Button boton;
    private AsyncHttpClient cliente;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.login, container, false);

        email = v.findViewById(R.id.login_email);
        pass = v.findViewById(R.id.login_password);
        boton = v.findViewById(R.id.login_boton);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String correo = email.getText().toString();
                String password = pass.getText().toString();

                if (correo.isEmpty()) {
                    email.setError("Debe rellenar este campo");
                } else {
                    if (password.isEmpty()) {
                        pass.setError("Debe rellenar este campo");
                    } else {

                        cliente = new AsyncHttpClient();
                        RequestParams rp = new RequestParams();
                        rp.put("email", correo);
                        rp.put("password", password);

                        cliente.get(URL_LOGIN, rp, new JsonHttpResponseHandler() {
                            @Override
                            public void onSuccess(int statusCode, Header[] headers, JSONObject response) {
                                if (statusCode == 200) {
                                    String respuesta = new String(response.toString());

                                    Gson gson = new Gson();
                                    Handler_login login = gson.fromJson(respuesta, Handler_login.class);

                                    String mensaje = login.getMessage();
                                    int res = login.getSuccess();

                                    if (res == 1) {
                                        try {
                                            PrintWriter flujo = new PrintWriter(new File(getActivity().getFilesDir(), MainActivity.FICHERO_LOGIN));
                                            PrintWriter filtro = new PrintWriter(flujo);
                                            filtro.println(email.getText().toString());
                                            filtro.close();
                                            flujo.close();
                                        } catch (IOException e) {
                                            e.printStackTrace();
                                        }
                                        Toast.makeText(getContext(), "Se ha logeado correctamente.", Toast.LENGTH_SHORT).show();
                                    } else
                                        Toast.makeText(getContext(), "Datos incorrectos.", Toast.LENGTH_SHORT).show();

                                }
                            }
                        });
                    }
                }
            }

        });


        return v;
    }
}
