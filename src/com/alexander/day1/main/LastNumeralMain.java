package com.alexander.day1.main;

import com.alexander.day1.service.FunctionRangeService;
import com.alexander.day1.service.LastNumeralService;

import java.util.HashMap;

public class LastNumeralMain {
    public static void main(String[] args) {

        FunctionRangeService service = new FunctionRangeService();
        HashMap<Double, Double> map = service.calculateFunctionRange(3, 4, 0.2);
        System.out.println(map);
    }
}
