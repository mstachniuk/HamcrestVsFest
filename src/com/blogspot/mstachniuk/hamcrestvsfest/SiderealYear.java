package com.blogspot.mstachniuk.hamcrestvsfest;

public class SiderealYear {

    public static final int EARTH_YEAR_IN_DAYS = 365;
    private final double earthDays;

    public SiderealYear(double earthDays) {
        this.earthDays = earthDays;
    }

    public double inEarthDays() {
        return earthDays;
    }

    public double inEarthYears() {
        return earthDays / EARTH_YEAR_IN_DAYS;
    }
}
