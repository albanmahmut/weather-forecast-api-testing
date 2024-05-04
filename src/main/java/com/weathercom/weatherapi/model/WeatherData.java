package com.weathercom.weatherapi.model;

public class WeatherData {
    private String location;
    private String date;
    private double temperature;
    private double humidity;
    private double windSpeed;

    //constructors
    public WeatherData() {

    }

    public WeatherData(String location, String date, double temperature, double humidity, double windSpeed) {
        this.location = location;
        this.date = date;
        this.temperature = temperature;
        this.humidity = humidity;
        this.windSpeed = windSpeed;
    }

    //getters and setters
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    public double getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(double windSpeed) {
        this.windSpeed = windSpeed;
    }

    // ToString method
    @Override
    public String toString() {
        return "WeatherData{" +
                "location='" + location + '\'' +
                ", date='" + date + '\'' +
                ", temperature=" + temperature +
                ", humidity=" + humidity +
                ", windSpeed=" + windSpeed +
                '}';
    }
}
