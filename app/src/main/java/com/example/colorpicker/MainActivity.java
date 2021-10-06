package com.example.colorpicker;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private RelativeLayout layout;
    private TextView textViewColor;
    private SeekBar red;
    private SeekBar green;
    private SeekBar blue;
    String redProgress;
    String greenProgress;
    String blueProgress;
    int redProgress_int;
    int greenProgress_int;
    int blueProgress_int;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

        red.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar red, int progress, boolean b) {
                redProgress = String.valueOf(progress);
                textViewColor.setText("(" + redProgress + "," + greenProgress + "," + blueProgress + ")");
                redProgress_int = Integer.parseInt(redProgress);
                textViewColor.setBackgroundColor(Color.rgb(redProgress_int, greenProgress_int, blueProgress_int));
            }

            @Override
            public void onStartTrackingTouch(SeekBar red) {
            }

            @Override
            public void onStopTrackingTouch(SeekBar red) {
            }
        });

        green.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar green, int progress, boolean b) {
                greenProgress = String.valueOf(progress);
                textViewColor.setText("(" + redProgress + "," + greenProgress + "," + blueProgress + ")");
                greenProgress_int = Integer.parseInt(greenProgress);
                textViewColor.setBackgroundColor(Color.rgb(redProgress_int, greenProgress_int, blueProgress_int));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });

        blue.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar blue, int progress, boolean b) {
                blueProgress = String.valueOf(progress);
                textViewColor.setText("(" + redProgress + "," + greenProgress + "," + blueProgress + ")");
                blueProgress_int = Integer.parseInt(blueProgress);
                textViewColor.setBackgroundColor(Color.rgb(redProgress_int, greenProgress_int, blueProgress_int));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });

    }

    public void init() {
        layout = findViewById(R.id.layout);
        textViewColor = findViewById(R.id.textViewColor);
        redProgress = "0";
        greenProgress = "0";
        blueProgress = "0";
        red = findViewById(R.id.red);
        green = findViewById(R.id.green);
        blue = findViewById(R.id.blue);
    }
}