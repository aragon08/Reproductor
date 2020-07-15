package com.example.orion.reproductor;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.widget.ProgressBar;

/**
 * Created by Orion on 17/03/2017.
 */
//<Void> si no necesita alguna entrada, si ocupa entradas, se definiran
public class Hilo extends AsyncTask<Void,Integer,Void> {
    Context contexto;
    ProgressBar pgbAvance;

    public Hilo(ProgressBar pgb, Context ctx){
        pgbAvance=pgb;
        contexto= ctx;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
    }

    @Override
    protected Void doInBackground(Void... params) {
        try {
            for (int i = 0; i < 5; i++) {
                Thread.sleep(1000);
                publishProgress(20*i);
            }
        }catch (Exception e){}

        return null;
    }

    @Override
    protected void onProgressUpdate(Integer... values) {
        super.onProgressUpdate(values);
        pgbAvance.setProgress(values[0]);
    }

    @Override
    protected void onPostExecute(Void aVoid) {
        super.onPostExecute(aVoid);
        Intent intRep=new Intent(contexto,Reproductor.class);
        contexto.startActivity(intRep);
    }
}
