package com.example.taisspadotin.pancsii;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class TelaC extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_c);

        Button bb=(Button)findViewById(R.id.botaocB);
        //Button bc=(Button)findViewById(R.id.botaocC);
        Button bd=(Button)findViewById(R.id.botaocD);
        Button be=(Button)findViewById(R.id.botaocE);
        Button bp=(Button)findViewById(R.id.botaocP);
        Button bm=(Button)findViewById(R.id.botaocM);
        Button bs=(Button)findViewById(R.id.botaocS);
        Button bt=(Button)findViewById(R.id.botaocT);

        bb.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent= new Intent(TelaC.this, TelaB.class);
                startActivity(intent);

            }
        });
        bd.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent= new Intent(TelaC.this, TelaD.class);
                startActivity(intent);

            }
        });
        be.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent= new Intent(TelaC.this, TelaE.class);
                startActivity(intent);

            }
        });
        bp.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent= new Intent(TelaC.this, TelaP.class);
                startActivity(intent);

            }
        });
        bm.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent= new Intent(TelaC.this, TelaM.class);
                startActivity(intent);

            }
        });
        bt.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent= new Intent(TelaC.this, TelaT.class);
                startActivity(intent);

            }
        });
        bs.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent= new Intent(TelaC.this, TelaS.class);
                startActivity(intent);

            }
        });


        TextView l1, l2, l3;
        final TextView t1, t2, t3;
        l1=(TextView)findViewById(R.id.lmc1);
        l2=(TextView)findViewById(R.id.lmc2);
        l3=(TextView)findViewById(R.id.lmc3);

        t1=(TextView)findViewById(R.id.tvc1);
        t2=(TextView)findViewById(R.id.tvc2);
        t3=(TextView)findViewById(R.id.tvc3);

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
        l3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                t3.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT));

            }
        });


        Button menu=(Button)findViewById(R.id.cm);
        menu.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent= new Intent(TelaC.this, MainActivity.class);
                startActivity(intent);

            }
        });


    }
}
