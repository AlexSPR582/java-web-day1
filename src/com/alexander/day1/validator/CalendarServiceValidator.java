package com.alexander.day1.validator;

public class CalendarServiceValidator {
    private final int minMonth = 1;
    private final int maxMonth = 2;
    private final int minYear = 0;

    public boolean yearValidate(int year) {
        if (year > minYear) {
            return true;
        } else {
            return false;
        }
    }

    public boolean monthValidate(int month) {
        if (month >= minMonth && month <= maxMonth) {
            return true;
        } else {
            return false;
        }
    }
}
