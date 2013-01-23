package com.blogspot.mstachniuk.hamcrestvsfest.hamcrest;

import com.blogspot.mstachniuk.hamcrestvsfest.Planet;
import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;

public class PlanetDiameterMatcher extends BaseMatcher<Planet> {

    private long diameterInMeter;

    public PlanetDiameterMatcher(long diameterInMeter) {
        this.diameterInMeter = diameterInMeter;
    }

    @Override
    public boolean matches(Object item) {
        Planet p = (Planet) item;
        return p.getDiameter() == diameterInMeter;
    }

    @Override
    public void describeTo(Description description) {
        description.appendText("Diameter in Meter: " + diameterInMeter);
    }

    public static PlanetDiameterMatcher diameterInMeter(long diameterInMeter) {
        return new PlanetDiameterMatcher(diameterInMeter);
    }
}
