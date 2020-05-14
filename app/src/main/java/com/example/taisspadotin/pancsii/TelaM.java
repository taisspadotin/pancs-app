package com.example.taisspadotin.pancsii;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class TelaM extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_m);




        Button bb=(Button)findViewById(R.id.botaomB);
        Button bc=(Button)findViewById(R.id.botaomC);
        Button bd=(Button)findViewById(R.id.botaomD);
        Button be=(Button)findViewById(R.id.botaomE);
        Button bp=(Button)findViewById(R.id.botaomP);
        //Button bm=(Button)findViewById(R.id.botaocM);
        Button bs=(Button)findViewById(R.id.botaomS);
        Button bt=(Button)findViewById(R.id.botaomT);

        bb.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent= new Intent(TelaM.this, TelaB.class);
                startActivity(intent);

            }
        });
        bd.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent= new Intent(TelaM.this, TelaD.class);
                startActivity(intent);

            }
        });
        bc.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent= new Intent(TelaM.this, TelaC.class);
                startActivity(intent);

            }
        });
        bp.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent= new Intent(TelaM.this, TelaP.class);
                startActivity(intent);

            }
        });
        be.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent= new Intent(TelaM.this, TelaE.class);
                startActivity(intent);

            }
        });
        bt.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent= new Intent(TelaM.this, TelaT.class);
                startActivity(intent);

            }
        });
        bs.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent= new Intent(TelaM.this, TelaS.class);
                startActivity(intent);

            }
        });



        TextView l1, l2, l3;
        final TextView t1, t2, t3;
        l1=(TextView)findViewById(R.id.lmm1);
        l2=(TextView)findViewById(R.id.lmm2);

        t1=(TextView)findViewById(R.id.tvm1);
        t2=(TextView)findViewById(R.id.tvm2);

        l1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                t1.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT));

            }
        });
        l2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                t2.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT));

            }
        });

        Button menu=(Button)findViewById(R.id.mm);
        menu.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent= new Intent(TelaM.this, MainActivity.class);
                startActivity(intent);

            }
        });


    }
}
