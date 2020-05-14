package com.example.taisspadotin.pancsii;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ContentValues;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.github.chrisbanes.photoview.PhotoView;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.Date;
import pl.droidsonroids.gif.GifTextView;

public class Jogo extends Activity {

    private String texto;
    private String FILENAME="savefile.txt";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jogo);


        final int[] i = new int[1];
        i[0] = 0;
        final int[] moeda = new int[1];
        moeda[0] = 1;

        final PhotoView pv1 = (PhotoView) findViewById(R.id.imgjogo);
        final ImageView nuvem = (ImageView) findViewById(R.id.nuvem);
        final ImageView saco = (ImageView) findViewById(R.id.saco);
        final GifTextView chuva = (GifTextView) findViewById(R.id.chuva);
        final TextView horarestante = (TextView) findViewById(R.id.horarestante);
        final Date[] horadf = new Date[1];
        final int[] horai = new int[1];
        final int[] mp = new int[1];
        final int[] nivel = {1};
        final TextView moedatv =(TextView) findViewById(R.id.moedatv);
        final TextView hora1=(TextView)findViewById(R.id.hora1);

        final Button palpite;
        palpite = (Button) findViewById(R.id.btnpalpite);
        final EditText palc;
        palc = (EditText) findViewById(R.id.etPalpite);
        final String[] palpiteCompara = new String[1];
        moedatv.setText(String.valueOf(moeda[0]));

        //Pegando numero do arquivo
        FileInputStream fis= null;
        try {
            fis=openFileInput(FILENAME);
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader br= new BufferedReader(isr);
            StringBuilder sb= new StringBuilder();
            String text;
            while((text = br.readLine())!=null){
                sb.append(text).append("\n");
            }
            texto =sb.toString();
            //Toast.makeText(getApplicationContext(), "Dado gravado: " +texto, Toast.LENGTH_SHORT).show();
            String txt=texto;
            //save(1);
            // texto="1";
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            if(fis != null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }



        //qnd clica no palpite
        palpite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                palpiteCompara[0] = (palc.getText()).toString();
                if (palpiteCompara[0].equalsIgnoreCase("trapoeba")||palpiteCompara[0].equalsIgnoreCase("beldroegao")||palpiteCompara[0].equalsIgnoreCase("beldroegão")) {
                    if(palpiteCompara[0].equalsIgnoreCase("trapoeba")){
                        save(18);
                        load();
                        // i[0] = 16;
                        Toast.makeText(getApplicationContext(), "Acertou", Toast.LENGTH_SHORT).show();
                        pv1.setImageResource(R.drawable.m1);
                        palc.setText("");
                        //palc.setText("");

                    }
                    if(palpiteCompara[0].equalsIgnoreCase("beldroegao")||palpiteCompara[0].equalsIgnoreCase("beldroegão")){
                        save(27);
                        load();
                        // i[0] = 16;
                        Toast.makeText(getApplicationContext(), "Acertou", Toast.LENGTH_SHORT).show();
                        pv1.setImageResource(R.drawable.m11);
                        palc.setText("");
                    }

                }
                //else if(palpiteCompara[0].equals("trapoeba")){Toast.makeText(getApplicationContext(), "entrou no segundo caso", Toast.LENGTH_SHORT).show();}
                else {
                    save(0);
                    load();
                    // i[0] = 0;
                    Toast.makeText(getApplicationContext(), "Errou: " + palpiteCompara[0], Toast.LENGTH_SHORT).show();
                    pv1.setImageResource(R.drawable.v1);
                    palc.setText("");

                }


            }
        });



        final String pg= String.valueOf(texto.charAt(0));
        //Cooncatenando as 2 primeira letras
        final String s1= (String.valueOf(texto.charAt(0)));
        final String s2 = (String.valueOf(texto.charAt(1)));
        final String conc= s1.concat(s2);
        //Toast.makeText(getApplicationContext(), "Concatenar 2 strings " + conc, Toast.LENGTH_SHORT).show();

        int pg2= Integer.parseInt(String.valueOf(texto.charAt(0)));
        if(pg.equals("0")){
            pv1.setImageResource(R.drawable.v1);
            new AlertDialog.Builder(this).setTitle("Instruções").setMessage("O jogo mostra as etapas do desinvolvimento de uma planta, para ela crescer você deve rega-la clicando na nuvem, mas para isso você ira prescisar de moedas, para conseguilas você deve ficar um minuto na pagina e clicar na moeda\nVocê tambem pode adivinhar o nome da planta e passar de nivel, ou errar e voltar do começo! ").setPositiveButton("OK", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                }
            }).show();
            //save(1);
        }
        if(pg.equals("1")){
            pv1.setImageResource(R.drawable.v2);
            //save(2);
        }
        if(pg.equals("2")){
            pv1.setImageResource(R.drawable.v3);
            //save(3);
        }
        if(pg.equals("3")){
            //  save(4);
            pv1.setImageResource(R.drawable.v4);

            //  load();
        }
        if(pg.equals("4")){
            //save(5);
            pv1.setImageResource(R.drawable.v5);

            //load();
        }
        if(pg.equals("5")){
            //save(6);
            pv1.setImageResource(R.drawable.v6);

            //load();
        }
        if(pg.equals("6")){
            //save(7);
            pv1.setImageResource(R.drawable.v7);

            //load();
        }
        if(pg.equals("7")){
            //save(8);
            pv1.setImageResource(R.drawable.v8);

            //load();
        }
        if(pg.equals("8")){
            pv1.setImageResource(R.drawable.v9);
            //save(9);
            //load();
        }
        if(pg.equals("9")){
            pv1.setImageResource(R.drawable.v10);
            //save(10);
            //load();
        }
        if(conc.equals("10")){
            pv1.setImageResource(R.drawable.v11);
            //save(11);
        }
        if(conc.equals("11")){
            pv1.setImageResource(R.drawable.v12);
            //save(12);
        }
        if(conc.equals("12")){
            pv1.setImageResource(R.drawable.v13);


        }
        if(conc.equals("13")){
            pv1.setImageResource(R.drawable.v14);
        }
        if(conc.equals("14")){
            pv1.setImageResource(R.drawable.v15);
        }
        if(conc.equals("15")){
            pv1.setImageResource(R.drawable.v16);
        }
        if(conc.equals("16")){
            pv1.setImageResource(R.drawable.v17);
        }
        if(conc.equals("17")){
            pv1.setImageResource(R.drawable.m1);
        }
        if(conc.equals("18")){
            pv1.setImageResource(R.drawable.m2);
        }
        if(conc.equals("19")){
            pv1.setImageResource(R.drawable.m3);
        }
        if(conc.equals("20")){
            pv1.setImageResource(R.drawable.m4);
        }
        if(conc.equals("21")){
            pv1.setImageResource(R.drawable.m5);
        }
        if(conc.equals("22")){
            pv1.setImageResource(R.drawable.m6);
        }
        if(conc.equals("23")){
            pv1.setImageResource(R.drawable.m7);
        }
        if(conc.equals("24")){
            pv1.setImageResource(R.drawable.m8);
        }
        if(conc.equals("25")){
            pv1.setImageResource(R.drawable.m9);
        }
        if(conc.equals("26")){
            pv1.setImageResource(R.drawable.m10);
        }
        if(conc.equals("27")){
            pv1.setImageResource(R.drawable.m11);
        }





        java.util.GregorianCalendar gc2 = new java.util.GregorianCalendar();
        gc2.setTime(new java.util.Date());
        java.text.SimpleDateFormat sdf3 = new java.text.SimpleDateFormat("mm");


        java.util.GregorianCalendar gch = new java.util.GregorianCalendar();
        gch.setTime(new java.util.Date());
        java.text.SimpleDateFormat sdfh = new java.text.SimpleDateFormat("HH");

        int hora= Integer.parseInt((sdfh.format(gch.getTime())));

        //gc2.add(Calendar.HOUR, -3);
        mp[0] = Integer.parseInt((sdf3.format(gc2.getTime())));

        horarestante.setText(String.valueOf((mp[0])+1));

    hora1.setText(String.valueOf(hora));




        nuvem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {

                if (moeda[0] != 0) {//se tiver moeda
                    chuva.setVisibility(View.VISIBLE);

                    //Cooncatenando as 2 primeira letras
                    String s1= (String.valueOf(texto.charAt(0)));
                    String s2 = (String.valueOf(texto.charAt(1)));
                    String conc1= s1.concat(s2);
                    final PhotoView pv2 = (PhotoView) findViewById(R.id.imgjogo);
                    //Toast.makeText(getApplicationContext(), "Concatenar 2 strings " + conc, Toast.LENGTH_SHORT).show();

                    // String pg2 = (String.valueOf(texto.charAt(0)));
                    if (s1.equals("0")) {
                        pv2.setImageResource(R.drawable.v2);
                        save(1);
                        //Toast.makeText(getApplicationContext(), "Inicio do jogo" , Toast.LENGTH_SHORT).show();
                        load();
                    }


                    if (s1.equals("3")) {
                        save(4);
                        pv2.setImageResource(R.drawable.v5);
                        load();
                       //Toast.makeText(getApplicationContext(), "Nivel 3 alcançado!" , Toast.LENGTH_SHORT).show();

                    }
                    if (s1.equals("4")) {
                        pv2.setImageResource(R.drawable.v6);
                        save(5);
                        //Toast.makeText(getApplicationContext(), "entrou no if 4" , Toast.LENGTH_SHORT).show();
                        load();
                        //Toast.makeText(getApplicationContext(), "Nivel 4 alcançado!" , Toast.LENGTH_SHORT).show();
                    }
                    if (s1.equals("5")) {
                        save(6);
                        pv2.setImageResource(R.drawable.v7);
                        //Toast.makeText(getApplicationContext(), "Nivel  alcançado!" , Toast.LENGTH_SHORT).show();
                        load();
                    }
                    if (s1.equals("6")) {
                        save(7);
                        pv2.setImageResource(R.drawable.v8);
                        //Toast.makeText(getApplicationContext(), "entrou no if 6" , Toast.LENGTH_SHORT).show();
                        load();
                    }
                    if (s1.equals("7")) {
                        save(8);
                        pv2.setImageResource(R.drawable.v9);
                        //Toast.makeText(getApplicationContext(), "entrou no if 7" , Toast.LENGTH_SHORT).show();
                        load();
                    }
                    if (s1.equals("8")) {
                        pv2.setImageResource(R.drawable.v10);
                        save(9);
                        //Toast.makeText(getApplicationContext(), "entrou no if 8" , Toast.LENGTH_SHORT).show();
                        load();
                    }
                    if (s1.equals("9")) {
                        save(10);
                        pv2.setImageResource(R.drawable.v11);
                        //Toast.makeText(getApplicationContext(), "entrou no if 9" , Toast.LENGTH_SHORT).show();
                        load();
                    }
                    if (conc1.equals("10")) {
                        save(11);
                        pv2.setImageResource(R.drawable.v12);
                        //Toast.makeText(getApplicationContext(), "entrou no if 10" , Toast.LENGTH_SHORT).show();
                        load();
                    }
               //**********************************************mudar
                   else if (conc1.equals("11")) {
                        save(12);
                        pv2.setImageResource(R.drawable.v13);
                        //Toast.makeText(getApplicationContext(), "entrou no if" , Toast.LENGTH_SHORT).show();
                        load();
                    }
                    else if(conc1.equals("12")) {
                        save(13);
                        pv2.setImageResource(R.drawable.v14);

                        load();
                        //Toast.makeText(getApplicationContext(), "entrou no if 12" , Toast.LENGTH_SHORT).show();
                    }
                    else if (conc1.equals("13")) {
                        save(14);
                        pv2.setImageResource(R.drawable.v15);

                        load();
                    }
                    else if (conc1.equals("14")) {
                        save(15);
                        pv2.setImageResource(R.drawable.v16);

                        load();
                    }
                    else if (conc1.equals("15")) {
                        save(16);
                        pv2.setImageResource(R.drawable.v17);

                        load();
                    }
                    else if (conc1.equals("16")) {
                        save(17);
                        pv2.setImageResource(R.drawable.m1);

                        load();
                    }

                    else if(conc1.equals("17")){
                        save(18);
                        pv2.setImageResource(R.drawable.m2);
                        load();
                    }
                    else if(conc1.equals("18")){
                        save(19);
                        pv2.setImageResource(R.drawable.m3);
                        load();
                        //Toast.makeText(getApplicationContext(), "entrou no if 18" , Toast.LENGTH_SHORT).show();
                    }
                    else if(conc1.equals("19")){
                        save(20);
                        pv2.setImageResource(R.drawable.m4);
                       // Toast.makeText(getApplicationContext(), "entrou no if 19" , Toast.LENGTH_SHORT).show();
                        //Toast.makeText(getApplicationContext(), "entrou no if 19" , Toast.LENGTH_SHORT).show();
                        load();
                    }
                    else if (s1.equals("1")) {
                        pv2.setImageResource(R.drawable.v3);
                        save(2);
                        load();
                    }





                     if(conc1.equals("20")){
                        save(21);
                        pv2.setImageResource(R.drawable.m5);
                       // Toast.makeText(getApplicationContext(), "entrou no if 20" , Toast.LENGTH_SHORT).show();
                        load();
                    }
                    else if(conc1.equals("21")){
                        save(22);
                        pv2.setImageResource(R.drawable.m6);
                        //Toast.makeText(getApplicationContext(), "entrou no if 21" , Toast.LENGTH_SHORT).show();
                        load();
                    }
                    else if(conc1.equals("22")){
                        save(23);
                        pv2.setImageResource(R.drawable.m7);
                        //Toast.makeText(getApplicationContext(), "Nivel 22 alcançado" , Toast.LENGTH_SHORT).show();
                        load();
                    }
                    else if(conc1.equals("23")){
                        save(24);
                        pv2.setImageResource(R.drawable.m8);
                         //Toast.makeText(getApplicationContext(), "Nivel 23 alcançado" , Toast.LENGTH_SHORT).show();
                        load();
                    }
                    else if(conc1.equals("24")){
                        save(25);
                        pv2.setImageResource(R.drawable.m9);
                        // Toast.makeText(getApplicationContext(), "Nivel 24 alcançado" , Toast.LENGTH_SHORT).show();
                        load();
                    }
                    else if(conc1.equals("25")){
                        save(26);
                        pv2.setImageResource(R.drawable.m10);
                        // Toast.makeText(getApplicationContext(), "entrou no if 25" , Toast.LENGTH_SHORT).show();
                        load();
                    }
                    else if(conc1.equals("26")){
                        save(27);
                        pv2.setImageResource(R.drawable.m11);
                        load();
                    }
                    else if(conc1.equals("27")){
                        save(28);
                        pv2.setImageResource(R.drawable.m11);
                        load();
                    }
                    else if (s1.equals("2")) {
                         save(3);
                         pv2.setImageResource(R.drawable.v4);
                         load();
                         //Toast.makeText(getApplicationContext(), "entrou no if 2" , Toast.LENGTH_SHORT).show();

                     }

                    final Handler handler = new Handler();

                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {


                            java.util.GregorianCalendar gc2 = new java.util.GregorianCalendar();
                            gc2.setTime(new java.util.Date());
                            java.text.SimpleDateFormat sdf3 = new java.text.SimpleDateFormat("mm");
                            //gc2.add(Calendar.HOUR, -3);
                            mp[0] = Integer.parseInt((sdf3.format(gc2.getTime())));
                            if(mp[0]==60){
                                mp[0]=0;
                            }

                            java.util.GregorianCalendar gch = new java.util.GregorianCalendar();
                            gch.setTime(new java.util.Date());
                            java.text.SimpleDateFormat sdfh = new java.text.SimpleDateFormat("HH");

                            int hora= Integer.parseInt((sdfh.format(gch.getTime())));


                            hora1.setText(String.valueOf(hora));
                            horarestante.setText(String.valueOf((mp[0])+1));




                          //  horarestante.setText(String.valueOf(mp[0]));


                            chuva.setVisibility(View.INVISIBLE); // Ou View.GONE
                            moeda[0] = moeda[0] - 1;
                            moedatv.setText(String.valueOf(moeda[0]));
                        }
                    }, 3000);


                } else {
                    Toast.makeText(getApplicationContext(), "Você não possui moedas!", Toast.LENGTH_SHORT).show();
                }
            }
            //}
        });

        saco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //PEGAR HORA ATUAL:
                java.util.GregorianCalendar gc = new java.util.GregorianCalendar();
                gc.setTime(new java.util.Date());
                java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("hh:mm:ss");
                // System.out.println(sdf.format(gc.getTime()));
                //gc.add(Calendar.HOUR, -3);
                String hora_agora = (sdf.format(gc.getTime()));
                Date horaagora = gc.getTime();

                //PEGAR HORA Q TEM Q SER:
                java.util.GregorianCalendar gc2 = new java.util.GregorianCalendar();
                gc2.setTime(new java.util.Date());
                java.text.SimpleDateFormat sdf2 = new java.text.SimpleDateFormat("hh:mm:ss");
                java.text.SimpleDateFormat sdf3 = new java.text.SimpleDateFormat("mm");
                //gc2.add(Calendar.HOUR, -3);
                gc2.add(Calendar.MINUTE, 1);
                String hora_compara = (sdf2.format(gc2.getTime()));
                int min = Integer.parseInt((sdf3.format(gc.getTime())));//pega o atual minuto
                int fn = mp[0] + 01;
                if (min >= fn) {
                    Toast.makeText(getApplicationContext(), "Nova moeda! ", Toast.LENGTH_SHORT).show();
                    moeda[0] = moeda[0] + 1;
                    moedatv.setText(String.valueOf(moeda[0]));
                } else {
                    Toast.makeText(getApplicationContext(), "Espere o tempo necessario! ", Toast.LENGTH_SHORT).show();
                    //horarestante.setText((int) rs);
                }
            }

        });
    }


    public void save(int i){
        //String text=;
        String text= String.valueOf(i);
        FileOutputStream fos= null;
        try {
            fos =openFileOutput(FILENAME, MODE_PRIVATE);
            fos.write(text.getBytes());
            //Toast.makeText(getApplicationContext(), "Dado gravado em " +getFilesDir(), Toast.LENGTH_SHORT).show();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            if(fos!=null){
                try{
                    fos.close();
                }catch(IOException e){
                    e.printStackTrace();
                }
            }
        }
    }
    public void load(){
        FileInputStream fis= null;
        try {
            fis=openFileInput(FILENAME);
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader br= new BufferedReader(isr);
            StringBuilder sb= new StringBuilder();
            String text;
            while((text = br.readLine())!=null){
                sb.append(text).append("\n");
            }
            texto =sb.toString();
            Toast.makeText(getApplicationContext(), "Nivel " +texto+" alcançado!.", Toast.LENGTH_SHORT).show();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            if(fis != null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}