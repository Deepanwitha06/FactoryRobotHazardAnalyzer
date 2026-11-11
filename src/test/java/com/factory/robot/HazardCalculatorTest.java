package com.factory.robot;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HazardCalculatorTest {

    private final HazardCalculator calculator = new HazardCalculator();

    @Test
    void shouldCalculateHazardRiskUsingSeparateMethods() {
        double result = calculator.calculateHazardRisk(0.5, 10, 3.0);
        assertEquals(37.5, result, 0.001);
    }

    @Test
    void shouldCalculateRiskWithPerfectPrecision() {
        double result = calculator.calculateHazardRisk(1.0, 10, 2.0);
        assertEquals(20.0, result, 0.001);
    }

    @Test
    void shouldCalculateRiskWithZeroWorkerDensity() {
        double result = calculator.calculateHazardRisk(0.5, 0, 3.0);
        assertEquals(7.5, result, 0.001);
    }
}