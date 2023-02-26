package com.example.calculater;

import static android.opengl.Matrix.length;
import static com.example.calculater.R.id.btnClear;
import static com.example.calculater.R.id.editText;

import androidx.appcompat.app.AppCompatActivity;

import android.net.wifi.rtt.ResponderConfig;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.BreakIterator;

public class MainActivity extends AppCompatActivity {
    boolean NewOp =true;
    String oldNumber ;
    String op ;
    EditText ed1;
    TextView re1;
    int result = 0;


   
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed1 = findViewById(R.id.editText);
        re1 = findViewById(R.id.txtResult);
    }

    public void numberEvent(View view) {
        if (NewOp)
            ed1.setText("");
        NewOp = false;
        String number = ed1.getText().toString();
        switch (view.getId()) {
            case R.id.btnOne:
                number += "1";
                break;

            case R.id.btnTwo:
                number += "2";
                break;

            case R.id.btnThree:
                number += "3";
                break;

            case R.id.btnFour:
                number += "4";
                break;

            case R.id.btnFive:
                number += "5";
                break;

            case R.id.btnSix:
                number += "6";
                break;

            case R.id.btnSeven:
                number += "7";
                break;

            case R.id.btnEight:
                number += "8";
                break;

            case R.id.btnNine:
                number += "9";
                break;

            case R.id.btnZero:
                number += "0";
                break;

            case R.id.btnDot:
                number += ".";
                break;

            case R.id.btnMinus:
                number += "-" + number;
                break;
            case R.id.btnParenthesisstarting:
                number += "(";
                break;
            case R.id. btnParenthesisending:
                number += ")";
                break;


        }
        ed1.setText(number);
    }

    public void operatorEvent(View view) {
        NewOp = true;
        oldNumber = ed1.getText().toString();
        switch (view.getId()) {
            case R.id.btnDivision:
                op = "/";
                break;
            case R.id.btnMultiplication:
                op = "*";
                break;
            case R.id.btnPlus:
                op = "+";
                break;
            case R.id.btnMinus:
                op = "-";
                break;
        }
        ed1.setText(op);
    }
    public void equalEvent(View view) {
        String newNumber = ed1.getText().toString();

        switch (op) {
            case "+":
                result = Integer.parseInt(oldNumber) + Integer.parseInt(newNumber);
                break;

                case "-":
                    result = Integer.parseInt(oldNumber) - Integer.parseInt(newNumber);

                    break;

            case "*":
                result = Integer.parseInt(oldNumber) * Integer.parseInt(newNumber);
                break;
            case "/":
                result = Integer.parseInt(oldNumber) / Integer.parseInt(newNumber);
                break;
        }
         re1.setText(result+ "");

    }
    public void acEvent(View view){
        ed1.setText("");
        re1.setText("");
        boolean NewOp = true;
    }
  
}