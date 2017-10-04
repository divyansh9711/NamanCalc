package com.example.divyanshsingh.namancalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
int a = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int i = 0;
        Button buttonAdd = (Button) findViewById(R.id.buttonAdd);
        Button buttonSubtract = (Button) findViewById(R.id.buttonSubtract);
        Button buttonDivide = (Button) findViewById(R.id.buttonDivide);
        Button buttonMultiply = (Button) findViewById(R.id.buttonMultiply);
        Button button0 = (Button) findViewById(R.id.button0);
        Button button1 = (Button) findViewById(R.id.button1);
        Button button2 = (Button) findViewById(R.id.button2);
        Button button3 = (Button) findViewById(R.id.button3);
        Button button4 = (Button) findViewById(R.id.button4);
        Button button5 = (Button) findViewById(R.id.button5);
        Button button6 = (Button) findViewById(R.id.button6);
        Button button7 = (Button) findViewById(R.id.button7);
        Button button8 = (Button) findViewById(R.id.button8);
        Button button9 = (Button) findViewById(R.id.button9);
        Button calc = (Button) findViewById(R.id.buttonCalc);
        Button RightBracket = (Button) findViewById(R.id.buttonRightBracket);
        Button LeftBracket = (Button) findViewById(R.id.buttonLeftBracket);
        Button clear = (Button) findViewById(R.id.buttonClear);
        final TextView Display = (TextView) findViewById(R.id.editText);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = Display.getText().toString();
                Display.setText(s + "1");
                a = 1;
            }
        });
        clear.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String s = "";
                Display.setText(s);
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = Display.getText().toString();
                Display.setText(s + "0");
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = Display.getText().toString();
                Display.setText(s + "2");
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = Display.getText().toString();
                Display.setText(s + "3");
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = Display.getText().toString();
                Display.setText(s + "4");
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = Display.getText().toString();
                Display.setText(s + "5");
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = Display.getText().toString();
                Display.setText(s + "6");
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = Display.getText().toString();
                Display.setText(s + "7");
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = Display.getText().toString();
                Display.setText(s + "8");
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = Display.getText().toString();
                Display.setText(s + "9");
            }
        });
        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = Display.getText().toString();
                Display.setText(s + "+");
            }
        });
        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = Display.getText().toString();
                Log.i("IMPUT TRING =========", s);
                InToPos temp1 = new InToPos(s);
                String a = temp1.doTrans();
                evalPostfix temp2 = new evalPostfix(a);
                int kol = temp1.arr.get(0),jko = temp1.arr.get(1);
                double result = temp2.calc(temp1.arr,temp1.k);
                if(result == 3.14)
                    Display.setText("INVALID");
                else
                Display.setText(String.valueOf(result));

            }


        });

        buttonSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = Display.getText().toString();
                Display.setText(s + "-");
            }
        });
        buttonMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = Display.getText().toString();
                Display.setText(s + "*");
            }
        });
        buttonDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = Display.getText().toString();
                Display.setText(s + "/");
            }
        });
        RightBracket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = Display.getText().toString();
                Log.i("IMPUT TRING =========", s);
                Display.setText(s + "(");
            }
        });
        LeftBracket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = Display.getText().toString();
                Log.i("IMPUT TRING =========", s);
                Display.setText(s + ")");
            }
        });
    }
}

