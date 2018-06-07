package com.example.kevin.recyclerview_and_cardview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerViewAdapter recyclerViewAdapter;
    RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = findViewById(R.id.rvPokemon);

        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        recyclerViewAdapter = new RecyclerViewAdapter(obtenerPokemons());
        mRecyclerView.setAdapter(recyclerViewAdapter);
    }

    public List<PokemonModel> obtenerPokemons(){
        List<PokemonModel> mListPokemons= new ArrayList<>();

        for (int i=0;i<15;i++){
            mListPokemons.add(new PokemonModel("Pikachu","Electrico",R.drawable.pikachu));
        }


        return mListPokemons;
    }

}
