package com.example.volumearea;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class Sphere extends AppCompatActivity {

    TextView title, result;
    EditText editText;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sphere);
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;
//        });

        title = findViewById(R.id.title);
        result = findViewById(R.id.result);
        editText = findViewById(R.id.editText);
        button = findViewById(R.id.button);

//        // Told in course
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String radius = editText.getText().toString();
//                int r = Integer.parseInt(radius);
//
//                // V = (4/3) * pi * r^3
//                double volume = (4/3) * 3.14159 * r*r*r ;
//                result.setText("Volume = "+volume+" m^3");
//            }
//        });


//        // I added
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    // Get the radius from the EditText
                    String radius = editText.getText().toString();

                    // Check if radius is not empty
                    if (!radius.isEmpty()) {
//                        int r = Integer.parseInt(radius);
                        double r = Double.parseDouble(radius);

                        // Correct the formula for volume calculation (use 4.0/3 to ensure floating-point division)
                        double volume = (4.0 / 3) * 3.14159 * r * r * r;

                        // Display the result
                        result.setText("Volume = " + volume + " m^3");
                    } else {
                        result.setText("Please enter a radius.");
                    }
                } catch (NumberFormatException e) {
                    // Handle invalid input
                    result.setText("Invalid input. Please enter a valid number.");
                }
            }
        });


    }
}