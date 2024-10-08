package com.kamrul.oop_to_abstraction;
public abstract class Shape {

    //it is variable
    double dimantion1, dimantion2;

    //it is parameterized constractor
    Shape(double dimantion1, double dimantion2) {
        this.dimantion1 = dimantion1;
        this.dimantion2 = dimantion2;
    }

    //it is abstract method, it's don't have any object.
    abstract void area();
}
