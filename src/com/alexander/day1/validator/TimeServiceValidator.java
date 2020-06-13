package com.alexander.day1.validator;

public class TimeServiceValidator {
    private final int minSeconds = 0;
    private final int maxSecondsInDay = 86400;

    public boolean timeValidate(int seconds) {
        if (seconds >= minSeconds && seconds <= maxSecondsInDay) {
            return true;
        } else {
            return false;
        }
    }
}
