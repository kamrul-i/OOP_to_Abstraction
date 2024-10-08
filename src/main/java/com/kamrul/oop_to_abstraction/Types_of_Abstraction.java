package com.kamrul.oop_to_abstraction;
public abstract class Types_of_Abstraction {
        
    /*
    Abstraction এর আলোচনা:
    class, method কে abstract করতে হলে keyword-এর মতো নামের আগে ‍abstract বসিয়ে দিতে হয়।।
    সকল sub-class ১টি super class কে extends/inherit করেছে, এরকম inherit কে multiple inheritance বলে।।
    
    Abstraction দু’ধরনের হয়ে থাকে।। (There are two way to chieve abstractio in java)
        1. Abstract class (0-100%)
        2. Interface (100%)
    
    1. abstract class: 
        abstract class এর মধ্যে abstract method, non-abstract method থাকতে পারে।।
        abstract class এর object create করা যায় না, তাই referance variable create করে কাজ করতে হয়।।
        super class এর referance variable create করে, super class এর referance variable দ্বারা sub-class এর object কে refer করা যায়, polymorphism এর মতো।।
        abstract class কে extends/inherit করলে, ‍super class এর সকল methods-কে sub-class এর মধ্যে override করতে হবে, 
        অথবা,
        sub-class কে abstract class করে নিতে হবে।।
        non-abstract method-এর body থাকে, 

    2. abstract method:
        abstract method থাকলে class name এর আগে abstract শব্দটি ব্যবহার করতে হবে।।
        abstract method-এর body থাকে না, abstract method semicolon দ্বারা শেষ হয়।।
        abstract method কে abstract class এর মধ্যে রাখতে হবে এবং সেটা overrideden method হতে হবে।।
        abstract method -কে final, static হিসেবে declare করা যাবে না।।
    
    class এর মধ্যে abstract method, non-abstract method উভয় থাকলে সেই class-কে  Abstract class বলে।। তার মানে এটা 100% Abstract class নয়।।
    100% Abstract class কে Interface বলে।। এটাতে কোন non-abstract method থাকবে না।।
    
    */
}
