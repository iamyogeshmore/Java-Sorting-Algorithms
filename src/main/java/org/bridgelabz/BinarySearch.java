package org.bridgelabz;

import java.util.Scanner;

/*Perform a binary search on a sorted array of words and find a specific word entered by the user.
Display the index of the word if found, or indicate if the word is not present in the array.*/
public class BinarySearch {
    static int binarySearch(String[] words, String word) {
        int l = 0, r = words.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            int res = word.compareTo(words[m]);
            if (res == 0)  // Check if word is present at mid
                return m;
            if (res > 0)  // If word greater, ignore left half
                l = m + 1;
            else
                r = m - 1;  // If word is smaller, ignore right half
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        System.out.print("Enter number of words you wish to input: ");
        int n = sc.nextInt();
        String[] words = new String[n];
        System.out.println("Enter the words");
        for (i = 0; i < words.length; i++) {
            System.out.print("WORD " + (i + 1) + ": ");
            words[i] = sc.next();
        }
        System.out.println("enter the word you want to search for ");
        String word = sc.next();
        int result = binarySearch(words, word);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at " + "index " + result);
    }
}
