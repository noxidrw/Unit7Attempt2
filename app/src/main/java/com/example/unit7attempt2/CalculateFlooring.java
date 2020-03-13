package com.example.unit7attempt2;

public class CalculateFlooring {

    double floorWidth;
    double floorLength;

    public CalculateFlooring() { }

    public double FloorCalc(){
        return floorLength * floorWidth;
    }

    public double getFloorLength() {
        return floorLength;
    }

    public double getFloorWidth() {
        return floorWidth;
    }

    public void setFloorLength(double floorLength) {
        this.floorLength = floorLength;
    }

    public void setFloorWidth(double floorWidth) {
        this.floorWidth = floorWidth;
    }
}
