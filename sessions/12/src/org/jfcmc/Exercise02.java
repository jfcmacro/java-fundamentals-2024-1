package org.jfcmc;

import java.util.Stack;

public class Exercise02 {

    public static boolean bracesMatching(String braceStr) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < braceStr.length(); i++) {
            Character c = braceStr.charAt(i);
            switch (c) {
            case '{':
                stack.push(c);
                break;
            case '}':
                if (!stack.empty()) {
                    stack.pop();
                }
                else {
                    return false;
                }
                break;
            }
        }

        return stack.empty();
    }
}
