package com.example.taisspadotin.pancsii;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.github.chrisbanes.photoview.PhotoView;

public class Receitas extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receitas);

        TextView r1, r2, r3, r4, r5, r6,r7, r8;
        r1=(TextView)findViewById(R.id.tvr1);
        r2=(TextView)findViewById(R.id.tvr2);
        r3=(TextView)findViewById(R.id.tvr3);
        r4=(TextView)findViewById(R.id.tvr4);
        r5=(TextView)findViewById(R.id.tvr5);
        r6=(TextView)findViewById(R.id.tvr6);
        r7=(TextView)findViewById(R.id.tvr7);
        r8=(TextView)findViewById(R.id.tvr8);

        final TextView t1, t2, t3, t4, t5, t6, t7, t8;
        t1=(TextView)findViewById(R.id.tvi1);
        t2=(TextView)findViewById(R.id.tvi2);
        t3=(TextView)findViewById(R.id.tvi3);
        t4=(TextView)findViewById(R.id.tvi4);
        t5=(TextView)findViewById(R.id.tvi5);
        t6=(TextView)findViewById(R.id.tvi6);
        t7=(TextView)findViewById(R.id.tvi7);
        t8=(TextView)findViewById(R.id.tvi8);


        r1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                t1.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT));
            }
        });
        r2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                t2.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT));
            }
        });
        r3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                t3.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT));
            }
        });
        r4.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                t4.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT));
            }
        });
        r5.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                t5.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT));
            }
        });
        r6.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                t6.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT));
            }
        });
        r7.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                t7.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT));
            }
        });
        r8.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                t8.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT));
            }
        });
    }
}
