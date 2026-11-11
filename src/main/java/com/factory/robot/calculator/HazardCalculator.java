package com.factory.robot.calculator;

public class HazardCalculator {

    public double calculateHazardRisk(
            double armPrecision,
            int workerDensity,
            double machineRiskFactor) {

        double precisionRisk = (1.0 - armPrecision) * 15.0;
        double densityRisk = workerDensity * machineRiskFactor;

        return precisionRisk + densityRisk;
    }
}