package com.alexander.day1.service;

public class PerfectNumberService {
    public boolean isPerfectNumber(int num) {
        if (num == sumDenominators(num)) {
            return true;
        } else {
            return false;
        }
    }

    private int sumDenominators(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
