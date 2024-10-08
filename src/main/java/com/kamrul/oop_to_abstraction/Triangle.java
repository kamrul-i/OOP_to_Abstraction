package com.kamrul.oop_to_abstraction;
public class Triangle extends Shape {

    //it is parameterized constractor
    Triangle(double dimantion1, double dimantion2) {
        super(dimantion1, dimantion2);  //super class এর parameterized constractor কে call করা হয়েছে।।
    }

    //it is method.
    @Override
    void area() {
        double result = 0.5 * dimantion1 * dimantion2;
        System.out.println("Triangle area is : " + result);
    }
    //এখানে সকল class একটি class(shape)কে extends/inherit করেছে, এরকম extends কে Hierarchical inheritance বলে।। 
}
