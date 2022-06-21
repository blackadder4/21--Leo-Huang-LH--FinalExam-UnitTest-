package org.example;
//Calling Add with a negative number will throw an exception “negatives not allowed.”
//Numbers bigger than 1000 should be ignored.

import static java.lang.Integer.parseInt;

public class StringCalculator {
    public static int add(final String numbers) {
        int returnValue = 0;
        String[] numbersArray = numbers.split(",|\n");
        for (String number : numbersArray) {
            if (!number.trim().isEmpty()) {
                if(parseInt(number.trim()) < 0){
                    throw new IllegalArgumentException("indices size larger than string size");
                }
                int M = parseInt(number.trim());
                if(parseInt(number.trim()) > 1000) {
                    M = 0;
                }
                returnValue += M;
            }
        }
        return returnValue;
    }
}