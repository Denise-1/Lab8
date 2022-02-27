// Denise Chen
// IS 147-04
// d189@umbc.edu
// 11/23/2021
// use constructor, getter, and setter
// to calculate area and perimeter

package com.company;

public class Main {
    public static void main(String[] args) {

        Area calc = new Area(10.0,15.0);

        System.out.println("The perimeter of a rectangle is: " + calc.getAreaofRectangle(calc.length,calc.width));
        System.out.println("The area of a rectangle is: " + calc.getPerimeter(calc.length, calc.width));
    }
}
