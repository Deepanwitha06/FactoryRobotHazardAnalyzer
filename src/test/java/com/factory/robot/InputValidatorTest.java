package com.factory.robot;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InputValidatorTest {

    private final InputValidator validator = new InputValidator();

    @Test
    void shouldAcceptValidArmPrecision() {
        assertTrue(validator.isValidArmPrecision(0.5));
        assertTrue(validator.isValidArmPrecision(0.0));
        assertTrue(validator.isValidArmPrecision(1.0));
    }

    @Test
    void shouldRejectInvalidArmPrecision() {
        assertFalse(validator.isValidArmPrecision(-0.1));
        assertFalse(validator.isValidArmPrecision(1.3));
    }

    @Test
    void shouldAcceptValidWorkerDensity() {
        assertTrue(validator.isValidWorkerDensity(1));
        assertTrue(validator.isValidWorkerDensity(10));
        assertTrue(validator.isValidWorkerDensity(20));
    }

    @Test
    void shouldRejectInvalidWorkerDensity() {
        assertFalse(validator.isValidWorkerDensity(0));
        assertFalse(validator.isValidWorkerDensity(26));
    }
}