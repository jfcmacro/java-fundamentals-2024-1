package org.jfcmc.session05;

import static java.util.Arrays.fill;

public class CheckBraces {

    public static boolean checkBraces(String braces) {
        char current[] = new char[braces.length()];
        int top = 0;

        fill(current, ' ');
        for (int i = 0; i < braces.length(); i++) {
            if (braces.charAt(i) == '(') {
                current[top++] = '(';
            }
            else { // I guess that everything is correct
                if (top > 0) {
                    current[top--] = ' ';
                }
                else {
                    return false;
                }
            }
        }

        return top == 0;
    }

    public static void main(String[] args) {

        String[] test = { "(())",
                          "()()",
                          "(()))((())",
                          "((()" };

        for (String braces : test) {
            System.out.printf("%s is %b%n", braces, checkBraces(braces));
        }
    }
}
