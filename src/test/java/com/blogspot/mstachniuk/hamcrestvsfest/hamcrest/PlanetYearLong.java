package com.blogspot.mstachniuk.hamcrestvsfest.hamcrest;

import com.blogspot.mstachniuk.hamcrestvsfest.Planet;
import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;

public class PlanetYearLong extends BaseMatcher<Planet>{

    private double yearLongInEarthDays;

    public PlanetYearLong(double yearLongInEarthDays) {
        this.yearLongInEarthDays = yearLongInEarthDays;
    }

    @Override
    public boolean matches(Object item) {
        Planet p = (Planet) item;
        return p.getSiderealYear().inEarthDays() == yearLongInEarthDays;
    }

    @Override
    public void describeTo(Description description) {
    }

    public static PlanetYearLong yearLongInEarthDays(double yearLongInEarthDays) {
        return new PlanetYearLong(yearLongInEarthDays);
    }
}
