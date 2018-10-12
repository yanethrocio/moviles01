package com.example.asus.recylerview03;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class Adaptador extends RecyclerView.Adapter<viewHolder> {

    List<Fuente> ListaObjeto;

    public Adaptador(List<Fuente> listaObjeto) {
        ListaObjeto = listaObjeto;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View vista = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_item, parent, false);
        return new viewHolder(vista,ListaObjeto);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        holder.titulo.setText(ListaObjeto.get(position).getTitulo());
        holder.imagen.setImageResource(ListaObjeto.get(position).getImagen());

    }

    @Override
    public int getItemCount() {
        return ListaObjeto.size();
    }
}
