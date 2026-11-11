package com.factory.robot;

public class HazardCalculator {

    public double calculateHazardRisk(double armPrecision, int workerDensity, double machineRiskFactor) {

        return calculatePrecisionRisk(armPrecision) + calculateDensityRisk(workerDensity, machineRiskFactor);
    }

    // Calculates the risk caused by arm precision.
    private double calculatePrecisionRisk(double armPrecision) {
        return (1.0 - armPrecision) * 15.0;
    }

    // Calculates the risk caused by worker density.
    private double calculateDensityRisk(int workerDensity, double machineRiskFactor) {
        return workerDensity * machineRiskFactor;
    }
}