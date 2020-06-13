package com.alexander.day1.validator;

public class CalendarServiceValidator {
    public boolean yearValidate(int year) {
        if (year > 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean monthValidate(int month) {
        if (month >= 1 && month <= 12) {
            return true;
        } else {
            return false;
        }
    }
}
