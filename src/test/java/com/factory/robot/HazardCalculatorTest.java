package com.factory.robot;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HazardCalculatorTest {

    @Test
    void shouldCalculateHazardRiskCorrectly() {
        HazardCalculator calculator = new HazardCalculator();
        double result = calculator.calculateHazardRisk(0.5, 10, 3.0);
        assertEquals(37.5, result, 0.001);
    }

    @Test
    void shouldCalculateZeroRiskForPerfectPrecisionAndNoWorkers() {
        HazardCalculator calculator = new HazardCalculator();
        double result = calculator.calculateHazardRisk(1.0, 0, 3.0);
        assertEquals(0.0, result, 0.001);
    }
}