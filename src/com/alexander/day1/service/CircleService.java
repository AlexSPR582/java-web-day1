package com.alexander.day1.service;

import com.alexander.day1.exception.IncorrectInputException;
import com.alexander.day1.validator.CircleServiceValidator;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class CircleService {
    public double calculateCirclePerimeter(double radius) throws IncorrectInputException {
        CircleServiceValidator validator = new CircleServiceValidator();
        if (validator.circleValidate(radius)) {
            double perimeter = 2 * PI * radius;
            return perimeter;
        } else {
            throw new IncorrectInputException("negative radius");
        }
    }

    public double calculateCircleArea(double radius) throws  IncorrectInputException {
        CircleServiceValidator validator = new CircleServiceValidator();
        if (validator.circleValidate(radius)) {
            double area = PI * pow(radius, 2);
            return area;
        } else {
            throw new IncorrectInputException("negative radius");
        }
    }
}
