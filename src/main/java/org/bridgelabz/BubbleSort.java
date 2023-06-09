package org.bridgelabz;

import java.util.Scanner;

/*The code implements the Bubble Sort algorithm to sort an array of numbers in ascending order.
It takes user input for the number of elements and their values, and then displays the sorted array.*/
public class BubbleSort {
    public static void main(String[] args) {
        int i, j, temp = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter how many numbers to be sorted: ");
        int n = scanner.nextInt();
        int a[] = new int[n];
        System.out.println("Enter value for " + n + " numbers => ");
        for (i = 0; i < a.length; i++) {
            System.out.print("Enter number " + (i + 1) + " => ");
            a[i] = scanner.nextInt();
        }
        for (i = 0; i < a.length; i++) {  //sorting the array
            for (j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("The sorted order is => ");
        for (i = 0; i < a.length; i++) {
            System.out.println(a[i]);  //printing the sorted array
        }
    }
}