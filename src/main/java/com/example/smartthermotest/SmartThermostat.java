package com.example.smartthermotest;

public class SmartThermostat {
    public boolean isTemperatureSafe(double temperature) {
        return temperature >= 65.0 && temperature <= 75.0;
    }

    public String checkTemperature(double temperature) {
        if (isTemperatureSafe(temperature)) {
            return "Temperature is safe.";
        } else {
            return "Warning: Temperature is out of safe range!";
        }
    }
}

