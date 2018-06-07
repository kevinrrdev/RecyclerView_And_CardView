package com.example.kevin.recyclerview_and_cardview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class PokemonActivity extends AppCompatActivity {
    private TextView nombre,tipo;
    private ImageView imgPokemon;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pokemon);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        nombre = findViewById(R.id.tvNameP);
        tipo = findViewById(R.id.tvTypeP);
        imgPokemon = findViewById(R.id.ivPokemonP);

        setUi();
    }


    private void setUi()
    {
        Bundle dataReceived = getIntent().getExtras();

        nombre.setText(dataReceived.getString("POKEMON_NAME"));
        tipo.setText(dataReceived.getString("POKEMON_TYPE"));
        imgPokemon.setImageResource(dataReceived.getInt("POKEMON_IMAGE"));

    }
}
