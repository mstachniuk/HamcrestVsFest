package com.blogspot.mstachniuk.hamcrestvsfest.hamcrest;

import com.blogspot.mstachniuk.hamcrestvsfest.Gases;
import com.blogspot.mstachniuk.hamcrestvsfest.Planet;
import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;

import java.util.Arrays;
import java.util.List;

public class PlanetGasHasOnlyMatcher extends BaseMatcher<Planet>{

    private List<Gases> gases;

    public PlanetGasHasOnlyMatcher(List<Gases> gases) {
        this.gases = gases;
    }

    @Override
    public boolean matches(Object item) {
        Planet p = (Planet) item;
        return p.getAtmosphereGases().containsAll(gases) && gases.size() == p.getAtmosphereGases().size();
    }

    @Override
    public void describeTo(Description description) {
    }

    public static PlanetGasHasOnlyMatcher hasOnlyGases(Gases... gases) {
        return new PlanetGasHasOnlyMatcher(Arrays.asList(gases));
    }
}
