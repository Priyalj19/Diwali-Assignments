package com.demo;

public class LongestStringLength {

    static int findLongestLength(String[] arr) {
        int maxLength = 0;
        for (String str : arr) {
            if (str.length() > maxLength) {
                maxLength = str.length();
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        String[] arr = {"apple", "banana", "cherry", "watermelon"};

        int result = findLongestLength(arr);

        System.out.println("Length of the longest string: " + result);
    }
}
