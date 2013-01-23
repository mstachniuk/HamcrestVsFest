package com.blogspot.mstachniuk.hamcrestvsfest.hamcrest;

import com.blogspot.mstachniuk.hamcrestvsfest.Gases;
import com.blogspot.mstachniuk.hamcrestvsfest.Planet;
import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;

import java.util.Arrays;
import java.util.List;

public class PlanetGasMatcher extends BaseMatcher<Planet>{


    private List<Gases> gases;

    public PlanetGasMatcher(List<Gases> gases) {
        this.gases = gases;
    }

    @Override
    public boolean matches(Object item) {
        Planet p = (Planet) item;
        return p.getAtmosphereGases().containsAll(gases);
    }

    @Override
    public void describeTo(Description description) {

    }

    public static PlanetGasMatcher hasGas(Gases gas) {
        return new PlanetGasMatcher(Arrays.asList(gas));
    }

    public static PlanetGasMatcher hasGases(Gases... gas) {
        return new PlanetGasMatcher(Arrays.asList(gas));
    }
}
