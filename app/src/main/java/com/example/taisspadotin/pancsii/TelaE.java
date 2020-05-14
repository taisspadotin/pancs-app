package com.example.taisspadotin.pancsii;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class TelaE extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_e);



        Button bb=(Button)findViewById(R.id.botaoeB);
        Button bc=(Button)findViewById(R.id.botaoeC);
        Button bd=(Button)findViewById(R.id.botaoeD);
       // Button be=(Button)findViewById(R.id.botaocE);
        Button bp=(Button)findViewById(R.id.botaoeP);
        Button bm=(Button)findViewById(R.id.botaoeM);
        Button bs=(Button)findViewById(R.id.botaoeS);
        Button bt=(Button)findViewById(R.id.botaoeT);

        bb.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent= new Intent(TelaE.this, TelaB.class);
                startActivity(intent);

            }
        });
        bd.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent= new Intent(TelaE.this, TelaD.class);
                startActivity(intent);

            }
        });
        bc.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent= new Intent(TelaE.this, TelaC.class);
                startActivity(intent);

            }
        });
        bp.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent= new Intent(TelaE.this, TelaP.class);
                startActivity(intent);

            }
        });
        bm.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent= new Intent(TelaE.this, TelaM.class);
                startActivity(intent);

            }
        });
        bt.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent= new Intent(TelaE.this, TelaT.class);
                startActivity(intent);

            }
        });
        bs.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent= new Intent(TelaE.this, TelaS.class);
                startActivity(intent);

            }
        });


        TextView l1, l2, l3;
        final TextView t1, t2, t3;
        l1=(TextView)findViewById(R.id.lme1);

        t1=(TextView)findViewById(R.id.tve1);

        l1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                t1.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT));

            }
        });


        Button menu=(Button)findViewById(R.id.em);
        menu.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent= new Intent(TelaE.this, MainActivity.class);
                startActivity(intent);

            }
        });

    }
}
