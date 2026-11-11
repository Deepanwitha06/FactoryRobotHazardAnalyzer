package com.factory.robot.mapper;

import com.factory.robot.exception.RobotSafetyException;

public class MachineryRiskMapper {

    public double getRiskFactor(String machineryState)
            throws RobotSafetyException {

        if (machineryState == null) {
            throw new RobotSafetyException(
                    "Error: Unsupported machinery state");
        }

        switch (machineryState) {
            case "Worn":
                return 1.3;

            case "Faulty":
                return 2.0;

            case "Critical":
                return 3.0;

            default:
                throw new RobotSafetyException(
                        "Error: Unsupported machinery state");
        }
    }
}