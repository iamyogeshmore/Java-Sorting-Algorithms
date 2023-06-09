package org.bridgelabz;

import java.util.Arrays;

/*
Anagram Detection: Write a Java program to check if two given strings are anagrams.
An anagram is a word or phrase formed by rearranging the letters of another word or phrase. */
public class AnagramDetection {
    public static void main(String[] args) {
        String str1 = "Secure";
        String str2 = "Rescue";
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if (str1.length() == str2.length()) {  // check if length is same
            char[] charArray1 = str1.toCharArray();  // convert strings to char array
            char[] charArray2 = str2.toCharArray();
            Arrays.sort(charArray1);  // sort the char array
            Arrays.sort(charArray2);
            boolean result = Arrays.equals(charArray1, charArray2);  // if sorted char arrays are same then the string is anagram
            if (result) {
                System.out.println(str1 + " and " + str2 + " are anagram.");
            } else {
                System.out.println(str1 + " and " + str2 + " are not anagram.");
            }
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagram.");
        }
    }
}