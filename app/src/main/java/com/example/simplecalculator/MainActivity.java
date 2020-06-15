package com.example.simplecalculator;

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
    protected void onCreate(Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            final EditText firstNumber= findViewById(R.id.number1);
            final EditText secoundNumber = findViewById(R.id.number2);
            final RadioGroup operator = findViewById(R.id.operators);
            final RadioButton add = findViewById(R.id.add);
            final RadioButton subtract = findViewById(R.id.subtract);
            final Button equals = findViewById(R.id.equal);
            final TextView result = findViewById(R.id.result);
            equals.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                           final int first_value =  Integer.parseInt( firstNumber.getText().toString());
                           final int secound_value =  Integer.parseInt(secoundNumber.getText().toString());

                           final int OperatorButtonID = operator.getCheckedRadioButtonId();
                           Integer answer;
                           if (OperatorButtonID == R.id.add){
                                   answer = first_value + secound_value;
                           }
                           else{
                                   answer = first_value - secound_value;
                           }
                           result.setText(answer.toString());
                    }
            });
    }
}