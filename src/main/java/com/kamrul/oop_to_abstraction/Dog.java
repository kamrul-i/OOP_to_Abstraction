package com.kamrul.oop_to_abstraction;
public class Dog implements Animal {

    @Override
    public void eat() {
        System.out.println("Dogs eats meat.");
    }

    /*
    এখানে class interface-কে implements করেছে,
    implements করার পর interface এর সকল method-কে এই class এর মধ্যে override করতে হয়, 
     */
}
