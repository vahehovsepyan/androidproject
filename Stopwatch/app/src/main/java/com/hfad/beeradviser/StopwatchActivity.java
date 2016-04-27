package com.hfad.beeradviser;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;


public class StopwatchActivity extends Activity {

    // количество секунд на секундомере
    int seconds=0;
    // состояние секундомера
    boolean running;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stopwatch);
        runTimer();

    }

    //при щелчке на Start запускается секундомер
    public void onClickStart(View view ){
        running=true;
    }

    //при щелчке на Stop - секундомер остановливается
    public void onClickStop(View view){
        running=false;
    }

    //при щелчке на Reset -сбросить секундомер
    public void onClickReset(View view){
        running=false;
        seconds=0;
    }

    //обновление показаний таймера
    private void runTimer(){
        final TextView timeView = (TextView) findViewById(R.id.time_view);
        final Handler handler = new Handler();
        handler.post(new Runnable() {
            @Override
            public void run() {
                int hours = seconds/3600;
                int minuts = (seconds%3600)/60;  

                int sec=seconds%60;
                String time = String.format("%d : %02d : %02d",hours,minuts,sec);
                timeView.setText(time);
                if (running){
                    seconds++;
                }
                handler.postDelayed(this,1000);
            }

        });



    }

}
