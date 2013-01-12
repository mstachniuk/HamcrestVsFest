package com.blogspot.mstachniuk.hamcrestvsfest;

import java.util.HashSet;
import java.util.Set;

public class SolarSystem {

    public Set<Planet> getInnerPlanets() {
        Set<Planet> innerPlanets = new HashSet<Planet>();
        innerPlanets.add(new Planet("Mercury"));
        return innerPlanets;
    }
}
