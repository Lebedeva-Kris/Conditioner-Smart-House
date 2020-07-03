package ru.netology;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ConditionerTest {

    @Test
    void shouldIncreaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        assertEquals(0, conditioner.getIncreaseCurrentTemperature());
        conditioner.setIncreaseCurrentTemperature(18);
        assertEquals(19, conditioner.getIncreaseCurrentTemperature());
    }

    @Test
    void shouldIncreaseCurrentMaxTemperature() {
        Conditioner conditioner = new Conditioner();
        assertEquals(0, conditioner.getIncreaseCurrentTemperature());
        conditioner.setIncreaseCurrentTemperature(30);
        assertEquals(0, conditioner.getIncreaseCurrentTemperature());
    }

    @Test
    void shouldDecreaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        assertEquals(0, conditioner.getDecreaseCurrentTemperature());
        conditioner.setDecreaseCurrentTemperature(18);
        assertEquals(17, conditioner.getDecreaseCurrentTemperature());
    }

    @Test
    void shouldDecreaseMinCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        assertEquals(0, conditioner.getDecreaseCurrentTemperature());
        conditioner.setDecreaseCurrentTemperature(-15);
        assertEquals(0, conditioner.getDecreaseCurrentTemperature());
    }

}

