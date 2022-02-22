package com.example.cruz_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText var1txt, var2txt ; //declared 2 editText boxes
    Button btnAdd, btnSubtract, btnMultiply, btnDivide, btnModulo ; //declared 5 buttons
    TextView answerText ; //text view for answer

    double variable1, variable2 ;

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

        //answer display
        answerText = findViewById(R.id.txtAnswer) ;

        btnAdd.setOnClickListener(this);
        btnSubtract.setOnClickListener(this);
        btnMultiply.setOnClickListener(this);
        btnDivide.setOnClickListener(this);
        btnModulo.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        // input text boxes
        var1txt = findViewById(R.id.txtBox1) ;
        var2txt = findViewById(R.id.txtBox2) ;

        variable1 = Double.parseDouble(var1txt.getText().toString()) ;
        variable2 = Double.parseDouble(var2txt.getText().toString()) ;

        switch(v.getId()) {
            case R.id.btnAdd :
                answerText.setText(Double.toString(variable1 + variable2));
                break ;

            case R.id.btnSubtract :
                answerText.setText(Double.toString(variable1 - variable2));
                break ;

            case R.id.btnMultiply :
                answerText.setText(Double.toString(variable1 * variable2));
                break ;

            case R.id.btnDivide :
                answerText.setText(Double.toString(variable1 / variable2));
                break ;

            case R.id.btnModulo :
                answerText.setText(Double.toString(variable1 % variable2));
                break ;

        }


    }

}