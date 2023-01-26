package com.example.calculator;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView solutionTv, resultTv;
    MaterialButton buttonC, buttonOpenBrac, buttonCloseBrac, buttonDivide, buttonMultiply, buttonAdd, buttonSubtract, buttonAc, buttonDot, buttonEqual, button9, button8, button7, button6, button5, button4, button3, button2, button1, button0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        solutionTv = findViewById(R.id.solution_tv);
        resultTv = findViewById(R.id.result_tv);
        button0 = findViewById(R.id.button_0);
        button1 = findViewById(R.id.button_1);
        assignId(button0, R.id.button_0);
        assignId(button1, R.id.button_1);
        assignId(button2, R.id.button_2);
        assignId(button3, R.id.button_3);
        assignId(button4, R.id.button_4);
        assignId(button5, R.id.button_5);
        assignId(button6, R.id.button_6);
        assignId(button7, R.id.button_7);
        assignId(button8, R.id.button_8);
        assignId(button9, R.id.button_9);
        assignId(buttonDivide, R.id.button_divide);
        assignId(buttonAdd, R.id.button_add);
        assignId(buttonAc, R.id.button_ac);
        assignId(buttonSubtract, R.id.button_subtract);
        assignId(buttonMultiply, R.id.button_multiply);
        assignId(buttonDot, R.id.button_dot);
        assignId(buttonC, R.id.button_c);
        assignId(buttonOpenBrac, R.id.button_open_bracket);
        assignId(buttonCloseBrac, R.id.button_close_bracket);
    }

    void assignId(MaterialButton btn, int id){
        btn.findViewById(id);
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        MaterialButton button = (MaterialButton) view;
        String text = button.getText().toString();
        solutionTv.setText(text);
    }

}