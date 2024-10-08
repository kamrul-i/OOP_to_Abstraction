package com.kamrul.oop_to_abstraction;
public class Test {
    public static void main(String[] args) {

        Player p = new Player();
        p.play();

    }

    /*
    Difference between "class vs interface"
     1. একটি class আরেকটি class কে extends করতে পারে।।
        একটি interface আরেকটি interface কে extends করতে পারে।। তবে
        একটি class আরেকটি interface কে extends করতে পারে না, এক্ষেত্রে implements করবে।।

     2. interface এর object create করা যায় না, class এর object create করা যায়।।
        interface এর constructor create করা যায় না, class এর constructor create করা যায়।।
        interface এর instance variable create করা যায় না, class এর instance variable create করা যায়।।

     3. interface এর প্রত্যেকটি method default ভাবে abstract থাকে, তাই কোন keyword এর প্রয়োজন পড়ে না।।
        সকল method public হিসেবে থাকে, কোন method কে private হিসেবে declare করা যায় না ।।

     4. কোন class, single class কে extends/inherit করতে পারে, multiple class কে extends করতে পারে না, তবে 
       single class, multiple interface কে impliments করতে পারে।।(inheritance এর সমস্যাকে এই interface দ্বারা সমাধান করুন)।।
    
     */
}
