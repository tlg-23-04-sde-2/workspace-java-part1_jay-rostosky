/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */
 
package com.entertainment.client;

import static com.entertainment.DisplayType.*;
import com.entertainment.Television;

class TelevisionClient {
  
    public static void main(String[] args) {
        Television tv = new Television("Samsung", 65, LED);
        System.out.println(tv);
        
        // change the channel
        tv.changeChannel("CBS");
        
        System.out.println(tv);  // toString() automatically called
    }
}