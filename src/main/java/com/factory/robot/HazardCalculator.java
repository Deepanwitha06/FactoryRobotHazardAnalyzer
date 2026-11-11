package com.factory.robot;

public class HazardCalculator {

    public double calculateHazardRisk(double armPrecision, int workerDensity, double machineRiskFactor) {

        return ((1.0 - armPrecision) * 15.0) + (workerDensity * machineRiskFactor);
    }
}