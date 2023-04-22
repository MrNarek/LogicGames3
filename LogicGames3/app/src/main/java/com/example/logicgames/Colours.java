package com.example.logicgames;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.TextView;

public class Colours extends AppCompatActivity {
    TextView timer, points, clText, clColor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colours);
        timer = findViewById(R.id.timer);
        clText = findViewById(R.id.clText);
        clColor = findViewById(R.id.clColor);
        new CountDownTimer(30000, 1000) {
            @Override
            public void onTick(long l) {
                timer.setText("0:" + l / 1000);
                if ((l / 1000) < 10) timer.setText("0:0" + l / 1000);
            }

            @Override
            public void onFinish() {
                Intent intent1 = new Intent(Colours.this, GuestMode.class);
                startActivity(intent1);
            }
        }.start();

        String[] clTexts = {"Красный", "Зеленый", "Синий", "Желтый", "Черный", "Фиолетовый"};
        String[] clColours = {"#FF0000", "#00FF00", "#0000FF", "#FFFF00", "#000000", "#800080"};
        clText.setText(clTexts[0]);
        clText.setTextColor(Color.parseColor(clColours[0]));
        clColor.setText(clTexts[1]);
        clColor.setTextColor(Color.parseColor(clColours[1]));
    }
}