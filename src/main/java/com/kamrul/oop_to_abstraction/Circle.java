package com.kamrul.oop_to_abstraction;
public class Circle extends Shape {

    //it is variable
    //double r;
    //it is constractor
    Circle(double r) {
        //dimantion1 = dimantion2 = r;
        super(r, r);
    }

    //it is method.
    @Override
    void area() {
        double result = Math.PI * dimantion1 * dimantion2;
        System.out.println("Circle area is : " + result);
        System.out.printf("Circle area is : %.2f" , result);
    }
    /*
    এখানে সকল class একটি class(shape)কে extends/inherit করেছে, এরকম extends কে Hierarchical inheritance বলে।। 
     */
}
