package com.kamrul.oop_to_abstraction;
public class Player implements Football, Cricket {

    @Override
    public void play() {
        System.out.println("Hello, I am Player.");
    }

    /*
    এখানে class interface-কে implements করেছে,
    implements করার পর interface এর সকল method-কে এই class এর মধ্যে override করতে হয়, 
     */
}
