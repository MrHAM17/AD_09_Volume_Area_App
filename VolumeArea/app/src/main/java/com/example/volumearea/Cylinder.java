package com.example.volumearea;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Cylinder extends AppCompatActivity {

    TextView result;
    EditText editTextRadius, editTextHeight;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cylinder);

        result = findViewById(R.id.result);
        editTextRadius = findViewById(R.id.editTextRadius);
        editTextHeight = findViewById(R.id.editTextHeight);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String radiusInput = editTextRadius.getText().toString();
                    String heightInput = editTextHeight.getText().toString();

                    if (!radiusInput.isEmpty() && !heightInput.isEmpty()) {
                        double radius = Double.parseDouble(radiusInput);
                        double height = Double.parseDouble(heightInput);

                        // Volume of Cylinder: π * r² * h
                        double volume = Math.PI * Math.pow(radius, 2) * height;

                        result.setText(String.format("Volume = %.2f m³", volume));
                    } else {
                        result.setText("Please enter radius and height.");
                    }
                } catch (NumberFormatException e) {
                    result.setText("Invalid input. Please enter valid numbers.");
                }
            }
        });
    }
}
