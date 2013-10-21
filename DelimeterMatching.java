/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

import java.util.Stack;

/**
 *
 * @author erkoc
 */
public class DelimeterMatching {

    public static void main(String[] args) {
        String input = "a[b{c}d]e}";
        check(input);
    }

    public static void check(String input) {
        Stack<Character> theStack = new Stack<Character>();

        for (int j = 0; j < input.length(); j++) {
            char ch = input.charAt(j);
            switch (ch) {
                case '{':
                case '[':
                case '(':
                    theStack.push(ch);
                    break;
                case '}':
                case ']':
                case ')':
                    if (!theStack.isEmpty()) {
                        char chx = theStack.pop();
                        if ((ch == '}' && chx != '{') || (ch == ']' && chx != '[') || (ch == ')' && chx != '(')) {
                            System.out.println("Error: " + ch + " at " + j);
                        }
                    } else {
                        System.out.println("Error: " + ch + " at " + j);
                    }
                    break;
                default:
                    break;
            }
        }
        if (!theStack.isEmpty()) {
            System.out.println("Error: missing right delimiter");
        }
    }
}
