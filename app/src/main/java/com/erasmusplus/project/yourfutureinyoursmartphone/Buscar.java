package com.erasmusplus.project.yourfutureinyoursmartphone;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Spinner;

public class Buscar extends Fragment {

    private Spinner spPais, spArea, spCentro, spProyecto;
    private Button boton;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View v = inflater.inflate(R.layout.buscar, container, false);

        spPais = v.findViewById(R.id.buscar_pais);
        spArea = v.findViewById(R.id.buscar_area);
        spCentro = v.findViewById(R.id.buscar_centro);
        spProyecto = v.findViewById(R.id.buscar_tipo_proyecto);
        boton = v.findViewById(R.id.buscar_boton);
        //cargarSpinners();

        return v;
    }
}
