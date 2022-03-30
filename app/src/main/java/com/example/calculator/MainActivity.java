package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, b00, ac, plus, minus, multi, equal, dot, taka, Divisan;
    TextView text_number;
    char ope;
    int first_num, second_num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        plus = findViewById(R.id.plus);
        dot = findViewById(R.id.dot);
        taka = findViewById(R.id.taka);
        Divisan = findViewById(R.id.Division);
        minus = findViewById(R.id.minus);
        multi = findViewById(R.id.multi);
        equal = findViewById(R.id.equal);
        ac = findViewById(R.id.ac);
        text_number = findViewById(R.id.text);
        b1 = findViewById(R.id.one);
        b2 = findViewById(R.id.two);
        b3 = findViewById(R.id.three);
        b4 = findViewById(R.id.fore);
        b5 = findViewById(R.id.five);
        b6 = findViewById(R.id.six);
        b7 = findViewById(R.id.seven);
        b8 = findViewById(R.id.eight);
        b9 = findViewById(R.id.nine);
        b0 = findViewById(R.id.zero);
        b00 = findViewById(R.id.d_zero);

        ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num = text_number.getText().toString();
                text_number.setText("-");
            }
        });
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                first_num = Integer.parseInt(text_number.getText().toString());
                text_number.setText("");
                ope = '+';
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                first_num = Integer.parseInt(text_number.getText().toString());
                text_number.setText("");
                ope = '-';
            }
        });
        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                first_num = Integer.parseInt(text_number.getText().toString());
                text_number.setText("");
                ope = '*';
            }
        });
        taka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                first_num = Integer.parseInt(text_number.getText().toString());
                text_number.setText("");
                ope = '%';
            }
        });
        Divisan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                first_num = Integer.parseInt(text_number.getText().toString());
                text_number.setText("");
                ope = '/';
            }
        });

        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num = text_number.getText().toString();
                text_number.setText(".");
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num = text_number.getText().toString();
                text_number.setText(num + "1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num = text_number.getText().toString();
                text_number.setText(num + "2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num = text_number.getText().toString();
                text_number.setText(num + "3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num = text_number.getText().toString();
                text_number.setText(num + "4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num = text_number.getText().toString();
                text_number.setText(num + "5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num = text_number.getText().toString();
                text_number.setText(num + "6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num = text_number.getText().toString();
                text_number.setText(num + "7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num = text_number.getText().toString();
                text_number.setText(num + "8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num = text_number.getText().toString();
                text_number.setText(num + "9");
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num = text_number.getText().toString();
                text_number.setText(num + "0");
            }
        });
        b00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num = text_number.getText().toString();
                text_number.setText(num + "00");
            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ope == '+') {
                    second_num = Integer.parseInt(text_number.getText().toString());
                    addition();

                } else if (ope == '-') {
                    second_num = Integer.parseInt(text_number.getText().toString());
                    substration();
                } else if (ope == '*') {
                    second_num = Integer.parseInt(text_number.getText().toString());
                    multiplion();
                } else if (ope == '%') {
                    second_num = Integer.parseInt(text_number.getText().toString());
                    taka();
                } else if (ope == '/') {
                    second_num = Integer.parseInt(text_number.getText().toString());
                    Divisan();
                }
            }

        });
    }

    void addition() {
        int sum = first_num + second_num;
        text_number.setText("" + sum);
    }

    void substration() {
        int sum = first_num - second_num;
        text_number.setText("" + sum);
    }

    void multiplion() {
        int sum = first_num * second_num;
        text_number.setText("" + sum);
    }

    void taka() {
        int sum = first_num % second_num;
        text_number.setText("" + sum);
    }

    void Divisan() {
        int sum = first_num / second_num;
        text_number.setText("" + sum);
    }
}

