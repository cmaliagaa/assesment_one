package org.example;

public class Main {
    public static void main(String[] args) {
        CustomStringUtils stringUtils =  new CustomStringUtils();
        String test = "AABBBCCD112233";
        String result = stringUtils.removeDuplicates(test);
        System.out.println(result);
    }
}