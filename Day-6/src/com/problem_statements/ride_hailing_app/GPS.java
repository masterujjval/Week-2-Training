package com.problem_statements.ride_hailing_app;

public interface GPS {
    String getCurrentLocation();

    void updateLocation(String newLocation);
}