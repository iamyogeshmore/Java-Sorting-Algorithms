package org.bridgelabz;

import java.util.Arrays;
import java.util.Scanner;

//Sort a given set of words in alphabetical order using Insertion Sort.
public class InsertionSort {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of words to be printed: ");
        int n = s.nextInt();
        String[] arrayOfWord = new String[n];
        System.out.println("Enter the words to be printed: ");
        for (int i = 0; i < arrayOfWord.length; i++) {
            System.out.print("Enter " + (i + 1) + " word => ");
            arrayOfWord[i] = s.next();
        }
        //sort string arrayOfWord using Arrays.sort method
        System.out.print("Sorted order is: ");
        for (int i = 0; i < arrayOfWord.length; i++) {
            Arrays.sort(arrayOfWord);
            System.out.print(" " + arrayOfWord[i]);
        }
    }
}
