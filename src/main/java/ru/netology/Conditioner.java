package ru.netology;

public class Conditioner {
    private String name;
    private int maxTemperature = 30;
    private int minTemperature = -15;
    private int currentTemperature = 17;
    private boolean on;

    public int getMaxTemperature() {
        return maxTemperature;
    }
    public void setMaxTemperature(int maxTemperature) {
        this.maxTemperature = maxTemperature;
    }

    public int getMinTemperature() {
        return minTemperature;
    }
    public void setMinTemperature(int minTemperature) {
        this.minTemperature = minTemperature;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getCurrentTemperature() {
        return currentTemperature;
    }
    public void setCurrentTemperature(int currentTemperature) {
        if (currentTemperature > maxTemperature) {
            return;
        }
        if (currentTemperature < minTemperature) {
            return;
        }
//        проверяем, что все проверки прошли
        this.currentTemperature = currentTemperature;
    }

    public boolean isOn() {
        return on;
    }
    public void setOn(boolean on) {
        this.on = on;
    }

}
