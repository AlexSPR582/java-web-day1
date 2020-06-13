package com.alexander.day1.service;

public class CustomFunctionService {
    public double calculateFunction(double x) {
        if (x >= 3) {
            return calculateFirstFunction(x);
        } else {
            return calculateSecondFunction(x);
        }
    }

    private double calculateFirstFunction(double x) {
        return (-1) * Math.pow(x, 2) + 3 * x + 9;
    }

    private double calculateSecondFunction(double x) {
        return 1 / (Math.pow(x, 3) - 6);
    }
}
