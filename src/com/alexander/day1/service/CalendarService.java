package com.alexander.day1.service;

import com.alexander.day1.entity.CustomMonth;
import com.alexander.day1.exception.IncorrectInputException;
import com.alexander.day1.validator.CalendarServiceValidator;

public class CalendarService {
    public int calculateDays(int monthNumber, int year) throws IncorrectInputException {
        CalendarServiceValidator validator = new CalendarServiceValidator();
        if (validator.monthValidate(monthNumber) && validator.yearValidate(year)) {
            int days = 0;
            CustomMonth month = findMonth(monthNumber);
            if (month == CustomMonth.FEBRUARY && isLeapYear(year)) {
                days = month.getDays() + 1;
            } else {
                days = month.getDays();
            }
            return days;
        } else {
            throw new IncorrectInputException("Month out of range or negative year");
        }
    }

    private CustomMonth findMonth(int monthNumber) {
        CustomMonth month = null;
        for (CustomMonth monthInYear: CustomMonth.values()) {
            if (monthInYear.getMonthNumber() == monthNumber) {
                month = monthInYear;
            }
        }
        return month;
    }

    public boolean isLeapYear(int year) throws IncorrectInputException {
        CalendarServiceValidator validator = new CalendarServiceValidator();
        if (validator.yearValidate(year)) {
            if (year % 4 == 0) {
                return true;
            } else {
                return false;
            }
        } else {
            throw new IncorrectInputException("negative year");
        }
    }
}
