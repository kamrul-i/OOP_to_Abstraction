package com.kamrul.oop_to_abstraction;
public abstract class MobileUser {

    void call() {
        System.out.println("call method.");
    }

    abstract void sentMessage();
    
    /*
    abstract method থাকলে class name এর আগে abstract শব্দটি ব্যবহার করতে হবে।।
    abstract method-এর body থাকে না, abstract method semicolon দ্বারা শেষ হয়।। যেমন, sentMessage(); ১টা abstract method.
    non-abstract method-এর body থাকে।। যেমন, call() ১টা non-abstract method.
    
    class এর মধ্যে abstract method, non-abstract method উভয় থাকলে সেই class-কে  Abstract class বলে।। তার মানে এটা 100% Abstract class নয়।।
    100% Abstract class কে Interface বলে।। এটাতে কোন non-abstract method থাকবে না।।
    
     */
}
