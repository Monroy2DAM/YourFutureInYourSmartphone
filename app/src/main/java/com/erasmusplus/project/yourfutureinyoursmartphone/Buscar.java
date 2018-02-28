package com.erasmusplus.project.yourfutureinyoursmartphone;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import com.google.gson.Gson;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;

import java.util.List;

import cz.msebera.android.httpclient.Header;

public class Buscar extends Fragment {

    public static final String URL_PAIS = "http://practicascursodam.esy.es/yourfuture/gson/get_all_country.php";
    public static final String URL_AREAS = "http://practicascursodam.esy.es/yourfuture/gson/get_all_area.php";
    public static final String URL_CENTROS = "http://practicascursodam.esy.es/yourfuture/gson/get_all_institution.php";
    public static final String URL_PROYECTOS = "http://practicascursodam.esy.es/yourfuture/gson/get_all_project.php";
    public static final String URL_KTYPE = "http://practicascursodam.esy.es/yourfuture/gson/get_all_ktype.php";
    public static final String URL_LTYPE = "http://practicascursodam.esy.es/yourfuture/gson/get_all_type.php";
    public static final String URL_SOCIOS = "http://practicascursodam.esy.es/yourfuture/gson/get_all_contact_person_busqueda.php";

    private Spinner spPais, spArea, spCentro, spProyecto;
    private Button boton;
    private AsyncHttpClient cliente;

    private Handler_Paises.YfINSTITUTIONBean pais;
    private Handler_Areas.YfAREABean area;
    private Handler_Centros.YfINSTITUTIONBean centro;
    private Handler_Proyectos.YfPROJECTBean proyecto;
    private Handler_Ktype.YfKTYPEBean kType;
    private Handler_Ltype.YfTYPEBean typo;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View v = inflater.inflate(R.layout.buscar, container, false);

        spPais = v.findViewById(R.id.buscar_pais);
        spArea = v.findViewById(R.id.buscar_area);
        spCentro = v.findViewById(R.id.buscar_centro);
        spProyecto = v.findViewById(R.id.buscar_tipo_proyecto);
        boton = v.findViewById(R.id.buscar_boton);
        cliente = new AsyncHttpClient();

        cargarSpinnerPais();
        cargarSpinnerArea();
        //cargarSpinnerLtype();
        cargarSpinnerKtype();

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {

                Context context = v.getContext();

                Intent intent = new Intent(context.getApplicationContext(), Busqueda.class);
                intent.putExtra("COUNTRY", pais.getCOUNTRY().toString());
                intent.putExtra("KTYPE", kType.getID().toString());
                intent.putExtra("AREA", area.getID().toString());
                intent.putExtra("TYPE", typo.getID().toString());

                context.startActivity(intent);
            }
        });

        return v;
    }

    private void cargarSpinnerPais(){
        cliente.get(this.getContext(), URL_PAIS,new AsyncHttpResponseHandler() {
            @Override
            public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
                String valorDevuelto = new String(responseBody);

                Gson gson = new Gson();
                Handler_Paises paises = gson.fromJson(valorDevuelto, Handler_Paises.class);

                List<Handler_Paises.YfINSTITUTIONBean> listaPaises = paises.getYf_INSTITUTION();

                ArrayAdapter<Handler_Paises.YfINSTITUTIONBean> adapter = new ArrayAdapter<>(getActivity(),
                        android.R.layout.simple_spinner_dropdown_item, listaPaises);

                adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                spPais.setAdapter(adapter);

                spPais.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        pais = (Handler_Paises.YfINSTITUTIONBean) spPais.getItemAtPosition(position);
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });

            }
            @Override
            public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {            }
        });
    }

    private void cargarSpinnerArea(){
        cliente.get(this.getContext(), URL_AREAS,new AsyncHttpResponseHandler() {
            @Override
            public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
                String valorDevuelto = new String(responseBody);

                Gson gson = new Gson();
                Handler_Areas areas = gson.fromJson(valorDevuelto, Handler_Areas.class);

                List<Handler_Areas.YfAREABean> listaAreas = areas.getYf_AREA();

                ArrayAdapter<Handler_Areas.YfAREABean> adapter = new ArrayAdapter<>(getActivity(),
                        android.R.layout.simple_spinner_dropdown_item, listaAreas);

                adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                spArea.setAdapter(adapter);
                spArea.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        area = (Handler_Areas.YfAREABean) spArea.getItemAtPosition(position);
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });

            }
            @Override
            public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {            }
        });
    }

    private void cargarSpinnerLtype(){
        cliente.get(this.getContext(), URL_KTYPE,new AsyncHttpResponseHandler() {
            @Override
            public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
                String valorDevuelto = new String(responseBody);

                Gson gson = new Gson();
                Handler_Ltype typos = gson.fromJson(valorDevuelto, Handler_Ltype.class);

                List<Handler_Ltype.YfTYPEBean> listaTypos = typos.getYf_TYPE();

                ArrayAdapter<Handler_Ltype.YfTYPEBean> adapter = new ArrayAdapter<>(getActivity(),
                        android.R.layout.simple_spinner_dropdown_item, listaTypos);

                adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                spCentro.setAdapter(adapter);

                spCentro.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        typo = (Handler_Ltype.YfTYPEBean) spCentro.getItemAtPosition(position);
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });
            }
            @Override
            public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {            }
        });
    }

    private void cargarSpinnerKtype(){
        cliente.get(this.getContext(), URL_KTYPE,new AsyncHttpResponseHandler() {
            @Override
            public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
                String valorDevuelto = new String(responseBody);

                Gson gson = new Gson();
                Handler_Ktype ktypes = gson.fromJson(valorDevuelto, Handler_Ktype.class);

                List<Handler_Ktype.YfKTYPEBean> listaKTypes = ktypes.getYf_KTYPE();

                ArrayAdapter<Handler_Ktype.YfKTYPEBean> adapter = new ArrayAdapter<>(getActivity(),
                        android.R.layout.simple_spinner_dropdown_item, listaKTypes);

                adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                spProyecto.setAdapter(adapter);

                spProyecto.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        kType = (Handler_Ktype.YfKTYPEBean) spProyecto.getItemAtPosition(position);
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });

            }
            @Override
            public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {            }
        });
    }
}
