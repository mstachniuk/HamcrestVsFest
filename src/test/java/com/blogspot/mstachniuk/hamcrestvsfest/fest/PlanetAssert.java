package com.blogspot.mstachniuk.hamcrestvsfest.fest;

import com.blogspot.mstachniuk.hamcrestvsfest.Gases;
import com.blogspot.mstachniuk.hamcrestvsfest.Planet;
import com.blogspot.mstachniuk.hamcrestvsfest.RotationDirection;
import org.fest.assertions.api.AbstractAssert;
import org.fest.assertions.api.Assertions;

public class PlanetAssert extends AbstractAssert<PlanetAssert, Planet> {

    protected PlanetAssert(Planet actual) {
        super(actual, PlanetAssert.class);
    }

    public static PlanetAssert assertThat(Planet actual) {
        Assertions.assertThat(actual)
                .isNotNull();
        return new PlanetAssert(actual);
    }

    public PlanetAssert withRotation(RotationDirection rotationDirection) {
        Assertions.assertThat(actual.getRotationDirection())
                .isEqualTo(rotationDirection);
        return this;
    }

    public PlanetAssert withDiameterInMeter(int diameterInMeter) {
        Assertions.assertThat(actual.getDiameter())
                .isEqualTo(diameterInMeter);
        return this;
    }

    public PlanetAssert withYearInEarthDays(double yearInEarthDays) {
        Assertions.assertThat(actual.getSiderealYear().inEarthDays())
                .isEqualTo(yearInEarthDays);
        return this;
    }

    public PlanetAssert withAcceleration(double acceleration) {
        Assertions.assertThat(actual.getAcceleration())
                .isEqualTo(acceleration);
        return this;
    }

    public PlanetAssert withGas(Gases gas) {
        Assertions.assertThat(actual.getAtmosphereGases())
                .contains(gas);
        return this;
    }

    public PlanetAssert containsOnlyGases(Gases... gases) {
        Assertions.assertThat(actual.getAtmosphereGases())
                .containsOnly(gases);
        return this;
    }

    public PlanetAssert containsGases(Gases... gases) {
        Assertions.assertThat(actual.getAtmosphereGases())
                .contains(gases);
        return this;
    }

    public PlanetAssert doesNotContainGases(Gases... gas) {
        Assertions.assertThat(actual.getAtmosphereGases())
                .doesNotContain(gas);
        return this;
    }
}
