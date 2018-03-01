package com.erasmusplus.practica;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.EditText;
import com.erasmusplus.practica.json_handlers.Handler_Contactos;

import java.util.List;


public class AdaptadorSocios extends BaseAdapter {

    Context contexto;
    LayoutInflater inflador;
    List<Handler_Contactos.YfRESULTADOBean> listaContactos;

    // Inicio
    public  AdaptadorSocios(Context contexto, List<Handler_Contactos.YfRESULTADOBean> nuevaLista){
        this.contexto = contexto;
        this.inflador = (LayoutInflater)
                contexto.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.listaContactos = nuevaLista;
    }


    @Override
    public int getCount() {
        return listaContactos.size();
    }

    @Override
    public Object getItem(int position) {
        return listaContactos.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        if (view == null){
            view = inflador.inflate(R.layout.elemento_lista_socios, null);
        }

        Handler_Contactos.YfRESULTADOBean contacto = (Handler_Contactos.YfRESULTADOBean) getItem(i);

        EditText pais = view.findViewById(R.id.elementos_field_pais);
        EditText area = view.findViewById(R.id.elementos_field_area);
        EditText email = view.findViewById(R.id.etxtListaContactosEmail);
        EditText centro = view.findViewById(R.id.elementos_field_centro);

        pais.setText(contacto.getCOUNTRY().toString());
        area.setText(contacto.getAREA().toString());
        email.setText(contacto.getEMAIL().toString());
        centro.setText(contacto.getNAMECENTER().toString());

        return view;
    }
}
