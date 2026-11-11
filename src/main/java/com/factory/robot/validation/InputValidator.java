package com.factory.robot.validation;

import com.factory.robot.exception.RobotSafetyException;

public class InputValidator {

    public void validateArmPrecision(double armPrecision)
            throws RobotSafetyException {

        if (armPrecision < 0.0 || armPrecision > 1.0) {
            throw new RobotSafetyException(
                    "Error: Arm precision must be 0.0-1.0");
        }
    }

    public void validateWorkerDensity(int workerDensity)
            throws RobotSafetyException {

        if (workerDensity < 1 || workerDensity > 20) {
            throw new RobotSafetyException(
                    "Error: Worker density must be 1-20");
        }
    }
}