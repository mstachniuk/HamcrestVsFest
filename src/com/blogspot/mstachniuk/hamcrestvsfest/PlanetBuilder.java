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

    public PlanetBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public PlanetBuilder withRotation(RotationDirection direction) {
        this.rotationDirection = direction;
        return this;
    }

    public PlanetBuilder withDiameterInMeter(int diameterInMeter) {
        this.diameterInMeter = diameterInMeter;
        return this;
    }

    public PlanetBuilder withYearInEarthDays(double yearInEarthDays) {
        this.yearInEarthDays = yearInEarthDays;
        return this;
    }

    public PlanetBuilder withAcceleration(double acceleration) {
        this.acceleration = acceleration;
        return this;
    }

    public PlanetBuilder withGas(Gases gas) {
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
