package ru.netology;

public class Conditioner {
    private String name;
    private int maxTemperature = 30;
    private int minTemperature = -15;
    private int currentTemperature;
    private boolean on;
    private int increaseCurrentTemperature;
    private int decreaseCurrentTemperature;


    public int getDecreaseCurrentTemperature() {
        return decreaseCurrentTemperature;
    }
    public void setDecreaseCurrentTemperature(int decreaseCurrentTemperature) {
        if (decreaseCurrentTemperature > minTemperature) {
            decreaseCurrentTemperature--;
        } else {
            return;
        }
        this.decreaseCurrentTemperature = decreaseCurrentTemperature;
    }


    public int getIncreaseCurrentTemperature() {
        return increaseCurrentTemperature;
    }
    public void setIncreaseCurrentTemperature(int increaseCurrentTemperature) {
        if (increaseCurrentTemperature < maxTemperature) {
            increaseCurrentTemperature++;
        } else {
            return;
        }
        this.increaseCurrentTemperature = increaseCurrentTemperature;
    }


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
        this.currentTemperature = currentTemperature;
    }


    public boolean isOn() {
        return on;
    }
    public void setOn(boolean on) {
        this.on = on;
    }

}
