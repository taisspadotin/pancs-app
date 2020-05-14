package com.example.taisspadotin.pancsii;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class QuandoEncontrar extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quando_encontrar);

        TextView l1, l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15;
        l1=(TextView) findViewById(R.id.qlm1);
        l2=(TextView) findViewById(R.id.qlm2);
        l3=(TextView) findViewById(R.id.qlm3);
        l4=(TextView) findViewById(R.id.qlm4);
        l5=(TextView) findViewById(R.id.qlm5);
        l6=(TextView) findViewById(R.id.qlm6);
        l7=(TextView) findViewById(R.id.qlm7);
        l8=(TextView) findViewById(R.id.qlm8);
        l9=(TextView) findViewById(R.id.qlm9);
        l10=(TextView) findViewById(R.id.qlm10);
        l11=(TextView) findViewById(R.id.qlm11);
        l12=(TextView) findViewById(R.id.qlm12);
        l13=(TextView) findViewById(R.id.qlm13);
        l14=(TextView) findViewById(R.id.qlm14);
        l15=(TextView) findViewById(R.id.qlm15);

        final TextView t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15;
        t1=(TextView)findViewById(R.id.qtp1);
        t2=(TextView)findViewById(R.id.qtp2);
        t3=(TextView)findViewById(R.id.qtp3);
        t4=(TextView)findViewById(R.id.qtp4);
        t5=(TextView)findViewById(R.id.qtp5);
        t6=(TextView)findViewById(R.id.qtp6);
        t7=(TextView)findViewById(R.id.qtp7);
        t8=(TextView)findViewById(R.id.qtp8);
        t9=(TextView)findViewById(R.id.qtp9);
        t10=(TextView)findViewById(R.id.qtp10);
        t11=(TextView)findViewById(R.id.qtp11);
        t12=(TextView)findViewById(R.id.qtp12);
        t13=(TextView)findViewById(R.id.qtp13);
        t14=(TextView)findViewById(R.id.qtp14);
        t15=(TextView)findViewById(R.id.qtp15);

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
        l4.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                t4.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT));

            }
        });


        l5.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                t5.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT));

            }
        });

        l6.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                t6.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT));

            }
        });

        l7.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                t7.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT));

            }
        });

        l8.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                t8.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT));

            }
        });

        l9.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                t9.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT));

            }
        });

        l10.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                t10.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT));

            }
        });

        l11.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                t11.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT));

            }
        });

        l12.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                t12.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT));


            }
        });

        l13.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                t13.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT));

            }
        });

        l14.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                t14.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT));

            }
        });

        l15.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                t15.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT));

            }
        });






    }
}
