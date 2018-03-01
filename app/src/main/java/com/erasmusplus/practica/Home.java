package com.erasmusplus.practica;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class Home extends Fragment {

    private ImageView imagen;

    public Home() {
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View vista;

        vista = inflater.inflate(R.layout.home, container, false);

        imagen = vista.findViewById(R.id.imagen);


        Glide.with(this).load("http://practicascursodam.esy.es/wp-content/uploads/2017/04/cropped-head3-1.png").into(imagen);

        return vista;
    }
}
