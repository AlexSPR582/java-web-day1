package com.alexander.day1.service;

import com.alexander.day1.exception.IncorrectInputException;
import com.alexander.day1.validator.ShapeServiceValidator;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class ShapeService {
    public double calculateInscribedSquareArea(double describedSquareArea)
            throws IncorrectInputException {
        ShapeServiceValidator validator = new ShapeServiceValidator();
        if (validator.shapeValidate(describedSquareArea)) {
            double radius = calculateCircleRadius(describedSquareArea);
            double inscribedSquareArea = 2 * pow(radius, 2);
            return inscribedSquareArea;
        } else {
            throw new IncorrectInputException("negative area");
        }
    }

    private double calculateCircleRadius(double describedSquareArea) {
        double radius = sqrt(describedSquareArea / 4);
        return radius;
    }

    public double calculateDifference(double describedSquareArea)
            throws IncorrectInputException {
        ShapeServiceValidator validator = new ShapeServiceValidator();
        if (validator.shapeValidate(describedSquareArea)) {
            double inscribedSquareArea = calculateInscribedSquareArea(describedSquareArea);
            double difference = describedSquareArea / inscribedSquareArea;
            return difference;
        } else {
            throw new IncorrectInputException("negative area");
        }
    }
}
