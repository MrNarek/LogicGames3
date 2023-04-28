package com.example.logicgames;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class Colours extends AppCompatActivity {
    TextView timer, points, clText, clColor;
    Button btnYes, btnNo;
    boolean isTimerTicking = true;
    int pts = 0;

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
                isTimerTicking = false;
            }
        }.start();

        String[] clTexts = {"Красный", "Зеленый", "Синий", "Желтый", "Черный", "Фиолетовый"};
        String[] clColors = {"#FF0000", "#00FF00", "#0000FF", "#FFFF00", "#000000", "#800080"};
        clText.setText(clTexts[0]);
        clText.setTextColor(Color.parseColor(clColors[0]));
        clColor.setText(clTexts[1]);
        clColor.setTextColor(Color.parseColor(clColors[1]));
        Random random = new Random();
        int rnuml;
        while (isTimerTicking) {
            btnYes.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (clText.getText().toString() == "Красный" && clColor.getCurrentTextColor() == 0xff0000) {
                        points.setText(pts += 1);
                        clText.setText(clTexts[random.nextInt(0) + clTexts.length - 1]);
                        clText.setTextColor(Color.parseColor(clColors[random.nextInt(0) + clTexts.length - 1]));
                        clColor.setText(clTexts[random.nextInt(0) + clTexts.length - 1]);
                        clColor.setTextColor(Color.parseColor(clColors[random.nextInt(0) + clTexts.length - 1]));
                    } else if (clText.getText().toString() == "Зеленый" && clColor.getCurrentTextColor() == 0x00ff00) {
                        points.setText(pts += 1);
                        clText.setText(clTexts[random.nextInt(0) + clTexts.length - 1]);
                        clText.setTextColor(Color.parseColor(clColors[random.nextInt(0) + clTexts.length - 1]));
                        clColor.setText(clTexts[random.nextInt(0) + clTexts.length - 1]);
                        clColor.setTextColor(Color.parseColor(clColors[random.nextInt(0) + clTexts.length - 1]));
                    } else if (clText.getText().toString() == "Синий" && clColor.getCurrentTextColor() == 0x0000ff) {
                        points.setText(pts += 1);
                        clText.setText(clTexts[random.nextInt(0) + clTexts.length - 1]);
                        clText.setTextColor(Color.parseColor(clColors[random.nextInt(0) + clTexts.length - 1]));
                        clColor.setText(clTexts[random.nextInt(0) + clTexts.length - 1]);
                        clColor.setTextColor(Color.parseColor(clColors[random.nextInt(0) + clTexts.length - 1]));
                    } else if (clText.getText().toString() == "Желтый" && clColor.getCurrentTextColor() == 0xffff00) {
                        points.setText(pts += 1);
                        clText.setText(clTexts[random.nextInt(0) + clTexts.length - 1]);
                        clText.setTextColor(Color.parseColor(clColors[random.nextInt(0) + clTexts.length - 1]));
                        clColor.setText(clTexts[random.nextInt(0) + clTexts.length - 1]);
                        clColor.setTextColor(Color.parseColor(clColors[random.nextInt(0) + clTexts.length - 1]));
                    } else if (clText.getText().toString() == "Черный" && clColor.getCurrentTextColor() == 0x000000) {
                        points.setText(pts += 1);
                        clText.setText(clTexts[random.nextInt(0) + clTexts.length - 1]);
                        clText.setTextColor(Color.parseColor(clColors[random.nextInt(0) + clTexts.length - 1]));
                        clColor.setText(clTexts[random.nextInt(0) + clTexts.length - 1]);
                        clColor.setTextColor(Color.parseColor(clColors[random.nextInt(0) + clTexts.length - 1]));
                    } else if (clText.getText().toString() == "Фиолетовый" && clColor.getCurrentTextColor() == 0x800080) {
                        points.setText(pts += 1);
                        clText.setText(clTexts[random.nextInt(0) + clTexts.length - 1]);
                        clText.setTextColor(Color.parseColor(clColors[random.nextInt(0) + clTexts.length - 1]));
                        clColor.setText(clTexts[random.nextInt(0) + clTexts.length - 1]);
                        clColor.setTextColor(Color.parseColor(clColors[random.nextInt(0) + clTexts.length - 1]));
                    } else {
                        clText.setText(clTexts[random.nextInt(0) + clTexts.length - 1]);
                        clText.setTextColor(Color.parseColor(clColors[random.nextInt(0) + clTexts.length - 1]));
                        clColor.setText(clTexts[random.nextInt(0) + clTexts.length - 1]);
                        clColor.setTextColor(Color.parseColor(clColors[random.nextInt(0) + clTexts.length - 1]));
                    }


                    btnNo.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (clText.getText().toString() == "Красный" && clColor.getCurrentTextColor() != 0xff0000) {
                                points.setText(pts += 1);
                                clText.setText(clTexts[random.nextInt(0) + clTexts.length - 1]);
                                clText.setTextColor(Color.parseColor(clColors[random.nextInt(0) + clTexts.length - 1]));
                                clColor.setText(clTexts[random.nextInt(0) + clTexts.length - 1]);
                                clColor.setTextColor(Color.parseColor(clColors[random.nextInt(0) + clTexts.length - 1]));
                            } else if (clText.getText().toString() == "Зеленый" && clColor.getCurrentTextColor() != 0x00ff00) {
                                points.setText(pts += 1);
                                clText.setText(clTexts[random.nextInt(0) + clTexts.length - 1]);
                                clText.setTextColor(Color.parseColor(clColors[random.nextInt(0) + clTexts.length - 1]));
                                clColor.setText(clTexts[random.nextInt(0) + clTexts.length - 1]);
                                clColor.setTextColor(Color.parseColor(clColors[random.nextInt(0) + clTexts.length - 1]));
                            } else if (clText.getText().toString() == "Синий" && clColor.getCurrentTextColor() != 0x0000ff) {
                                points.setText(pts += 1);
                                clText.setText(clTexts[random.nextInt(0) + clTexts.length - 1]);
                                clText.setTextColor(Color.parseColor(clColors[random.nextInt(0) + clTexts.length - 1]));
                                clColor.setText(clTexts[random.nextInt(0) + clTexts.length - 1]);
                                clColor.setTextColor(Color.parseColor(clColors[random.nextInt(0) + clTexts.length - 1]));
                            } else if (clText.getText().toString() == "Желтый" && clColor.getCurrentTextColor() != 0xffff00) {
                                points.setText(pts += 1);
                                clText.setText(clTexts[random.nextInt(0) + clTexts.length - 1]);
                                clText.setTextColor(Color.parseColor(clColors[random.nextInt(0) + clTexts.length - 1]));
                                clColor.setText(clTexts[random.nextInt(0) + clTexts.length - 1]);
                                clColor.setTextColor(Color.parseColor(clColors[random.nextInt(0) + clTexts.length - 1]));
                            } else if (clText.getText().toString() == "Черный" && clColor.getCurrentTextColor() != 0x000000) {
                                points.setText(pts += 1);
                                clText.setText(clTexts[random.nextInt(0) + clTexts.length - 1]);
                                clText.setTextColor(Color.parseColor(clColors[random.nextInt(0) + clTexts.length - 1]));
                                clColor.setText(clTexts[random.nextInt(0) + clTexts.length - 1]);
                                clColor.setTextColor(Color.parseColor(clColors[random.nextInt(0) + clTexts.length - 1]));
                            } else if (clText.getText().toString() == "Фиолетовый" && clColor.getCurrentTextColor() != 0x800080) {
                                points.setText(pts += 1);
                                clText.setText(clTexts[random.nextInt(0) + clTexts.length - 1]);
                                clText.setTextColor(Color.parseColor(clColors[random.nextInt(0) + clTexts.length - 1]));
                                clColor.setText(clTexts[random.nextInt(0) + clTexts.length - 1]);
                                clColor.setTextColor(Color.parseColor(clColors[random.nextInt(0) + clTexts.length - 1]));
                            } else {
                                clText.setText(clTexts[random.nextInt(0) + clTexts.length - 1]);
                                clText.setTextColor(Color.parseColor(clColors[random.nextInt(0) + clTexts.length - 1]));
                                clColor.setText(clTexts[random.nextInt(0) + clTexts.length - 1]);
                                clColor.setTextColor(Color.parseColor(clColors[random.nextInt(0) + clTexts.length - 1]));
                            }
                        }
                    });
                }
            });
        }
    }
}