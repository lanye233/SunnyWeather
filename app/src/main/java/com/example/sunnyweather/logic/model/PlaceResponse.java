package com.example.sunnyweather.logic.model;

import java.util.List;

/**
 * created by lanye
 * on 1/8/23
 */
public class PlaceResponse {
    private String status;
    private List<Place> places;

    public PlaceResponse(String status, List<Place> places) {
    }

    class Place {
        private String name;
        private Location location;
        private String address;

    }

    class Location {
        private String lng;
        private String lat;
    }
}
