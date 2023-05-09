package ex.periment;

import java.util.Arrays;

class ArraysTest {

    public static void main(String[] args) {
        int[] ages = new int[4];
        ages[0] = 56;
        ages[1] = 49;
        ages[2] =  9;
        ages[3] =  9;
        System.out.println(ages.length);
        System.out.println(Arrays.toString(ages));

        double[] temps = { 64.0, 56.9, 83.4, 49.0, 98.6 };
        for (double temp : temps) {
            System.out.println("The temperature is: " + temp);
        }
        System.out.println();

        for (int i = 0; i < temps.length; i++) {
            System.out.println("The temperature is: " + temps[i]);
        }
    }
}