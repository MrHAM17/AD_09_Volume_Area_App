package com.example.volumearea;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Cube extends AppCompatActivity {

    TextView result;
    EditText editTextSide;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cube);

        result = findViewById(R.id.result);
        editTextSide = findViewById(R.id.editTextSide);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String sideInput = editTextSide.getText().toString();

                    if (!sideInput.isEmpty()) {
                        double side = Double.parseDouble(sideInput);

                        // Volume of Cube: side³
                        double volume = Math.pow(side, 3);

                        result.setText(String.format("Volume = %.2f m³", volume));
                    } else {
                        result.setText("Please enter side length.");
                    }
                } catch (NumberFormatException e) {
                    result.setText("Invalid input. Please enter a valid number.");
                }
            }
        });
    }
}
