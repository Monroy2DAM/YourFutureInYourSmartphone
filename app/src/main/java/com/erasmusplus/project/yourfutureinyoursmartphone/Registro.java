package com.erasmusplus.project.yourfutureinyoursmartphone;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Registro extends Fragment {

    //==============================================================================================
    // VARIABLES
    //==============================================================================================

    //==============================================================================================
    // CONSTRUCTOR
    //==============================================================================================
    public Registro() {

    }

    //==============================================================================================
    // MÉTODOS SOBREESCRITOS
    //==============================================================================================
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View vista = inflater.inflate(R.layout.registro, container, false);

        return vista;
    }
}
