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
    // VARIABLES
    //==============================================================================================
    // GSON.
    Gson gson;
    AsyncHttpClient cliente1, cliente2, cliente3;



    // URLs JSON.
    String urlPaises = "http://practicascursodam.esy.es/yourfuture/gson/get_all_country.php";
    String urlAreas = "http://practicascursodam.esy.es/yourfuture/gson/get_all_area.php";
    //String urlCentros = "http://practicascursodam.esy.es/yourfuture/gson/get_all_institution.php";
    //String urlProyectos = "http://practicascursodam.esy.es/yourfuture/gson/get_all_project.php";
    String urlRegistroPersona = "http://practicascursodam.esy.es/yourfuture/gson/create_contact_person.php";
    String urlRegistroCentro = "http://practicascursodam.esy.es/yourfuture/gson/create_institution.php";
    String urlRegistroProyecto = "http://practicascursodam.esy.es/yourfuture/gson/create_project.php";
    String urlTiposProyectos = "http://practicascursodam.esy.es/yourfuture/gson/get_all_ktype.php";
    String urlInstitucionEmail = "http://practicascursodam.esy.es/yourfuture/gson/get_institution_details_email.php";
    String urlContactoEmail = "http://practicascursodam.esy.es/yourfuture/gson/get_contact_person_details_email.php";
    String urlTiposCentros = "http://practicascursodam.esy.es/yourfuture/gson/get_all_type.php";

    Paises paises;
    Paises.YfINSTITUTIONBean pais;
    List<Paises.YfINSTITUTIONBean> listaPaises;

    Areas areas;
    Areas.Area area;
    List<Areas.Area> listaAreas;

    Centros centros;
    Centros.Centro centro;
    List<Centros.Centro> listaCentros;

    //Proyectos proyectos;
    //Proyectos.Proyecto proyecto;
    //List<Proyectos.Proyecto> listaProyectos;

    TiposProyectos tiposProyectos;
    TiposProyectos.TipoProyecto tipoProyecto;
    List<TiposProyectos.TipoProyecto> listaTiposProyectos;

    TiposCentros tiposCentros;
    TiposCentros.TipoCentro tipoCentro;
    List<TiposCentros.TipoCentro> listaTiposCentros;

    Personas personaContacto;
    Personas.Persona personaC;
    List<Personas.Persona> listaPersonaContacto;

    CrearCentro nuevoCentro;
    CrearPersona nuevaPersona;
    CrearProyecto nuevoProyecto;

    String emailInstitucion, emailContacto;
    String idInstitucion, idPersona;

    // Elementos de la vista.
    CheckBox casillaCondiciones;
    Button botonRegitrar;
    EditText campoNombreCentro, campoDireccionCentro, campoCiudadCentro, campoCorreoCentro, campoPicCentro;
    EditText campoNombrePersona, campoApellidosPersona, campoCorreoPersona, campoClavePersona, campoRepetirClavePersona;
    EditText campoNombreProyecto;
    Spinner spinnerPaises, spinnerAreas, spinnerTiposCentros, spinnerTiposProyectos;

    //==============================================================================================
    // CONSTRUCTOR
    //==============================================================================================
    public Registro() {}

    //==============================================================================================
    // MÉTODOS SOBREESCRITOS
    //==============================================================================================
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View vista;

        // Se asocia el fragment a su vista.
        vista = inflater.inflate(R.layout.registro, container, false);

        // Se inicializan los elementos visuales.
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

        // Se cargan los spinners.
        cargarSpinners();

        // Escuchador al boton
        botonRegitrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crearInstitucion();
            }
            private void crearInstitucion() {
                // Comprobamos que el checkbox de las condiciones está marcado
                if (!casillaCondiciones.isChecked()) {
                    // Si no lo esta le indicamos que debe de aceptarlo
                    Toast.makeText(getContext(), "Debe aceptar las condiciones para avanzar", Toast.LENGTH_LONG).show();
                } else {
                    // Si las condiciones han sido aceptado comprobamos que los passwords introducidos
                    // son iguales
                    if (!campoClavePersona.getText().toString().equals(campoRepetirClavePersona.getText().toString())) {
                        // Si no lo son se lo indicamos al usuario
                        Toast.makeText(getContext(), "Las contraseñas deben coincidir", Toast.LENGTH_LONG).show();
                    } else {
                        // Creamos los parametros para la el primer registro (institucion)
                        RequestParams rp = new RequestParams();
                        // Iniciamos el cliente1 asyn
                        cliente2 = new AsyncHttpClient();
                        // Recogemos los parametros de los campos introducidos y los vamos poniendo en el
                        // paquete de parametros
                        emailInstitucion = campoCorreoCentro.getText().toString();
                        rp.put("EMAIL", emailInstitucion);
                        rp.put("NAME", campoNombreCentro.getText().toString());
                        rp.put("STREET", campoDireccionCentro.getText().toString());
                        rp.put("CITY", campoCiudadCentro.getText().toString());
                        rp.put("COUNTRY", pais.getCOUNTRY().toString());
                        rp.put("TYPE", tipoCentro.getIdTipoCentro());
                        // Enviamos los parametros al servidor
                        cliente2.post(urlRegistroCentro, rp, new JsonHttpResponseHandler() {
                            @Override
                            public void onSuccess(int statusCode, Header[] headers, JSONObject response) {
                                if (statusCode == 200) {
                                    //Recogemos la respuesta del servidor si todo ha ido bien
                                    String respuesta = new String(response.toString());
                                    // Creamos el objeto gson
                                    gson = new Gson();
                                    // Recogemos de la respuesta el centro
                                    nuevoCentro = gson.fromJson(respuesta, CrearCentro.class);
                                    // Y el success
                                    int res = nuevoCentro.getExito();
                                    String mensaje = nuevoCentro.getMensaje();
                                    if (res == 1) {
                                        // Indicamos que todo ha ido bien
                                        Toast.makeText(getContext(), "Centro creado correctamente " + mensaje, Toast.LENGTH_LONG).show();
                                        // Y localizamos la institucion recien creada
                                        localizarInstitucion();
                                    } else {
                                        Toast.makeText(getContext(), "Error " + mensaje, Toast.LENGTH_LONG).show();
                                    }
                                }
                            }
                        });

                    }
                }
            }

            /**
             * Metodo que localiza la institucion recien creada y pasa a crear el nuevo usuario
             */
            private void localizarInstitucion() {
                // Creamos los parametros y le pasamos el email de la institucion
                RequestParams rp2 = new RequestParams();
                rp2.put("email", emailInstitucion);
                // Creamos el cliente1 asyn
                cliente3 = new AsyncHttpClient();
                // Realizamos la consutla para localizar la institucion por su email
                cliente3.get(urlInstitucionEmail, rp2, new JsonHttpResponseHandler() {
                    @Override
                    public void onSuccess(int statusCode, Header[] headers, JSONObject response) {
                        if (statusCode == 200) {
                            // Todo bien recogemos la respuesta
                            String respuesta = new String(response.toString());
                            // Iniciamos el objeto Gson
                            gson = new Gson();
                            // Recogemos los centros devueltos y el success
                            centros = gson.fromJson(respuesta, Centros.class);
                            int res = centros.getExito();
                            if (res == 1) {
                                // Avisamos que se ha recogido bien el centro
                                Toast.makeText(getContext(), "Centro recogido ok ", Toast.LENGTH_LONG).show();
                                // Cogemos la lista de centros
                                listaCentros = centros.getListaCentros();
                                // De la lista cogemos el primero
                                centro = listaCentros.get(0);
                                // Y recogemos el ide
                                idInstitucion = centro.getIdCentro();
                                // Pasamos a crear la persona
                                altaPersonaContacto();
                                Toast.makeText(getContext(), idInstitucion, Toast.LENGTH_LONG);
                            } else {
                                // Avisamos del error si ha ido mal algo
                                Toast.makeText(getContext(), "Error no existen centros", Toast.LENGTH_LONG).show();
                            }
                        }
                    }
                });
            }

            /**
             * Metodo para dar de alta a la persona de contacto
             */
            private void altaPersonaContacto() {
                // Creamos los parametros y los vamos colocando
                RequestParams rp3 = new RequestParams();
                emailContacto = campoCorreoPersona.getText().toString();
                rp3.put("EMAIL", emailContacto);
                rp3.put("NAME", campoNombrePersona.getText().toString());
                rp3.put("LASTNAME", campoApellidosPersona.getText().toString());
                rp3.put("AREA", area.getIdArea().toString());
                rp3.put("PASSWORD", campoClavePersona.getText().toString());
                rp3.put("IDINST", idInstitucion);
                // Iniciamos la creacion de la nueva persona en el servidor
                cliente2.post(urlRegistroPersona, rp3, new JsonHttpResponseHandler() {
                    @Override
                    public void onSuccess(int statusCode, Header[] headers, JSONObject response) {
                        if (statusCode == 200) {
                            // Todo bien, recogemos la respuesta
                            String respuesta = new String(response.toString());
                            // Creamos el objeto Gson
                            gson = new Gson();
                            // Recogemos la persona y el success
                            nuevaPersona = gson.fromJson(respuesta, CrearPersona.class);
                            int res = nuevaPersona.getExito();
                            String mensaje = nuevaPersona.getMensaje();
                            if (res == 1) {
                                // Indicamos que la persona ha sido registrada con exito
                                Toast.makeText(getContext(), "Persona creada correctamente " + mensaje, Toast.LENGTH_LONG).show();
                                // Localizamos la persona recien creada
                                localizarContacto();
                            } else {
                                // Si no se ha podido crear informamos del error
                                Toast.makeText(getContext(), "Error " + mensaje, Toast.LENGTH_LONG).show();
                            }
                        }
                    }
                });
            }

            /**
             * Metodo para localizar la persona creada recientemente
             */
            private void localizarContacto() {
                // Creamos los parametros para la busqueda con el email
                RequestParams rp4 = new RequestParams();
                rp4.put("email", emailContacto);
                // Realizamos la consulta al servidor
                cliente3.get(urlContactoEmail, rp4, new JsonHttpResponseHandler() {
                    @Override
                    public void onSuccess(int statusCode, Header[] headers, JSONObject response) {
                        if (statusCode == 200) {
                            // Todo bien recogemos la respuesta
                            String respuesta = new String(response.toString());
                            // Creamos el objeto Gson
                            gson = new Gson();
                            // Recogmeos de la repuesta la persona y el success
                            personaContacto = gson.fromJson(respuesta, Personas.class);
                            int res = personaContacto.getExito();
                            if (res == 1) {
                                // Si todo va bien mostramos el mensaje
                                Toast.makeText(getContext(), "Persona recogida ok ", Toast.LENGTH_LONG).show();
                                // Recogemos la lista de personas
                                listaPersonaContacto = personaContacto.getListaPersonas();
                                // Recogemos la persona
                                personaC = listaPersonaContacto.get(0);
                                // Y cogemos su id
                                idPersona = personaC.getIdPersona();
                                // Pasamos a dar de alta al proyecto
                                altaProyecto();
                            }
                        }
                    }
                });
            }

            /**
             * Metodo para dar de alta al proyecto
             */
            private void altaProyecto() {
                // Creamos los parametros
                RequestParams rp5 = new RequestParams();
                rp5.put("NAME", campoNombreProyecto.getText().toString());
                rp5.put("IDCONTACT", idPersona);
                rp5.put("KTYPE", tipoProyecto.getIdTipoProyecto().toString());
                // Realizamos el envido de datos al servidor para el alta
                cliente2.post(urlRegistroProyecto,rp5, new JsonHttpResponseHandler(){
                    @Override
                    public void onSuccess(int statusCode, Header[] headers, JSONObject response) {
                        if (statusCode==200){
                            // Recogemos la respuesta
                            String respuesta = new String(response.toString());
                            // Creamos el objeto Gson
                            gson = new Gson();
                            // Recogemos el proyecto y e success
                            nuevoProyecto = gson.fromJson(respuesta, CrearProyecto.class);
                            int res = nuevoProyecto.getExito();
                            String mensaje = nuevoProyecto.getMensaje();
                            if (res==1){
                                // Si todo va bien informamos de la creacion del proyecto
                                Toast.makeText(getContext(), "Proyecto creado correctamente "+mensaje, Toast.LENGTH_LONG).show();}
                            else {
                                // Si algo falla lo indicamos
                                Toast.makeText(getContext(), "Error "+ mensaje, Toast.LENGTH_LONG).show();
                            }
                        }
                    }
                });
            }
        });
        return vista;
    }

    private void cargarSpinners() {
        cliente1 = new AsyncHttpClient();

        cliente1.get(this.getContext(), urlPaises, new AsyncHttpResponseHandler() {
            @Override
            public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
                String valorDevuelto = new String(responseBody);
                gson = new Gson();
                paises = gson.fromJson(valorDevuelto, Paises.class);
                listaPaises = paises.getYf_INSTITUTION();
                ArrayAdapter<Paises.YfINSTITUTIONBean> adapter = new ArrayAdapter<>(getActivity(),
                        android.R.layout.simple_spinner_dropdown_item, listaPaises);
                adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                spinnerPaises.setAdapter(adapter);
                spinnerPaises.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        pais = (Paises.YfINSTITUTIONBean) spinnerPaises.getItemAtPosition(position);
                    }
                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {}
                });
            }
            @Override
            public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {            }
        });
        cliente1.get(this.getContext(), urlAreas,new AsyncHttpResponseHandler() {
            @Override
            public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
                String valorDevuelto = new String(responseBody);
                gson = new Gson();
                areas = gson.fromJson(valorDevuelto, Areas.class);
                listaAreas = areas.getListaAreas();
                ArrayAdapter<Areas.Area> adapter = new ArrayAdapter<>(getActivity(),
                        android.R.layout.simple_spinner_dropdown_item, listaAreas);
                adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                /*spinnerAreas.setAdapter(adapter);
                spinnerAreas.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        area = (Areas.Area) spinnerAreas.getItemAtPosition(position);
                    }
                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {}
                });*/
            }
            @Override
            public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {            }
        });
        cliente1.get(this.getContext(), urlTiposCentros,new AsyncHttpResponseHandler() {
            @Override
            public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
                String valorDevuelto = new String(responseBody);
                gson = new Gson();
                tiposCentros = gson.fromJson(valorDevuelto, TiposCentros.class);
                listaTiposCentros = tiposCentros.getListaTiposCentros();
                ArrayAdapter<TiposCentros.TipoCentro> adapter = new ArrayAdapter<>(getActivity(),
                        android.R.layout.simple_spinner_dropdown_item, listaTiposCentros);
                adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                /*spinnerTiposCentros.setAdapter(adapter);
                spinnerTiposCentros.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        tipoCentro = (TiposCentros.TipoCentro) spinnerTiposCentros.getItemAtPosition(position);
                    }
                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {}
                });*/
            }
            @Override
            public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {            }
        });

        /*cliente1.get(this.getContext(), urlTiposProyectos,new AsyncHttpResponseHandler() {
            @Override
            public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
                String valorDevuelto = new String(responseBody);
                gson = new Gson();
                tiposProyectos = gson.fromJson(valorDevuelto, TiposProyectos.class);
                listaTiposProyectos = tiposProyectos.getListaTiposProyectos();
                ArrayAdapter<TiposProyectos.TipoProyecto> adapter = new ArrayAdapter<>(getActivity(),
                        android.R.layout.simple_spinner_dropdown_item, listaTiposProyectos);
                adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                spinnerTiposProyectos.setAdapter(adapter);
                spinnerTiposProyectos.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        tipoProyecto = (TiposProyectos.TipoProyecto) spinnerTiposProyectos.getItemAtPosition(position);
                    }
                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {}
                });
            }
            @Override
            public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {            }
        });*/
    }
}
