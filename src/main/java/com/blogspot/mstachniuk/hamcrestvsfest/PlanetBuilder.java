package com.blogspot.mstachniuk.hamcrestvsfest;

import java.util.HashSet;
import java.util.Set;

public class PlanetBuilder {

    private String name;
    private RotationDirection rotationDirection;
    private int diameterInMeter;
    private double yearInEarthDays;
    private double acceleration;
    private Set<Gases> gases = new HashSet<>();

    public PlanetBuilder name(String name) {
        this.name = name;
        return this;
    }

    public PlanetBuilder rotation(RotationDirection direction) {
        this.rotationDirection = direction;
        return this;
    }

    public PlanetBuilder diameterInMeter(int diameterInMeter) {
        this.diameterInMeter = diameterInMeter;
        return this;
    }

    public PlanetBuilder yearInEarthDays(double yearInEarthDays) {
        this.yearInEarthDays = yearInEarthDays;
        return this;
    }

    public PlanetBuilder acceleration(double acceleration) {
        this.acceleration = acceleration;
        return this;
    }

    public PlanetBuilder addGas(Gases gas) {
        gases.add(gas);
        return this;
    }

    public Planet build() {
        Planet planet = new Planet(name);
        planet.setAcceleration(acceleration);
        planet.setAtmosphereGases(gases);
        planet.setDiameter(diameterInMeter);
        planet.setRotationDirection(rotationDirection);
        planet.setSiderealYear(new SiderealYear(yearInEarthDays));
        return planet;
    }
}
