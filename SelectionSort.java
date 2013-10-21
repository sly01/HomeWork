/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

/**
 *
 * @author erkoc
 */
public class SelectionSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[] arr = {5, 2, 1, 3, 7, 8, 4, 9};

        printList(arr);
        System.out.println("");
        System.out.println(" Selection Sort");
        selectionSort(arr);
        printList(arr);
    }

    static public int[] selectionSort(int[] arr) {

        int min;
        for (int i = 0; i < arr.length - 1; i++) {

            min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            if (min != i) {
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }

        }

        return arr;
    }

    static public void printList(int[] arr) {
        for (int x : arr) {
            System.out.print(" " + x);
        }
    }
}
