package com.erasmusplus.project.yourfutureinyoursmartphone;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class Inicio extends Fragment {

    public Inicio() {
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View vista;
        ImageView imagen;
        TextView textoInicio;
        String texto;

        vista = inflater.inflate(R.layout.inicio, container, false);

        imagen = vista.findViewById(R.id.imagen);
        Glide.with(this).load("http://practicascursodam.esy.es/wp-content/uploads/2017/04/cropped-head3-1.png").into(imagen);

        texto = "Hoy en día, todos tenemos un smartphone (teléfono inteligente) en nuestro bolsillo.\n" +
                "El aumento del uso de dispositivos móviles con pantallas más grandes, mayor capacidad de memoria, más disponibilidades multimedia y mayor acceso a la información y buscar datos.\n" +
                "Esta facilidad de acceso a contenidos en cualquier momento y en cualquier lugar ha generado este proyecto que se basa en el dispositivo móvil como herramienta ideal para buscar socios de cualquier proyecto europeo.\n" +
                "Una búsqueda inicial por los socios permitió concluir que no había aplicaciones móviles con las características deseadas.\n" +
                "Dado que todos los socios del proyecto proceden de las áreas TIC (centro de formación profesional y Universidades), el objetivo principal del proyecto es desarrollar una aplicación de software que utilice licencias de software libre para la busqueda de socios sobre los diferentes proyectos europeos.";

        textoInicio = vista.findViewById(R.id.texto_inicio);
        textoInicio.setText(texto);

        return vista;
    }
}
