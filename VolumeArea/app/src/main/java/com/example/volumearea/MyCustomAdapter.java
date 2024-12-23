package com.example.volumearea;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;


// This class will be responsible for creating
// the view for each item and binding data to it
public class MyCustomAdapter extends ArrayAdapter<shape> {

    // Attributes from GridViewLayout
    private ArrayList<shape> shapesArrayList;
    Context context;


    // Constructor with Super
    public MyCustomAdapter(ArrayList<shape> shapesArrayList, Context context) {
        super(context, R.layout.grid_view_item, shapesArrayList);
        this.shapesArrayList = shapesArrayList;
        this.context = context;
    }

    // View Holder: Used to cache references to the views within an item layout
    public static class MyViewHolder{
        ImageView shapeImage;
        TextView shapeName;
    }

    // GetView(): Used to create and return a view for a specific item in Grid.
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        // 1 - get the shape object from current position
        shape shape = getItem(position);

        // 2 - Inflating layout
        MyViewHolder holder = new MyViewHolder();

        if(convertView==null){
            // no view went off-screen --> Create a new view
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.grid_view_item, parent,false);

            // Finding the views
            holder.shapeImage = (ImageView) convertView.findViewById(R.id.shapeImage);
            holder.shapeName = (TextView) convertView.findViewById(R.id.shapeName);

            convertView.setTag(holder);
        }else{
            // a view went off-screen --> reuse it
            holder = (MyViewHolder) convertView.getTag();
        }

        // Getting the data from modal class (shapes)
        holder.shapeImage.setImageResource(shape.getShapeImage());
        holder.shapeName.setText(shape.getShapeName());

        return convertView;
    }
}
