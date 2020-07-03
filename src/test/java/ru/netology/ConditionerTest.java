package ru.netology;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ConditionerTest {

    @Test
    void shouldGetAndSet() {
        Conditioner conditioner = new Conditioner();
        String expectedName = "Павлик Морозов";
        assertNull(conditioner.getName());
        conditioner.setName(expectedName);
        assertEquals(expectedName, conditioner.getName());
    }

    @Test
    void shouldChangeCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        assertEquals(17, conditioner.getCurrentTemperature());
        conditioner.setCurrentTemperature(20);
        assertEquals(20, conditioner.getCurrentTemperature());
    }


}

