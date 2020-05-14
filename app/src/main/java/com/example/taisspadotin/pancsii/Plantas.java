package com.example.taisspadotin.pancsii;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.provider.MediaStore;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AbsListView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.Gallery;
import android.widget.ImageView;

import com.github.chrisbanes.photoview.PhotoView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Plantas extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plantas);


        TextView l1, l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15;
        l1=(TextView) findViewById(R.id.lm1);
        l2=(TextView) findViewById(R.id.lm2);
        l3=(TextView) findViewById(R.id.lm3);
        l4=(TextView) findViewById(R.id.lm4);
        l5=(TextView) findViewById(R.id.lm5);
        l6=(TextView) findViewById(R.id.lm6);
        l7=(TextView) findViewById(R.id.lm7);
        l8=(TextView) findViewById(R.id.lm8);
        l9=(TextView) findViewById(R.id.lm9);
        l10=(TextView) findViewById(R.id.lm10);
        l11=(TextView) findViewById(R.id.lm11);
        l12=(TextView) findViewById(R.id.lm12);
        l13=(TextView) findViewById(R.id.lm13);
        l14=(TextView) findViewById(R.id.lm14);
        l15=(TextView) findViewById(R.id.lm15);

        final TextView t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15;
        t1=(TextView)findViewById(R.id.tp1);
        t2=(TextView)findViewById(R.id.tp2);
        t3=(TextView)findViewById(R.id.tp3);
        t4=(TextView)findViewById(R.id.tp4);
        t5=(TextView)findViewById(R.id.tp5);
        t6=(TextView)findViewById(R.id.tp6);
        t7=(TextView)findViewById(R.id.tp7);
        t8=(TextView)findViewById(R.id.tp8);
        t9=(TextView)findViewById(R.id.tp9);
        t10=(TextView)findViewById(R.id.tp10);
        t11=(TextView)findViewById(R.id.tp11);
        t12=(TextView)findViewById(R.id.tp12);
        t13=(TextView)findViewById(R.id.tp13);
        t14=(TextView)findViewById(R.id.tp14);
        t15=(TextView)findViewById(R.id.tp15);

        l1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                t1.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT));

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
