package com.entertainment.client;

import com.entertainment.InvalidVolumeException;
import com.entertainment.Television;

class TelevisionClient {

    public static void main(String[] args) {
        try {
            Television tv1 = new Television("Sony", -50);
            System.out.println(tv1);  // toString() automatically called
        }
        catch (InvalidVolumeException e) {
            e.printStackTrace();
        }
    }
}