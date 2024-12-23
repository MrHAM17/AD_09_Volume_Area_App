package com.example.volumearea;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class GridViewLayout extends AppCompatActivity {

    TextView title;

    // 1: AdapterView - GridView
    GridView gridView;

    // 2: Data Source - ArrayList<shapes>
    ArrayList<shape> shapesArrayList;

    // 3: Adapter - MyCustomAdapter
    MyCustomAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_grid_view_layout);
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;
//        });`

        gridView = findViewById(R.id.grid_view);

        shapesArrayList = new ArrayList<>();
        shape s1 = new shape(R.drawable.sphere, "Sphere");
        shape s2 = new shape(R.drawable.cylinder, "Cylinder");
        shape s3 = new shape(R.drawable.cube, "Cube");
        shape s4 = new shape(R.drawable.prism, "Prism");
        shapesArrayList.add(s1);
        shapesArrayList.add(s2);
        shapesArrayList.add(s3);
        shapesArrayList.add(s4);

        myAdapter = new MyCustomAdapter(shapesArrayList, getApplicationContext());

        gridView.setAdapter(myAdapter);

        // Grid structure can be manage from here (like below) or XML file (in gridView tag by adding --> android:numColumns="2")
        gridView.setNumColumns(2);


//        The issue occurs while setting the Intent in GridViewLayout class.
//        Below code is setting the same Intent for all items in the grid,
//        which always navigates to the Sphere activity:
//        This code does not differentiate between the different shapes.
//        Need to customize the Intent based on the item clicked.


//        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                Intent i = new Intent(getApplicationContext(), Sphere.class);
//                startActivity(i);
//            }
//        });


//        Here’s how we can fix this:
//        Modify the onItemClick method to check the clicked item's position and navigate to the appropriate activity.
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent;
                switch (position) {
                    case 0: // Sphere
                        intent = new Intent(getApplicationContext(), Sphere.class);
                        break;
                    case 1: // Cylinder
                        intent = new Intent(getApplicationContext(), Cylinder.class);
                        break;
                    case 2: // Cube
                        intent = new Intent(getApplicationContext(), Cube.class);
                        break;
                    case 3: // Prism
                        intent = new Intent(getApplicationContext(), Prism.class);
                        break;
                    default:
                        return;
                }
                startActivity(intent);
            }
        });

    }
}