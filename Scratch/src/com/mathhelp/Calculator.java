package com.mathhelp;

/*
 * This is an "all-static" class, i.e., one that contains only static methods.
 */
class Calculator {

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static boolean isEven(int value) {
        return value % 2 == 0;
    }

    /*
     * Returns a random integer between 1 and 14. (min=1, max=14)
     *
     * HINT: see a class called Math (in package java.lang), look for a helpful method here.
     * NOTE: these methods in the Math class are all "static," which means you call them as:
     *  Math.methodName()
     */
    public static int getRandomInt() {
        // delegate to the min-max version, passing 1 for the min, and 14 for the max
        return getRandomInt(1, 14);
    }

    /*
     * Returns a random integer between 'min' and 'max' (inclusive), e.g., 5 to 20.
     */
    public static int getRandomInt(int min, int max) {
        int result = 0;

        double rand = Math.random();             // 0.0000 to  0.9999
        double scaled = rand * (max - min + 1);  // 0.0000 to 15.9999
        double raised = scaled + min;            // 5.0000 to 20.9999
        result = (int) raised;                   // 5      to 20

        return result;
    }

    /*
     * Returns the average (arithmetic mean) of the supplied integers.
     *  getAverage()
     *  aveInt()
     *  averageator()
     *  xbar()
     *  getMean()
     */
    public static double getAverage(int first, int... rest) {  // first: 3  rest: 5, 9, 9
        double result = 0.0;

        double sum = first;
        for (int value : rest) {
            sum += value;   // sum = sum + value
        }
        result = sum / (1 + rest.length);  // at runtime, rest IS AN array

        return result;
    }
}