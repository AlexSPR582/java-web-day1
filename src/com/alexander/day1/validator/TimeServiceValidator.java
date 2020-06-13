package com.alexander.day1.validator;

public class TimeServiceValidator {
    public boolean timeValidate(int seconds) {
        if (seconds >= 0) {
            return true;
        } else {
            return false;
        }
    }
}
