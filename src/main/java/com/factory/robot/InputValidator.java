package com.factory.robot;

public class InputValidator {

    public boolean isValidArmPrecision(double armPrecision) {
        return armPrecision >= 0.0 && armPrecision <= 1.0;
    }

    public boolean isValidWorkerDensity(int workerDensity) {
        return workerDensity >= 1 && workerDensity <= 20;
    }
}