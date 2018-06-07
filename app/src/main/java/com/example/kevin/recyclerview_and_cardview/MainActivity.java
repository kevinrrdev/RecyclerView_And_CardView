package com.example.kevin.recyclerview_and_cardview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerViewAdapter recyclerViewAdapter;
    RecyclerView mRecyclerView;
    List<PokemonModel> mListPokemons;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = findViewById(R.id.rvPokemon);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        obtenerPokemons();

        RecyclerItemListener.RecyclerTouchListener listener= new RecyclerItemListener.RecyclerTouchListener() {
            @Override
            public void onClickItem(View v, int position) {
                if (mListPokemons!=null){
                    PokemonModel objPokemon = mListPokemons.get(position);
                    Bundle datosEnvio = new Bundle();

                    datosEnvio.putString("POKEMON_NAME",objPokemon.getNombre());
                    datosEnvio.putString("POKEMON_TYPE",objPokemon.getTipo());
                    datosEnvio.putInt("POKEMON_IMAGE",objPokemon.getImgPokemon());

                    Intent iPokemon= new Intent(MainActivity.this, PokemonActivity.class);
                    iPokemon.putExtras(datosEnvio);
                    startActivity(iPokemon);
                }

            }

            @Override
            public void onLongClickItem(View v, int position) {

                Toast.makeText(MainActivity.this, "Long click", Toast.LENGTH_SHORT).show();
            }
        };


        recyclerViewAdapter = new RecyclerViewAdapter(mListPokemons);
        mRecyclerView.addOnItemTouchListener(new RecyclerItemListener(MainActivity.this,mRecyclerView,listener));
        mRecyclerView.setAdapter(recyclerViewAdapter);
    }





    public void  obtenerPokemons(){
         mListPokemons= new ArrayList<>();

        for (int i=0;i<15;i++){
            if (i>4 && i<12){
                mListPokemons.add(new PokemonModel("Snorlax","Normal",R.drawable.snorlax));
            }
            mListPokemons.add(new PokemonModel("Pikachu","Electrico",R.drawable.pikachu));
        }
        mListPokemons.add(new PokemonModel("Snorlax","Normal",R.drawable.snorlax));

    }

}
