package com.example.kevin.recyclerview_and_cardview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>{

    public List<PokemonModel> mList;

    public RecyclerViewAdapter(List<PokemonModel> list){
        this.mList = list;
    }

    @Override
    public ViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_pikachu,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder( ViewHolder holder, int position) {
        holder.nombre.setText(mList.get(position).getNombre());
        holder.tipo.setText(mList.get(position).getTipo());
        holder.imgPokemon.setImageResource(mList.get(position).getImgPokemon());
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        private TextView nombre,tipo;
        private ImageView imgPokemon;


        public ViewHolder(View itemView) {
            super(itemView);
            nombre = itemView.findViewById(R.id.tvName);
            tipo = itemView.findViewById(R.id.tvType);
            imgPokemon = itemView.findViewById(R.id.ivPokemon);

        }
    }
}
