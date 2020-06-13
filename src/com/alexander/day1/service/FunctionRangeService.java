package com.alexander.day1.service;

import java.util.HashMap;
import static java.lang.Math.tan;

public class FunctionRangeService {
    public HashMap<Double, Double> calculateFunctionRange(double left, double right, double step) {
        HashMap<Double, Double> functionMap = new HashMap<>();
        while (left <= right) {
            double functionValue = tan(left);
            functionMap.put(left, functionValue);
            left += step;
        }
        return functionMap;
    }
}
