package com.example.taisspadotin.pancsii;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class TelaP extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_p);





        Button bb=(Button)findViewById(R.id.botaopB);
        Button bc=(Button)findViewById(R.id.botaopC);
        Button bd=(Button)findViewById(R.id.botaopD);
        Button be=(Button)findViewById(R.id.botaopE);
        //Button bp=(Button)findViewById(R.id.botaocP);
        Button bm=(Button)findViewById(R.id.botaopM);
        Button bs=(Button)findViewById(R.id.botaopS);
        Button bt=(Button)findViewById(R.id.botaopT);

        bb.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent= new Intent(TelaP.this, TelaB.class);
                startActivity(intent);

            }
        });
        bd.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent= new Intent(TelaP.this, TelaD.class);
                startActivity(intent);

            }
        });
        be.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent= new Intent(TelaP.this, TelaE.class);
                startActivity(intent);

            }
        });
        bc.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent= new Intent(TelaP.this, TelaC.class);
                startActivity(intent);

            }
        });
        bm.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent= new Intent(TelaP.this, TelaM.class);
                startActivity(intent);

            }
        });
        bt.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent= new Intent(TelaP.this, TelaT.class);
                startActivity(intent);

            }
        });
        bs.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent= new Intent(TelaP.this, TelaS.class);
                startActivity(intent);

            }
        });



        TextView l1, l2, l3;
        final TextView t1, t2, t3;
        l1=(TextView)findViewById(R.id.lmp1);
        l2=(TextView)findViewById(R.id.lmp2);
        l3=(TextView)findViewById(R.id.lmp3);

        t1=(TextView)findViewById(R.id.tvp1);
        t2=(TextView)findViewById(R.id.tvp2);
        t3=(TextView)findViewById(R.id.tvp3);

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


        Button menu=(Button)findViewById(R.id.pm);
        menu.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent= new Intent(TelaP.this, MainActivity.class);
                startActivity(intent);

            }
        });

    }
}
