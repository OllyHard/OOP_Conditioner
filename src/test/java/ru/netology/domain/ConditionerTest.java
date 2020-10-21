package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {

    @Test
    public void shouldGetAndSet() {
        Conditioner conditioner = new Conditioner();
        String expected = "Кондишн";
        assertNull(conditioner.getName());
        conditioner.setName(expected);
        assertEquals(expected, conditioner.getName());
    }

    @Test
    public void decreaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(45);
        conditioner.setMinTemperature(8);
        int currentTemperature = 23;
        int expected = 22;
        conditioner.setCurrentTemperature(currentTemperature);
        conditioner.decreaseCurrentTemperature();
        assertEquals(expected, conditioner.getCurrentTemperature());
    }

    @Test
    public void decreaseCurrentTemperatureLessMin() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(45);
        conditioner.setMinTemperature(8);
        int currentTemperature = 8;
        int expected = 8;
        conditioner.setCurrentTemperature(currentTemperature);
        conditioner.decreaseCurrentTemperature();
        assertEquals(expected, conditioner.getCurrentTemperature());
    }

    @Test
    public void increaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(45);
        conditioner.setMinTemperature(8);
        int currentTemperature = 23;
        int expected = 24;
        conditioner.setCurrentTemperature(currentTemperature);
        conditioner.increaseCurrentTemperature();
        assertEquals(expected, conditioner.getCurrentTemperature());
    }

    @Test
    public void increaseCurrentTemperatureMoreMax() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(45);
        conditioner.setMinTemperature(8);
        int currentTemperature = 45;
        int expected = 45;
        conditioner.setCurrentTemperature(currentTemperature);
        conditioner.increaseCurrentTemperature();
        assertEquals(expected, conditioner.getCurrentTemperature());
    }

    @Test
    public void checkMaxTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(45);
        int currentTemperature = 46;
        int expected = 0;
        conditioner.setCurrentTemperature(currentTemperature);
        assertEquals(expected, conditioner.getCurrentTemperature());
    }

    @Test
    public void checkMinTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(45);
        conditioner.setMinTemperature(8);
        int currentTemperature = 7;
        int expected = 0;
        conditioner.setCurrentTemperature(currentTemperature);
        assertEquals(expected, conditioner.getCurrentTemperature());
    }

    @Test
    public void decreaseCurrentTemperatureIfMore() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(45);
        conditioner.setMinTemperature(8);
        int currentTemperature = 46;
        int expected = 0;
        conditioner.setCurrentTemperature(currentTemperature);
        conditioner.decreaseCurrentTemperature();
        assertEquals(expected, conditioner.getCurrentTemperature());
    }

    @Test
    public void increaseCurrentTemperatureIfLess() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMinTemperature(8);
        int currentTemperature = 46;
        int expected = 0;
        conditioner.setCurrentTemperature(currentTemperature);
        conditioner.increaseCurrentTemperature();
        assertEquals(expected, conditioner.getCurrentTemperature());
    }

}
