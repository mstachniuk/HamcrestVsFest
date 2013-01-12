package com.blogspot.mstachniuk.hamcrestvsfest;

import java.util.Set;

public class Planet {

    private final String name;
    private RotationDirection rotationDirection;
    private long diameter;
    private SiderealYear siderealYear;
    private double acceleration;
    private Set<Gases> atmosphereGases;

    public Planet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public RotationDirection getRotationDirection() {
        return rotationDirection;
    }

    public void setRotationDirection(RotationDirection rotationDirection) {
        this.rotationDirection = rotationDirection;
    }

    public long getDiameter() {
        return diameter;
    }

    public void setDiameter(long diameter) {
        this.diameter = diameter;
    }

    public SiderealYear getSiderealYear() {
        return siderealYear;
    }

    public void setSiderealYear(SiderealYear siderealYear) {
        this.siderealYear = siderealYear;
    }

    public double getAcceleration() {
        return acceleration;
    }

    public void setAcceleration(double acceleration) {
        this.acceleration = acceleration;
    }

    public Set<Gases> getAtmosphereGases() {
        return atmosphereGases;
    }

    public void setAtmosphereGases(Set<Gases> atmosphereGases) {
        this.atmosphereGases = atmosphereGases;
    }
}
