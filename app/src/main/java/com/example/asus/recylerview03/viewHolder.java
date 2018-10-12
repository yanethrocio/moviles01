package com.example.asus.recylerview03;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class viewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    Button btnUno;
    Button btnDos;
    ImageView imagen;
    TextView titulo;
    int Position;
    List<Fuente> ListaObjeto;

    public viewHolder(View itemView, List<Fuente> datos) {
        super(itemView);

        btnUno = (Button) itemView.findViewById(R.id.btnUno);
        btnDos = (Button) itemView.findViewById(R.id.btnDos);
        imagen = (ImageView)    itemView.findViewById(R.id.imagen);
        titulo = (TextView)    itemView.findViewById(R.id.texto);
        ListaObjeto = datos;


        btnUno.setOnClickListener(this);


       btnDos.setOnClickListener(this);



    }

    @Override
    public void onClick(View view) {
        int position = getAdapterPosition();
        Fuente objeto = ListaObjeto.get(position);

     if (view.getId() == btnUno.getId()){
         Toast.makeText(btnUno.getContext(),"Apreto la opcion 1 del item " + position+"correspondiente al titulo" + objeto.getTitulo(), Toast.LENGTH_SHORT).show();


     }else {
         Toast.makeText(btnUno.getContext(),"Apreto la opcion 2 del item " + position+"correspondiente al titulo" + objeto.getTitulo(), Toast.LENGTH_SHORT).show();


     }
    }
}
