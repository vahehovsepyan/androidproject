package com.example.vahe.calculator;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;
    Button button0;
    Button buttonDivision;
    Button buttonAddition;
    Button buttonMultiplication;
    Button buttonDeduction;
    Button buttonEqual;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        textView = (TextView) findViewById(R.id.textView);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        button0 = (Button) findViewById(R.id.button0);

        buttonDivision = (Button) findViewById(R.id.division);
        buttonDeduction = (Button) findViewById(R.id.deduction);
        buttonAddition = (Button) findViewById(R.id.addition);
        buttonMultiplication = (Button) findViewById(R.id.multiplication);
        buttonEqual = (Button) findViewById(R.id.equal);



        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text1,text2;
                int number1,number2;
                switch (v.getId()){
                    case R.id.button1:
                        textView.setText(textView.getText()+"1");
                        break;
                    case R.id.button2:
                        textView.setText(textView.getText()+"2");
                        break;
                    case R.id.button3:
                        textView.setText(textView.getText()+"3");
                        break;
                    case R.id.button4:
                        textView.setText(textView.getText()+"4");
                        break;
                    case R.id.button5:
                        textView.setText(textView.getText()+"5");
                        break;
                    case R.id.button6:
                        textView.setText(textView.getText()+"6");
                        break;
                    case R.id.button7:
                        textView.setText(textView.getText()+"7");
                        break;
                    case R.id.button8:
                        textView.setText(textView.getText()+"8");
                        break;
                    case R.id.button9:
                        textView.setText(textView.getText()+"9");
                        break;
                    case R.id.button0:
                        textView.setText(textView.getText()+"0");
                        break;
                    case R.id.division:
                        text1 = (String)textView.getText();
                        number1=Integer.parseInt(text1);
                        textView.setText("");

                }
            }
        };
        button1.setOnClickListener(onClickListener);
        button2.setOnClickListener(onClickListener);
        button3.setOnClickListener(onClickListener);
        button4.setOnClickListener(onClickListener);
        button5.setOnClickListener(onClickListener);
        button6.setOnClickListener(onClickListener);
        button7.setOnClickListener(onClickListener);
        button8.setOnClickListener(onClickListener);
        button9.setOnClickListener(onClickListener);
        button0.setOnClickListener(onClickListener);

        buttonDivision.setOnClickListener(onClickListener);


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
