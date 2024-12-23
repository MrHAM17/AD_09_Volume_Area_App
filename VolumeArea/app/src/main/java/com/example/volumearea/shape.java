package com.example.volumearea;

// This class is acting as: "Model Class"
// it represents the data structure or individual data items
// that your adapter is going to display

public class shape {

    // Attributes
    private int shapeImage;
    private String shapeName;


    // Constructor
    public shape(int shapeImage, String shapeName) {
        this.shapeImage = shapeImage;
        this.shapeName = shapeName;
    }


    // Getters & Setters
    public int getShapeImage() {
        return shapeImage;
    }

    public void setShapeImage(int shapeImage) {
        this.shapeImage = shapeImage;
    }

    public String getShapeName() {
        return shapeName;
    }

    public void setShapeName(String shapeName) {
        this.shapeName = shapeName;
    }
}
