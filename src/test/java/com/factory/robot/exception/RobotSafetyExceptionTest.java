package com.factory.robot.exception;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;

class RobotSafetyExceptionTest {

    @Test
    void shouldCreateExceptionWithArmPrecisionMessage() {
        RobotSafetyException exception = new RobotSafetyException("Error: Arm precision must be 0.0-1.0");
        assertEquals("Error: Arm precision must be 0.0-1.0", exception.getMessage());
        assertInstanceOf(Exception.class, exception);
    }

    @Test
    void shouldCreateExceptionWithWorkerDensityMessage() {
        RobotSafetyException exception = new RobotSafetyException("Error: Worker density must be 1-20");
        assertEquals("Error: Worker density must be 1-20", exception.getMessage());
    }

    @Test
    void shouldCreateExceptionWithMachineryStateMessage() {
        RobotSafetyException exception = new RobotSafetyException("Error: Unsupported machinery state");
        assertEquals("Error: Unsupported machinery state", exception.getMessage());
    }
}