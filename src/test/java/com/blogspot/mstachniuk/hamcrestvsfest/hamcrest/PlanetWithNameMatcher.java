package com.blogspot.mstachniuk.hamcrestvsfest.hamcrest;

import com.blogspot.mstachniuk.hamcrestvsfest.Planet;
import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.hamcrest.Factory;

public class PlanetWithNameMatcher extends BaseMatcher<Planet> {

    private String name;

    public PlanetWithNameMatcher(String name) {
        this.name = name;
    }

    @Override
    public boolean matches(Object o) {
        Planet p = (Planet) o;
        return p.getName().equals(name);
    }

    @Override
    public void describeTo(Description description) {
        description.appendText("not Planet with name: " + name);
    }

    @Factory
    public static PlanetWithNameMatcher withName(String name) {
        return new PlanetWithNameMatcher(name);
    }

}
