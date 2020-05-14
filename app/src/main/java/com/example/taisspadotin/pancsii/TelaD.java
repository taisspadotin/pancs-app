package com.example.taisspadotin.pancsii;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class TelaD extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_d);


        Button bc;
        bc=(Button)findViewById(R.id.botaodC);
        Button bd=(Button)findViewById(R.id.botaodD);
        Button be=(Button)findViewById(R.id.botaodE);
        Button bp=(Button)findViewById(R.id.botaodP);
        Button bm=(Button)findViewById(R.id.botaodM);
        Button bs=(Button)findViewById(R.id.botaodS);
        Button bt=(Button)findViewById(R.id.botaodT);

        bc.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent= new Intent(TelaD.this, TelaC.class);
                startActivity(intent);

            }
        });
        bd.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent= new Intent(TelaD.this, TelaD.class);
                startActivity(intent);

            }
        });
        be.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent= new Intent(TelaD.this, TelaE.class);
                startActivity(intent);

            }
        });
        bp.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent= new Intent(TelaD.this, TelaP.class);
                startActivity(intent);

            }
        });
        bm.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent= new Intent(TelaD.this, TelaM.class);
                startActivity(intent);

            }
        });
        bt.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent= new Intent(TelaD.this, TelaT.class);
                startActivity(intent);

            }
        });
        bs.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent= new Intent(TelaD.this, TelaS.class);
                startActivity(intent);

            }
        });


        TextView l1, l2, l3;
        final TextView t1, t2, t3;
        l1=(TextView)findViewById(R.id.lmd1);

        t1=(TextView)findViewById(R.id.tvd1);

        l1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                t1.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT));

            }
        });

        Button menu=(Button)findViewById(R.id.dm);
        menu.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent= new Intent(TelaD.this, MainActivity.class);
                startActivity(intent);

            }
        });



    }
}
