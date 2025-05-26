package com.example.smartthermotest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SmartThermostatTest {

    SmartThermostat thermostat = new SmartThermostat();

    @Test
    void testMultipleTemperatureChecks() {
        double[] safeTemps = {65.0, 66.5, 70.0, 74.9, 75.0};
        double[] unsafeTemps = {64.9, 50.0, 80.1, 100.0};

        for (double temp : safeTemps) {
            assertTrue(thermostat.isTemperatureSafe(temp),
                    "Expected " + temp + "°F to be within safe range");
            assertEquals("Temperature is safe.", thermostat.checkTemperature(temp));
        }

        for (double temp : unsafeTemps) {
            assertFalse(thermostat.isTemperatureSafe(temp),
                    "Expected " + temp + "°F to be outside safe range");
            assertEquals("Warning: Temperature is out of safe range!", thermostat.checkTemperature(temp));
        }
    }
}


