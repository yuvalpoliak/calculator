package com.example.firstproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText firstNumber = findViewById(R.id.number1);
        final EditText secondNumber = findViewById(R.id.number2);
        final RadioGroup operators = findViewById(R.id.asas);
        final RadioButton add = findViewById(R.id.add);
        final RadioButton subtract = findViewById(R.id.subtract);
        final Button equals = findViewById(R.id.equals);
        final TextView result = findViewById(R.id.result);
        final RadioButton duplicate = findViewById(R.id.duplicate);
        final RadioButton divide = findViewById(R.id.divide);
        equals.setText("=");

        equals.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                final double firstNumberValue = Integer.parseInt(firstNumber.getText().toString());
                final double secondNumberValue = Integer.parseInt(secondNumber.getText().toString());
                final int operatorButtonId = operators.getCheckedRadioButtonId();
                Double answer;

                    if (operatorButtonId == R.id.add) {
                        answer = firstNumberValue + secondNumberValue;

                    } else if(operatorButtonId == R.id.subtract) {
                        answer = firstNumberValue - secondNumberValue;
                    }
                    else if(operatorButtonId == R.id.duplicate) {
                        answer = firstNumberValue * secondNumberValue;
                    }
                    else{
                        answer = firstNumberValue / secondNumberValue;
                    }

                    result.setText(answer.toString());


                }


        });



    }
}