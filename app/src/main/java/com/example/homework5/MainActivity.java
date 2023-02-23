package com.example.homework5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ViewAnimator;

public class MainActivity extends AppCompatActivity {
    //Поля для вывода на экран нужных значений
    private EditText massIn;
    private Button button;
    private TextView massOut;
    //Создание поля для алгоритма
    private String mass = "";
    Algorithm algorithm = new Algorithm();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Присваивание переменным представления activity_main
        massIn = findViewById(R.id.massIn);
        button = findViewById(R.id.button);
        massOut = findViewById(R.id.massOut);
        //Выполнение действий при нажатии кнопки
        button.setOnClickListener(listener);

    }
    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            //считывание введённго значения
            mass = massIn.getText().toString();
            //вывод на экран
            massOut.setText("Вам необходимо " + algorithm.massCalculation(mass) + " килогамм топлива, чтобы поднять груз массой " + mass + " килограмм");
        }
    };
}