package ru.netology;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ConditionerAdvancerTest {

    @Test
    void createConditioner() {
        ConditionerAdvancer conditioner = new ConditionerAdvancer();
    }

    @Test
    void shouldGetAndSet() {
        ConditionerAdvancer conditioner = new ConditionerAdvancer();
        String expectedName = "Павлик Морозов";
        assertNull(conditioner.getName());
        conditioner.setName(expectedName);
        assertEquals(expectedName, conditioner.getName());
    }

    @Test
    void shouldChangeCurrentTemperature() {
        ConditionerAdvancer conditioner = new ConditionerAdvancer();
        assertEquals(0, conditioner.getCurrentTemperature());
        conditioner.setCurrentTemperature(20);
        assertEquals(20, conditioner.getCurrentTemperature());
    }


}

