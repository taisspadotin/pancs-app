package com.example.taisspadotin.pancsii;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class TelaB extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_b);


        Button bc;
        bc=(Button)findViewById(R.id.botaoC);
        Button bd=(Button)findViewById(R.id.botaoD);
        Button be=(Button)findViewById(R.id.botaoE);
        Button bp=(Button)findViewById(R.id.botaoP);
        Button bm=(Button)findViewById(R.id.botaoM);
        Button bs=(Button)findViewById(R.id.botaoS);
        Button bt=(Button)findViewById(R.id.botaoT);

        bc.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent= new Intent(TelaB.this, TelaC.class);
                startActivity(intent);

            }
        });
        bd.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent= new Intent(TelaB.this, TelaD.class);
                startActivity(intent);

            }
        });
        be.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent= new Intent(TelaB.this, TelaE.class);
                startActivity(intent);

            }
        });
        bp.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent= new Intent(TelaB.this, TelaP.class);
                startActivity(intent);

            }
        });
        bm.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent= new Intent(TelaB.this, TelaM.class);
                startActivity(intent);

            }
        });
        bt.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent= new Intent(TelaB.this, TelaT.class);
                startActivity(intent);

            }
        });
        bs.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent= new Intent(TelaB.this, TelaS.class);
                startActivity(intent);

            }
        });



        TextView l1, l2, l3;
        final TextView t1, t2, t3;
        l1=(TextView)findViewById(R.id.lmb1);
        l2=(TextView)findViewById(R.id.lmb2);
        l3=(TextView)findViewById(R.id.lmb3);

        t1=(TextView)findViewById(R.id.tvb1);
        t2=(TextView)findViewById(R.id.tvb2);
        t3=(TextView)findViewById(R.id.tvb3);

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


        Button menu=(Button)findViewById(R.id.bm);
        menu.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent= new Intent(TelaB.this, MainActivity.class);
                startActivity(intent);

            }
        });

    }
}
