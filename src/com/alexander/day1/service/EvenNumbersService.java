package com.alexander.day1.service;

public class EvenNumbersService {
    public boolean isHaveTwoEvenNumbers(int num1, int num2, int num3, int num4) {
        int evenNumbers = countEvenNumbers(num1, num2, num3, num4);
        if (evenNumbers >= 2) {
            return true;
        } else {
            return false;
        }
    }

    private int countEvenNumbers(int... numbers) {
        int evenNumbers = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                evenNumbers++;
            }
        }
        return evenNumbers;
    }
}
