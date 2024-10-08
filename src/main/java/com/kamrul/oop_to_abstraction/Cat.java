package com.kamrul.oop_to_abstraction;
public class Cat implements Animal {

    @Override
    public void eat() {
        System.out.println("Cat eats milk.");
    }

    /*
    এখানে class interface-কে implements করেছে,
    implements করার পর interface এর সকল method-কে এই class এর মধ্যে override করতে হয়, 
     */
}
