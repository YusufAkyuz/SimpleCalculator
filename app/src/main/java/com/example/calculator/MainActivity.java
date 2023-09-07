package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.calculator.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    EditText number1;
    EditText number2;

    TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view =binding.getRoot();
        setContentView(view);

        number1 = binding.number1Text;
        number2 = binding.number2Text;

        resultText = binding.ResultText;


    }

    public void sum(View view) {
        if (number1.getText().toString().equals("") || number2.getText().toString().equals("")) {
            resultText.setText("!Enter Number!");
        } else {
            int num1 = Integer.parseInt(number1.getText().toString());
            int num2 = Integer.parseInt(number2.getText().toString());

            int result = num1 + num2;

            resultText.setText("Result: " + result);
        }
    }
}