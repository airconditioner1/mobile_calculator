package com.cs407.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void goToActivity(double d){
        Intent intent = new Intent(this, Result.class);
        intent.putExtra("resultValue",d);
        startActivity(intent);
    }
    public void add(View view){
        Log.i("INFO", "add Button Pressed");
        EditText input1 = (EditText) findViewById(R.id.input1);
        EditText input2 = (EditText) findViewById(R.id.input2);

        String text1 = input1.getText().toString();
        String text2 = input2.getText().toString();

        // Convert the text to double
        double num1 = Double.parseDouble(text1);
        double num2 = Double.parseDouble(text2);

        // Perform addition
        double sum = num1 + num2;
        goToActivity(sum);
    }

    public void subtract(View view){
        Log.i("INFO", "subtract Button Pressed");
        EditText input1 = (EditText) findViewById(R.id.input1);
        EditText input2 = (EditText) findViewById(R.id.input2);

        String text1 = input1.getText().toString();
        String text2 = input2.getText().toString();

        // Convert the text to double
        double num1 = Double.parseDouble(text1);
        double num2 = Double.parseDouble(text2);

        // Perform addition
        double sum = num1 - num2;
        goToActivity(sum);
    }
    public void multiply(View view){
        Log.i("INFO", "multiply Button Pressed");
        EditText input1 = (EditText) findViewById(R.id.input1);
        EditText input2 = (EditText) findViewById(R.id.input2);

        String text1 = input1.getText().toString();
        String text2 = input2.getText().toString();

        // Convert the text to double
        double num1 = Double.parseDouble(text1);
        double num2 = Double.parseDouble(text2);

        // Perform addition
        double sum = num1 * num2;
        goToActivity(sum);
    }
    public void divide(View view){
        Log.i("INFO", "divide Button Pressed");
        EditText input1 = (EditText) findViewById(R.id.input1);
        EditText input2 = (EditText) findViewById(R.id.input2);

        String text1 = input1.getText().toString();
        String text2 = input2.getText().toString();

        // Convert the text to double
        double num1 = Double.parseDouble(text1);
        double num2 = Double.parseDouble(text2);

        // Perform addition
        double sum = num1 / num2;
        goToActivity(sum);
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}