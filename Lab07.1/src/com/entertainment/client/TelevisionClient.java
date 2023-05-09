package com.entertainment.client;

import com.entertainment.DisplayType;
import com.entertainment.Television;

/*
 * Client-side main-class to create a few instances of Television
 * and give them a basic test-drive.
 */
class TelevisionClient {

    public static void main(String[] args) {
        System.out.println(Television.getInstanceCount() + " instances have been created");
        System.out.println();

        // create an instance of Television and set its properties individually via setter calls
        Television tv1 = new Television();
        tv1.setBrand("Samsung");
        tv1.setVolume(Television.MAX_VOLUME);  // crank it up!!!
        tv1.setDisplay(DisplayType.PLASMA);

        // turn it on
        tv1.turnOn();

        // create a 2nd Television object via the "brand-volume-display" ctor
        Television tv2 = new Television("Sony", 10, DisplayType.LCD);
        tv2.turnOn();

        // create a 3rd Television object and turn it on, but DON'T set its properties first
        Television tv3 = new Television("LG");  // default volume (0), default display (LED)
        tv3.turnOn();

        System.out.println();

        // turn them all off
        tv1.turnOff();
        tv2.turnOff();
        tv3.turnOff();

        System.out.println();

        // show their toString() methods in action
        System.out.println(tv1);
        System.out.println(tv2);
        System.out.println(tv3);    // toString() automatically called

        System.out.println();
        System.out.println(Television.getInstanceCount() + " instances have been created");
    }
}