package com.example.volumearea;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Prism extends AppCompatActivity {

    TextView result;
    EditText editTextBaseArea, editTextHeight;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prism);

        result = findViewById(R.id.result);
        editTextBaseArea = findViewById(R.id.editTextBaseArea);
        editTextHeight = findViewById(R.id.editTextHeight);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String baseAreaInput = editTextBaseArea.getText().toString();
                    String heightInput = editTextHeight.getText().toString();

                    if (!baseAreaInput.isEmpty() && !heightInput.isEmpty()) {
                        double baseArea = Double.parseDouble(baseAreaInput);
                        double height = Double.parseDouble(heightInput);

                        // Volume of Prism: Base Area * Height
                        double volume = baseArea * height;

                        result.setText(String.format("Volume = %.2f m³", volume));
                    } else {
                        result.setText("Please enter base area and height.");
                    }
                } catch (NumberFormatException e) {
                    result.setText("Invalid input. Please enter valid numbers.");
                }
            }
        });
    }
}
