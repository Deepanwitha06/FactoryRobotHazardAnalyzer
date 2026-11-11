package com.factory.robot;

import com.factory.robot.exception.RobotSafetyException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class MachineryRiskMapperTest {

    private final MachineryRiskMapper mapper = new MachineryRiskMapper();

    @Test
    void shouldMapWornState() throws RobotSafetyException {
        assertEquals(1.3, mapper.getRiskFactor("Worn"), 0.001);
    }

    @Test
    void shouldMapFaultyState() throws RobotSafetyException {
        assertEquals(2.0, mapper.getRiskFactor("Faulty"), 0.001);
    }

    @Test
    void shouldMapCriticalState() throws RobotSafetyException {
        assertEquals(3.0, mapper.getRiskFactor("Critical"), 0.001);
    }

    @Test
    void shouldRejectUnsupportedState() {
        RobotSafetyException exception = assertThrows(RobotSafetyException.class,
                () -> mapper.getRiskFactor("Optimal")
        );

        assertEquals("Error: Unsupported machinery state", exception.getMessage());
    }

    @Test
    void shouldRejectNullState() {
        assertThrows(RobotSafetyException.class,
                () -> mapper.getRiskFactor(null)
        );
    }
}