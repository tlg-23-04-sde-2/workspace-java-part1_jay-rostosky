package com.mathhelp;

class CalculatorClient {

    public static void main(String[] args) {
        // ok to pass ints where doubles are expected, an implicit upcast
        double sum = Calculator.add(3, 5);
        System.out.println("The sum is: " + sum);

        System.out.println("The difference is: " + Calculator.subtract(3.1, 5.1));

        int input = 11;
        System.out.println(input + " is even: " + Calculator.isEven(input));
        System.out.println();

        // now try my getRandomInt() methods
        System.out.println(Calculator.getRandomInt(5, 20));  // calls the "min-max" version
        System.out.println();

        System.out.println(Calculator.getAverage(3, 5, 9, 9));  // any number of "loose" int
        System.out.println(Calculator.getAverage(56));          // I MUST pass at least one
    }
}