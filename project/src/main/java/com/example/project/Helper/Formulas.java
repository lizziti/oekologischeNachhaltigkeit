package com.example.project.Helper;

import java.util.List;

public class Formulas {

    public float StandardDeviation(List<Float> input) {
        float sum = 0, standardDeviation = 0;
        for (float number : input) {
            sum += number;
        }
        float mean = sum / input.size();
        for (float number : input) {
            standardDeviation += Math.pow(number - mean, 2);
        }
        return (float)Math.sqrt(standardDeviation / input.size());
    }
}
