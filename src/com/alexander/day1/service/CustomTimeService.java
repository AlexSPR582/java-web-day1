package com.alexander.day1.service;

import com.alexander.day1.entity.CustomTime;
import com.alexander.day1.exception.IncorrectInputException;
import com.alexander.day1.validator.TimeServiceValidator;

public class CustomTimeService {
    public CustomTime calculateTime(int seconds) throws IncorrectInputException {
        TimeServiceValidator validator = new TimeServiceValidator();
        if (validator.timeValidate(seconds)) {
            int hours = calculateHours(seconds);
            seconds -= hours * 3600;
            int minutes = calculateMinutes(seconds);
            seconds -= minutes * 60;
            CustomTime time = new CustomTime(hours, minutes, seconds);
            return time;
        } else {
            throw new IncorrectInputException("negative time");
        }
    }

    private int calculateHours(int seconds) {
        int hours = seconds / 3600;
        return hours;
    }

    private int calculateMinutes(int seconds) {
        int minutes = seconds / 60;
        return minutes;
    }
}
