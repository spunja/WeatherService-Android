package com.example.model;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table "WEATHER_INFO".
 */
public class WeatherInfo {

    private Long id;
    /** Not-null value. */
    private java.util.Date timestamp;
    private String city;
    private String temperature;

    public WeatherInfo() {
    }

    public WeatherInfo(Long id) {
        this.id = id;
    }

    public WeatherInfo(Long id, java.util.Date timestamp, String city, String temperature) {
        this.id = id;
        this.timestamp = timestamp;
        this.city = city;
        this.temperature = temperature;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /** Not-null value. */
    public java.util.Date getTimestamp() {
        return timestamp;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setTimestamp(java.util.Date timestamp) {
        this.timestamp = timestamp;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

}
