package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
    }

    public static String createPhoneNumber(int[] numbers) {
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < numbers.length;i++) {
            if(i == 0) {
                stringBuilder.append("(").append(numbers[i]);
            } else if (i == 3) {
                stringBuilder.append(")").append(" ").append(numbers[i]);
            } else if (i == 6) {
                stringBuilder.append("-").append(numbers[i]);
            } else {
                stringBuilder.append(numbers[i]);
            }
        }
        return stringBuilder.toString();
    }
}