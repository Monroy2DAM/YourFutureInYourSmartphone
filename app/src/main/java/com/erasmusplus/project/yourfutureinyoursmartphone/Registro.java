package com.erasmusplus.project.yourfutureinyoursmartphone;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.gson.Gson;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.loopj.android.http.JsonHttpResponseHandler;
import com.loopj.android.http.RequestParams;

import org.json.JSONObject;

import java.util.List;

import cz.msebera.android.httpclient.Header;

public class Registro extends Fragment {

    //==============================================================================================
    // CONSTANTES
    //==============================================================================================
    private static final String URL_OBTENER_PAISES = "http://practicascursodam.esy.es/yourfuture/gson/get_all_country.php";
    private static final String URL_OBTENER_AREAS = "http://practicascursodam.esy.es/yourfuture/gson/get_all_area.php";
    private static final String URL_OBTENER_TIPOS_PROYECTOS = "http://practicascursodam.esy.es/yourfuture/gson/get_all_ktype.php";
    private static final String URL_OBTENER_CORREO_CENTRO = "http://practicascursodam.esy.es/yourfuture/gson/get_institution_details_email.php";
    private static final String URL_OBTENER_CORREO_PERSONA = "http://practicascursodam.esy.es/yourfuture/gson/get_contact_person_details_email.php";
    private static final String URL_OBTENER_TIPOS_CENTROS = "http://practicascursodam.esy.es/yourfuture/gson/get_all_type.php";
    private static final String URL_REGISTRO_PERSONA = "http://practicascursodam.esy.es/yourfuture/gson/create_contact_person.php";
    private static final String URL_REGISTRO_CENTRO = "http://practicascursodam.esy.es/yourfuture/gson/create_institution.php";
    private static final String URL_REGISTRO_PROYECTO = "http://practicascursodam.esy.es/yourfuture/gson/create_project.php";

    //==============================================================================================
    // ATRIBUTOS
    //==============================================================================================
    // GSON.
    private Gson gson;
    private AsyncHttpClient cliente;

    // Países.
    private Handler_Paises paises;
    private Handler_Paises.YfINSTITUTIONBean pais;
    private List<Handler_Paises.YfINSTITUTIONBean> listaPaises;

    // Áreas.
    private Handler_Areas areas;
    private Handler_Areas.YfAREABean area;
    private List<Handler_Areas.YfAREABean> listaAreas;

    // Centros.
    private Handler_Centros centros;
    private Handler_Centros.YfINSTITUTIONBean centro;
    private List<Handler_Centros.YfINSTITUTIONBean> listaCentros;

    // Tipos proyectos.
    private Handler_TiposProyectos tiposProyectos;
    private Handler_TiposProyectos.YfKTYPEBean tipoProyecto;
    private List<Handler_TiposProyectos.YfKTYPEBean> listaTiposProyectos;

    // Tipos centros.
    private Handler_TiposCentros tiposCentros;
    private Handler_TiposCentros.YfTYPEBean tipoCentro;
    private List<Handler_TiposCentros.YfTYPEBean> listaTiposCentros;

    // Persona.
    private Personas personas;
    private Personas.Persona persona;
    private List<Personas.Persona> listaPersonas;

    private CrearCentro nuevoCentro;
    private CrearPersona nuevaPersona;
    private CrearProyecto nuevoProyecto;

    private String correoCentro, correoPersona;
    private String idCentro, idPersona;

    // Elementos de la vista.
    private CheckBox casillaCondiciones;
    private Button botonRegitrar;
    private EditText campoNombreCentro, campoDireccionCentro, campoCiudadCentro, campoCorreoCentro, campoPicCentro;
    private EditText campoNombrePersona, campoApellidosPersona, campoCorreoPersona, campoClavePersona, campoRepetirClavePersona;
    private EditText campoNombreProyecto;
    private Spinner spinnerPaises, spinnerAreas, spinnerTiposCentros, spinnerTiposProyectos;

    //==============================================================================================
    // CONSTRUCTOR
    //==============================================================================================
    public Registro() {
    }

    //==============================================================================================
    // MÉTODOS SOBREESCRITOS
    //==============================================================================================
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View vista;

        vista = inflater.inflate(R.layout.registro, container, false);

        spinnerPaises = vista.findViewById(R.id.spinner_paises);
        spinnerAreas = vista.findViewById(R.id.spinner_areas);
        spinnerTiposCentros = vista.findViewById(R.id.spinner_tipos_centros);
        spinnerTiposProyectos = vista.findViewById(R.id.spinner_tipos_proyectos);
        casillaCondiciones = vista.findViewById(R.id.casilla_condiciones);
        campoNombreCentro = vista.findViewById(R.id.campo_nombre_centro);
        campoDireccionCentro = vista.findViewById(R.id.campo_direccion);
        campoCiudadCentro = vista.findViewById(R.id.campo_ciudad);
        campoCorreoCentro = vista.findViewById(R.id.campo_correo_electronico_centro);
        campoPicCentro = vista.findViewById(R.id.campo_pic);
        campoNombrePersona = vista.findViewById(R.id.campo_nombre_persona);
        campoApellidosPersona = vista.findViewById(R.id.campo_apellidos);
        campoCorreoPersona = vista.findViewById(R.id.campo_correo_electronico_persona);
        campoClavePersona = vista.findViewById(R.id.campo_contrasenha);
        campoRepetirClavePersona = vista.findViewById(R.id.campo_repetir_constraseña);
        campoNombreProyecto = vista.findViewById(R.id.campo_nombre_proyecto);
        botonRegitrar = vista.findViewById(R.id.boton_registro);

        cargarSpinners();

        cliente = new AsyncHttpClient();

        botonRegitrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crearCentro();
            }

            private void crearCentro() {
                RequestParams parametrosRegistroCentro;

                if (!casillaCondiciones.isChecked()) {
                    Toast.makeText(getContext(), "No has aceptado las condiciones.", Toast.LENGTH_LONG).show();

                } else {
                    if (!campoClavePersona.getText().toString().equals(campoRepetirClavePersona.getText().toString())) {
                        Toast.makeText(getContext(), "La contraseña no coincide.", Toast.LENGTH_LONG).show();

                    } else {
                        parametrosRegistroCentro = new RequestParams();
                        correoCentro = campoCorreoCentro.getText().toString();
                        parametrosRegistroCentro.put("EMAIL", correoCentro);
                        parametrosRegistroCentro.put("NAME", campoNombreCentro.getText().toString());
                        parametrosRegistroCentro.put("STREET", campoDireccionCentro.getText().toString());
                        parametrosRegistroCentro.put("CITY", campoCiudadCentro.getText().toString());
                        parametrosRegistroCentro.put("COUNTRY", pais.getCOUNTRY());
                        parametrosRegistroCentro.put("TYPE", tipoCentro.getID());

                        cliente.post(URL_REGISTRO_CENTRO, parametrosRegistroCentro, new JsonHttpResponseHandler() {

                            @Override
                            public void onSuccess(int statusCode, Header[] headers, JSONObject response) {
                                String respuesta, mensaje;
                                int exito;

                                if (statusCode == 200) {
                                    respuesta = new String(response.toString());
                                    gson = new Gson();

                                    nuevoCentro = gson.fromJson(respuesta, CrearCentro.class);
                                    exito = nuevoCentro.getSuccess();
                                    mensaje = nuevoCentro.getMessage();

                                    if (exito == 1) {
                                        Toast.makeText(getContext(), "Se ha registrado el centro.\n" + mensaje, Toast.LENGTH_LONG).show();
                                        localizarCentro();

                                    } else {
                                        Toast.makeText(getContext(), "No se ha podido registrar el centro.\n" + mensaje, Toast.LENGTH_LONG).show();
                                    }
                                }
                            }
                        });
                    }
                }
            }

            private void localizarCentro() {
                RequestParams parametrosBusquedaCentro;

                parametrosBusquedaCentro = new RequestParams();
                parametrosBusquedaCentro.put("email", correoCentro);

                cliente.get(URL_OBTENER_CORREO_CENTRO, parametrosBusquedaCentro, new JsonHttpResponseHandler() {

                    @Override
                    public void onSuccess(int statusCode, Header[] headers, JSONObject response) {
                        String respuesta;
                        int exito;

                        if (statusCode == 200) {
                            respuesta = new String(response.toString());
                            gson = new Gson();

                            centros = gson.fromJson(respuesta, Handler_Centros.class);
                            exito = centros.getSuccess();

                            if (exito == 1) {
                                listaCentros = centros.getYf_INSTITUTION();
                                centro = listaCentros.get(0);
                                idCentro = centro.getID();

                                crearPersona();

                            } else {
                                Toast.makeText(getContext(), "No se puede registrar la persona de contacto.", Toast.LENGTH_LONG).show();
                            }
                        }
                    }
                });
            }

            private void crearPersona() {
                RequestParams parametroRegistroPersona;

                parametroRegistroPersona = new RequestParams();
                correoPersona = campoCorreoPersona.getText().toString();
                parametroRegistroPersona.put("EMAIL", correoPersona);
                parametroRegistroPersona.put("NAME", campoNombrePersona.getText().toString());
                parametroRegistroPersona.put("LASTNAME", campoApellidosPersona.getText().toString());
                parametroRegistroPersona.put("AREA", area.getID());
                parametroRegistroPersona.put("PASSWORD", campoClavePersona.getText().toString());
                parametroRegistroPersona.put("IDINST", idCentro);

                cliente.post(URL_REGISTRO_PERSONA, parametroRegistroPersona, new JsonHttpResponseHandler() {

                    @Override
                    public void onSuccess(int statusCode, Header[] headers, JSONObject response) {
                        String respuesta, mensaje;
                        int exito;

                        if (statusCode == 200) {
                            respuesta = new String(response.toString());
                            gson = new Gson();

                            nuevaPersona = gson.fromJson(respuesta, CrearPersona.class);
                            exito = nuevaPersona.getSuccess();
                            mensaje = nuevaPersona.getMessage();

                            if (exito == 1) {
                                Toast.makeText(getContext(), "Se ha registrado a la persona de contacto.\n" + mensaje, Toast.LENGTH_LONG).show();

                                localizarPersona();

                            } else {
                                Toast.makeText(getContext(), "No se ha podido registrar a la persona de contacto.\n" + mensaje, Toast.LENGTH_LONG).show();
                            }
                        }
                    }
                });
            }

            private void localizarPersona() {
                RequestParams parametrosBusquedaPersona;

                parametrosBusquedaPersona = new RequestParams();
                parametrosBusquedaPersona.put("email", correoPersona);

                cliente.get(URL_OBTENER_CORREO_PERSONA, parametrosBusquedaPersona, new JsonHttpResponseHandler() {

                    @Override
                    public void onSuccess(int statusCode, Header[] headers, JSONObject response) {
                        String respuesta;
                        int exito;

                        if (statusCode == 200) {
                            respuesta = new String(response.toString());
                            gson = new Gson();

                            personas = gson.fromJson(respuesta, Personas.class);
                            exito = personas.getExito();

                            if (exito == 1) {
                                listaPersonas = personas.getListaPersonas();
                                persona = listaPersonas.get(0);
                                idPersona = persona.getIdPersona();

                                crearProyecto();
                            }
                        }
                    }
                });
            }

            private void crearProyecto() {
                RequestParams parametrosRegistroProyecto;

                parametrosRegistroProyecto = new RequestParams();
                parametrosRegistroProyecto.put("NAME", campoNombreProyecto.getText().toString());
                parametrosRegistroProyecto.put("IDCONTACT", idPersona);
                parametrosRegistroProyecto.put("KTYPE", tipoProyecto.getID());

                cliente.post(URL_REGISTRO_PROYECTO, parametrosRegistroProyecto, new JsonHttpResponseHandler() {

                    @Override
                    public void onSuccess(int statusCode, Header[] headers, JSONObject response) {
                        String respuesta, mensaje;
                        int exito;

                        if (statusCode == 200) {
                            respuesta = new String(response.toString());
                            gson = new Gson();

                            nuevoProyecto = gson.fromJson(respuesta, CrearProyecto.class);
                            exito = nuevoProyecto.getSuccess();
                            mensaje = nuevoProyecto.getMessage();

                            if (exito == 1) {
                                Toast.makeText(getContext(), "Se ha registrado el proyecto.\n" + mensaje, Toast.LENGTH_LONG).show();

                            } else {
                                Toast.makeText(getContext(), "No se ha podido registrar el proyecto.\n" + mensaje, Toast.LENGTH_LONG).show();
                            }
                        }
                    }
                });
            }
        });
        return vista;
    }

    private void cargarSpinners() {
        cliente = new AsyncHttpClient();

        cargarSpinnerPaises(cliente);
        cargarSpinnerAreas(cliente);
        cargarSpinnerTiposCentros(cliente);
        cargarSpinnerTiposProyectos(cliente);
    }

    private void cargarSpinnerTiposProyectos(AsyncHttpClient cliente) {
        cliente.get(this.getContext(), URL_OBTENER_TIPOS_PROYECTOS, new AsyncHttpResponseHandler() {

            @Override
            public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
                String valorDevuelto;
                ArrayAdapter<Handler_TiposProyectos.YfKTYPEBean> adaptador;

                valorDevuelto = new String(responseBody);
                gson = new Gson();
                tiposProyectos = gson.fromJson(valorDevuelto, Handler_TiposProyectos.class);
                listaTiposProyectos = tiposProyectos.getYf_KTYPE();

                adaptador = new ArrayAdapter<>(getActivity(), android.R.layout.simple_spinner_dropdown_item, listaTiposProyectos);
                adaptador.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                spinnerTiposProyectos.setAdapter(adaptador);
                spinnerTiposProyectos.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        tipoProyecto = (Handler_TiposProyectos.YfKTYPEBean) spinnerTiposProyectos.getItemAtPosition(position);
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {
                    }
                });
            }

            @Override
            public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {
            }
        });
    }

    private void cargarSpinnerTiposCentros(AsyncHttpClient cliente) {
        cliente.get(this.getContext(), URL_OBTENER_TIPOS_CENTROS, new AsyncHttpResponseHandler() {

            @Override
            public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
                String valorDevuelto;
                ArrayAdapter<Handler_TiposCentros.YfTYPEBean> adaptador;

                valorDevuelto = new String(responseBody);
                gson = new Gson();
                tiposCentros = gson.fromJson(valorDevuelto, Handler_TiposCentros.class);
                listaTiposCentros = tiposCentros.getYf_TYPE();

                adaptador = new ArrayAdapter<>(getActivity(), android.R.layout.simple_spinner_dropdown_item, listaTiposCentros);
                adaptador.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                spinnerTiposCentros.setAdapter(adaptador);
                spinnerTiposCentros.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        tipoCentro = (Handler_TiposCentros.YfTYPEBean) spinnerTiposCentros.getItemAtPosition(position);
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {
                    }
                });
            }

            @Override
            public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {
            }
        });
    }

    private void cargarSpinnerAreas(AsyncHttpClient cliente) {
        cliente.get(this.getContext(), URL_OBTENER_AREAS, new AsyncHttpResponseHandler() {

            @Override
            public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
                String valorDevuelto;
                ArrayAdapter<Handler_Areas.YfAREABean> adaptador;

                valorDevuelto = new String(responseBody);
                gson = new Gson();
                areas = gson.fromJson(valorDevuelto, Handler_Areas.class);
                listaAreas = areas.getYf_AREA();

                adaptador = new ArrayAdapter<>(getActivity(), android.R.layout.simple_spinner_dropdown_item, listaAreas);
                adaptador.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                spinnerAreas.setAdapter(adaptador);
                spinnerAreas.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        area = (Handler_Areas.YfAREABean) spinnerAreas.getItemAtPosition(position);
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {
                    }
                });
            }

            @Override
            public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {
            }
        });
    }

    private void cargarSpinnerPaises(AsyncHttpClient cliente) {
        cliente.get(this.getContext(), URL_OBTENER_PAISES, new AsyncHttpResponseHandler() {

            @Override
            public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
                String valorDevuelto;
                ArrayAdapter<Handler_Paises.YfINSTITUTIONBean> adaptador;

                valorDevuelto = new String(responseBody);
                gson = new Gson();
                paises = gson.fromJson(valorDevuelto, Handler_Paises.class);
                listaPaises = paises.getYf_INSTITUTION();

                adaptador = new ArrayAdapter<>(getActivity(), android.R.layout.simple_spinner_dropdown_item, listaPaises);
                adaptador.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                spinnerPaises.setAdapter(adaptador);
                spinnerPaises.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        pais = (Handler_Paises.YfINSTITUTIONBean) spinnerPaises.getItemAtPosition(position);
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {
                    }
                });
            }

            @Override
            public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {
            }
        });
    }
}