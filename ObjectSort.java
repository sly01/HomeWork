/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

import java.util.Arrays;

/**
 *
 * @author erkoc
 */
public class ObjectSort {

    public static void main(String[] args) {
        String[] fruits = new String[]{"Pineapple", "Apple", "Orange", "Banana"};

        Arrays.sort(fruits);

        int i = 0;
        for (String temp : fruits) {
            System.out.println("fruits " + ++i + " : " + temp);
        }

    }
}
