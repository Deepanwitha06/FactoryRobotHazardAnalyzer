package com.factory.robot.auditor;

import com.factory.robot.exception.RobotSafetyException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class RobotSafetyAuditorTest {

    private final RobotSafetyAuditor auditor = new RobotSafetyAuditor();

    @Test
    void shouldCalculateRiskForCriticalMachinery() throws RobotSafetyException {
        double result = auditor.calculateHazardRisk(0.5, 10, "Critical");
        assertEquals(37.5, result, 0.001);
    }

    @Test
    void shouldCalculateRiskForWornMachinery() throws RobotSafetyException {
        double result = auditor.calculateHazardRisk(0.5, 10, "Worn");
        assertEquals(20.5, result, 0.001);
    }

    @Test
    void shouldCalculateRiskForFaultyMachinery() throws RobotSafetyException {
        double result = auditor.calculateHazardRisk(0.5, 10, "Faulty");
        assertEquals(27.5, result, 0.001);
    }

    @Test
    void shouldRejectInvalidArmPrecision() {
        RobotSafetyException exception = assertThrows(
                RobotSafetyException.class,
                () -> auditor.calculateHazardRisk(1.3, 10, "Critical")
        );

        assertEquals("Error: Arm precision must be 0.0-1.0",
                exception.getMessage());
    }

    @Test
    void shouldRejectInvalidWorkerDensity() {
        RobotSafetyException exception = assertThrows(
                RobotSafetyException.class,
                () -> auditor.calculateHazardRisk(0.5, 26, "Critical")
        );

        assertEquals("Error: Worker density must be 1-20",
                exception.getMessage());
    }

    @Test
    void shouldRejectUnsupportedMachineryState() {
        RobotSafetyException exception = assertThrows(
                RobotSafetyException.class,
                () -> auditor.calculateHazardRisk(0.5, 10, "Optimal")
        );

        assertEquals("Error: Unsupported machinery state",
                exception.getMessage());
    }
}