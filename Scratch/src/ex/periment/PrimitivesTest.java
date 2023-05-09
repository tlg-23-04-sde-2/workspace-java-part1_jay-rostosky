package ex.periment;

class PrimitivesTest {

    public static void main(String[] args) {
        int age = 56;
        System.out.println("The value of age is: " + age);

        long population = 8_000_000_000L;
        System.out.println("The population is: " + population);

        double weight = 135.5;
        System.out.println("The weight is: " + weight);

        boolean hasTwins = true;
        System.out.println("I have twins: " + hasTwins);

        char shirtSize = 'L';
        System.out.println("The shirt size is: " + shirtSize);

        String name = "jay";
        System.out.println("The name is: " + name);

        // print the following sentence (as a string)
        // The word "belly" makes me laugh
        System.out.println("The word \"belly\" makes me laugh");
        System.out.println();

        int i = 18;
        int j = i;
        i++;  // i is now 19

        System.out.println("j is: " + j);  // still 18
        System.out.println();

        int x = 3;
        System.out.println("x is: " + ++x);
    }
}