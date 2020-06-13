package com.alexander.day1.main;

import com.alexander.day1.exception.IncorrectInputException;
import com.alexander.day1.service.CircleService;
import com.alexander.day1.service.PerfectNumberService;

public class CircleMain {
    public static void main(String[] args) {
        CircleService service = new CircleService();
        try {
            service.calculateCirclePerimeter(45.4);
        } catch (IncorrectInputException e) {
            e.printStackTrace();
        }

    }
}
