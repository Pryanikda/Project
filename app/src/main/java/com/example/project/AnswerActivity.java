package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class AnswerActivity extends AppCompatActivity {
    private TextView numb1;
    private TextView numb2;
    private EditText answer;
    private Button check;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer);
        Calculator calculator = new Calculator();
        int num1 = calculator.num1;
        int num2 = calculator.num2;



        numb1 = findViewById(R.id.numb1);
        numb1.setText(Integer.toString(num1));
        numb2 = findViewById(R.id.numb2);
        numb2.setText(Integer.toString(num2));
        answer = findViewById(R.id.answer);
        check = findViewById(R.id.check);
        check.setOnClickListener(listener);

    }

    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Calculator calculator = new Calculator();
            int answer1 = calculator.answer1;
            answer.getText().toString();
            int result = Integer.parseInt(String.valueOf(answer));



            if (result == answer1) {
                Toast toast = Toast.makeText(getApplicationContext(),
                        "Все правильно:)!!!", Toast.LENGTH_SHORT);
                toast.show();
            } else {
                Toast toast = Toast.makeText(getApplicationContext(),
                        "Не правильно:( Попробуй еще раз", Toast.LENGTH_SHORT);
                toast.show();
            }
        }
    };
}