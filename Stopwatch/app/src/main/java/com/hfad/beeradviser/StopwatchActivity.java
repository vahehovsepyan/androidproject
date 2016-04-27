package com.hfad.beeradviser;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;


public class StopwatchActivity extends Activity {

    int seconds=0;
    boolean running;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stopwatch);
        runTimer();

    }

    public void onClickStart(View view ){
        running=true;
    }
    public void onClickStop(View view){
        running=false;
    }
    public void onClickReset(View view){
        running=false;
        seconds=0;
    }

    private void runTimer(){
        final TextView timeView = (TextView) findViewById(R.id.time_view);
        final Handler handler = new Handler();
        handler.post(new Runnable() {
            @Override
            public void run() {
                int hours = seconds/3600;
                int minuts = (seconds%3600)/60;
                int secs = seconds/60;

                String time = String.format("%d : %02d : %02d",hours,minuts,secs);
                timeView.setText(time);
                if (running){
                    seconds++;
                }
                handler.postDelayed(this,1000);
            }

        });



    }

}
