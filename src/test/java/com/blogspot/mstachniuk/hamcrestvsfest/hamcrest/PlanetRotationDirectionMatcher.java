package com.blogspot.mstachniuk.hamcrestvsfest.hamcrest;

import com.blogspot.mstachniuk.hamcrestvsfest.Planet;
import com.blogspot.mstachniuk.hamcrestvsfest.RotationDirection;
import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.hamcrest.Factory;

public class PlanetRotationDirectionMatcher extends BaseMatcher<Planet> {

    private RotationDirection rotation;

    public PlanetRotationDirectionMatcher(RotationDirection rotation) {
        this.rotation = rotation;
    }

    @Override
    public boolean matches(Object item) {
        Planet p = (Planet) item;
        return p.getRotationDirection() == rotation;
    }

    @Override
    public void describeTo(Description description) {
        description.appendText("not rotation: " + rotation);
    }

    @Factory
    public static PlanetRotationDirectionMatcher rotation(RotationDirection rotation) {
        return new PlanetRotationDirectionMatcher(rotation);
    }
}
