package com.company;

public class Area {

    double length;
    double width;

    public Area() {} // default constructor

    public  Area (double newLength, double newWidth){ // 2nd constructor
        this.length = newLength;
        this.width = newWidth;
    }

    public double getAreaofRectangle (double newLength, double newWidth){
        return newLength * newWidth;
    }
    public double getPerimeter (double newLength, double newWidth) {
        return 2 * (newLength + newWidth);
    }
}   // public class Area END






//    public double getLength() {
//        return length;
//    }
//
//    public void setLength(double newLength) {
//        this.length = newLength;
//    }
//
//    public double getWidth() {
//        return width;
//    }
//
//    public void setWidth(double width) {
//        this.width = width;
//    }