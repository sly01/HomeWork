/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

/**
 *
 * @author erkoc
 */
public class InsertionSort {

    public static void main(String[] args) {

        int[] arr = {5, 2, 1, 3, 7, 8, 4, 9};
        printList(arr);
        System.out.println("");
        System.out.println(" Insertion Sort");
        insertionSort(arr);
        printList(arr);

    }

    static public void printList(int[] arr) {
        for (int x : arr) {
            System.out.print(" " + x);
        }
    }

    public static void insertionSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int j = i;
            int B = arr[i];
            while ((j > 0) && (arr[j - 1] > B)) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = B;
        }
    }
}
