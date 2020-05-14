package com.example.taisspadotin.pancsii;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button plantasbtn, receitasbtn, quandobtn, jogobtn;

        plantasbtn=(Button) findViewById(R.id.btnplantas);
        receitasbtn=(Button) findViewById(R.id.btnreceitas);
        quandobtn=(Button)findViewById(R.id.btnqndencontrar);
        jogobtn=(Button) findViewById(R.id.btnjogo);

//        admbtn=(Button) findViewById(R.id.btnadm);

        plantasbtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent= new Intent(MainActivity.this, TelaB.class);
                startActivity(intent);
                //Toast.makeText(getApplicationContext(), "Adicionado aos favoritos!", Toast.LENGTH_SHORT).show();
            }
        });
        receitasbtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent= new Intent(MainActivity.this, Receitas.class);
                startActivity(intent);
                //Toast.makeText(getApplicationContext(), "Adicionado aos favoritos!", Toast.LENGTH_SHORT).show();
            }
        });
        quandobtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent= new Intent(MainActivity.this, QuandoEncontrar.class);
                startActivity(intent);

            }
        });


        jogobtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent= new Intent(MainActivity.this, Jogo.class);
                startActivity(intent);
                //Toast.makeText(getApplicationContext(), "Adicionado aos favoritos!", Toast.LENGTH_SHORT).show();
            }
        });




    }
}
