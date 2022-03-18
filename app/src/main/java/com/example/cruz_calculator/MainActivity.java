package com.example.cruz_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText var1txt, var2txt ;
    Button btnAdd, btnSubtract, btnMultiply, btnDivide, btnModulo , btnClear;
    TextView txtAnswer ; //text view for answer

    double variable1, variable2, answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //buttons
        btnAdd = findViewById(R.id.btnAdd) ;
        btnSubtract = findViewById(R.id.btnSubtract) ;
        btnMultiply = findViewById(R.id.btnMultiply) ;
        btnDivide = findViewById(R.id.btnDivide) ;
        btnModulo = findViewById(R.id.btnModulo) ;
        btnClear = findViewById(R.id.btnClear) ;

        // input text boxes
        var1txt = findViewById(R.id.txtBox1) ;
        var2txt = findViewById(R.id.txtBox2) ;

        //answer display
        txtAnswer = findViewById(R.id.txtAnswer) ;

        btnAdd.setOnClickListener(this);
        btnSubtract.setOnClickListener(this);
        btnMultiply.setOnClickListener(this);
        btnDivide.setOnClickListener(this);
        btnModulo.setOnClickListener(this);
        btnClear.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        variable1 = Double.parseDouble(String.valueOf(var1txt.getText())) ;
        variable2 = Double.parseDouble(String.valueOf(var2txt.getText())) ;


        switch(v.getId()) {
            case R.id.btnAdd :
               addition();
                break ;

            case R.id.btnSubtract :
                subtract();
                break ;

            case R.id.btnMultiply :
                multiply();
                break ;

            case R.id.btnDivide :
                divide();
                break ;

            case R.id.btnModulo :
                modulo();
                break ;

            case R.id.btnClear :
                clear();
                break ;
        }


    }


    @SuppressLint("SetTextI18n")
    public void addition() {
            answer = variable1 + variable2 ;
            txtAnswer.setText(Double.toString(answer));

    }

    @SuppressLint("SetTextI18n")
    public void subtract() {
        answer = variable1 - variable2 ;
        txtAnswer.setText(Double.toString(answer));

    }
    @SuppressLint("SetTextI18n")
    public void multiply() {
        answer = variable1 * variable2 ;
        txtAnswer.setText(Double.toString(answer));

    }
    @SuppressLint("SetTextI18n")
    public void divide() {
        answer = variable1 / variable2 ;
        txtAnswer.setText(Double.toString(answer));

    }
    @SuppressLint("SetTextI18n")
    public void modulo() {
        answer = variable1 % variable2 ;
        txtAnswer.setText(Double.toString(answer));

    }

    @SuppressLint("SetTextI18n")
    public void clear() {
        variable1 = 0 ;
        variable2 = 0 ;
        answer = 0 ;

        var1txt.setText("") ;
        var2txt.setText("") ;
        txtAnswer.setText(Double.toString(answer));

    }

}