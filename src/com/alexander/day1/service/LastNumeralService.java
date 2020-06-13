package com.alexander.day1.service;

import static java.lang.Math.pow;

public class LastNumeralService {
    public int calculateLastNumeralSquareNumber(int number) {
        int squareNumber = calculateSquareNumber(number);
        int lastNumeralSquareNumber = calculateLastNumeral(squareNumber);
        return lastNumeralSquareNumber;
    }

    private int calculateLastNumeral(int number) {
        return number % 10;
    }

    private int calculateSquareNumber(int number) {
        return (int) pow(number, 2);
    }
}
