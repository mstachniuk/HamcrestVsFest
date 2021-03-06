package com.blogspot.mstachniuk.hamcrestvsfest.hamcrest;

import com.blogspot.mstachniuk.hamcrestvsfest.Planet;
import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;

public class PlanetAccelerationMatcher extends BaseMatcher<Planet>{

    private double acceleration;

    public PlanetAccelerationMatcher(double acceleration) {
        this.acceleration = acceleration;
    }

    @Override
    public boolean matches(Object item) {
        Planet p = (Planet) item;
        return p.getAcceleration() == acceleration;
    }

    @Override
    public void describeTo(Description description) {
    }

    public static PlanetAccelerationMatcher acceleration(double acceleration) {
        return new PlanetAccelerationMatcher(acceleration);
    }

}
