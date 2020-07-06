package ru.netology;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ConditionerTest {

    @Test
    void increaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        int temperatureBeforeIncrease = conditioner.getCurrentTemperature();
        conditioner.increaseCurrentTemperature();
        assertEquals(temperatureBeforeIncrease+1, conditioner.getCurrentTemperature());
    }

    @Test
    void decreaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        int temperatureBeforeDecrease = conditioner.getCurrentTemperature();
        conditioner.decreaseCurrentTemperature();
        assertEquals(temperatureBeforeDecrease-1, conditioner.getCurrentTemperature());
    }

    @Test
    void increaseCurrentMaxTemperature() {
        Conditioner conditioner = new Conditioner();
        int maxTemperatureBeforeIncrease = conditioner.getCurrentTemperature();
        conditioner.setCurrentTemperature(conditioner.getMaxTemperature());
        conditioner.increaseCurrentTemperature();
        assertEquals(conditioner.getMaxTemperature(), conditioner.getCurrentTemperature());
    }

    @Test
    void decreaseCurrentMinTemperature() {
        Conditioner conditioner = new Conditioner();
        int minTemperatureBeforeDecrease = conditioner.getCurrentTemperature();
        conditioner.setCurrentTemperature(conditioner.getMinTemperature());
        conditioner.decreaseCurrentTemperature();
        assertEquals(conditioner.getMinTemperature(), conditioner.getCurrentTemperature());
    }
}
