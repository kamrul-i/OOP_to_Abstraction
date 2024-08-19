package com.kamrul.oop_to_abstraction;
public class Abstract_Test {

    public static void main(String[] args) {

        MobileUser mu;

        mu = new Ashraf();
        mu.call();
        mu.sentMessage();

        mu = new Altaf();
        mu.sentMessage();
    }

    /*
    object oriented programming_OOP:
    object oriented programming প্রধানত ৪ প্রকার, 
        Encapsulation
        Inheritance
        Polymorphism
        Abstraction
    
    java-তে কাজ করার জন্য এই Access modifier গুলোর প্রয়োজন পড়ে,
    There are four types of access modifier in java:
        private
        default
        protected
        public
    Access modifier গুলো কোন variable / method এর আগে বসানো হয়।।
    
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

        -> non-abstract method-এর body থাকে, 

        -> abstract method:
            abstract method থাকলে class name এর আগে abstract শব্দটি ব্যবহার করতে হবে।।
            abstract method-এর body থাকে না, abstract method semicolon দ্বারা শেষ হয়।।
            abstract method কে abstract class এর মধ্যে রাখতে হবে এবং সেটা overrideden method হতে হবে।।
            abstract method -কে final, static হিসেবে declare করা যাবে না।।
     */
}
