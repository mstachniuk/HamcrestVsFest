package com.blogspot.mstachniuk.hamcrestvsfest.hamcrest;

import com.blogspot.mstachniuk.hamcrestvsfest.Gases;
import com.blogspot.mstachniuk.hamcrestvsfest.Planet;
import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;

import java.util.Arrays;
import java.util.List;

public class PlanetGasNegation extends BaseMatcher<Planet>{

    private List<Gases> gases;
    private Gases incorrectGas;

    public PlanetGasNegation(List<Gases> gases) {
        this.gases = gases;
    }

    @Override
    public boolean matches(Object item) {
        Planet p = (Planet) item;
        for (Gases gas : gases) {
            if(p.getAtmosphereGases().contains(gas)) {
                incorrectGas = gas;
                return false;
            }
        }
        return true;
    }

    @Override
    public void describeTo(Description description) {
        description.appendText("incorrect gas: " + incorrectGas);
    }

    public static PlanetGasNegation hasNotGases(Gases... gases) {
        return new PlanetGasNegation(Arrays.asList(gases));
    }
}
