package org.jfcmc.session05;

public class Euclid {

    public static void main(String[] args) {
        int a = 2701;
        int b = 222;

        if (args.length == 2) {
            try {
                a = Integer.parseInt(args[0]);
                b = Integer.parseInt(args[1]);
            }
            catch (NumberFormatException nfe) {
                System.err.println("Arguments were not both numbers.");
                System.err.println("Using defaults.");
            }
        }
        else {
            System.err.print("Wrong numbers of arguments");
            System.err.println(" expected 2.");
            System.err.println("Using default.");
        }

        System.out.printf("The GCD of %d and %d is ", a, b);
        while (b != 0) {
            if (a > b) {
                a = a - b;
            }
            else {
                b = b - a;
            }
        }
        System.out.printf("%d%n", a);
    }
}
