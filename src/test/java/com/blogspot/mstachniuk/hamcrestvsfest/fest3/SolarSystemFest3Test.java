package com.blogspot.mstachniuk.hamcrestvsfest.fest3;

import com.blogspot.mstachniuk.hamcrestvsfest.*;
import org.junit.Test;

import java.util.Set;

import static com.blogspot.mstachniuk.hamcrestvsfest.PlanetAssert.assertThat;
import static com.blogspot.mstachniuk.hamcrestvsfest.hamcrest.SolarSystemHamcrestTest.findPlanetByName;

public class SolarSystemFest3Test {

    @Test
    public void shouldGenerateInnerPlanets() {
        // given
        SolarSystem service = new SolarSystem();

        // when
        Set<Planet> innerPlanets = service.getInnerPlanets();

        // then
        Planet mercury = findPlanetByName(innerPlanets, "Mercury");
        assertThat(mercury)
                .hasRotationDirection(RotationDirection.LEFT)
                .hasDiameter(4_879_400)
                .hasSiderealYear(new SiderealYear(87.96935))
                .hasAcceleration(3.701)
                .hasAtmosphereGases(Gases.OXYGEN, Gases.SODIUM, Gases.HYDROGEN);

        Planet venus = findPlanetByName(innerPlanets, "Venus");
        assertThat(venus)
                .hasRotationDirection(RotationDirection.RIGHT)
                .hasDiameter(12_103_700)
                .hasSiderealYear(new SiderealYear(224.700_96))
                .hasAcceleration(8.87)
                .hasAtmosphereGases(Gases.CARBON_DIOXIDE, Gases.NITROGEN);

        Planet earth = findPlanetByName(innerPlanets, "Earth");
        assertThat(earth)
                .hasRotationDirection(RotationDirection.LEFT)
                .hasDiameter(12_756_273)
                .hasSiderealYear(new SiderealYear(365.256_363_004))
                .hasAcceleration(9.806_65)
                .hasAtmosphereGases(Gases.NITROGEN, Gases.OXYGEN);
        // .doesNotContainGases(Gases.SODIUM); - not exist

        Planet mars = findPlanetByName(innerPlanets, "Mars");
        assertThat(mars)
                .hasRotationDirection(RotationDirection.LEFT)
                .hasDiameter(6_804_900)
                .hasSiderealYear(new SiderealYear(686.960_1))
                .hasAcceleration(3.69)
                .hasAtmosphereGases(Gases.CARBON_DIOXIDE, Gases.NITROGEN);
        //.doesNotContainGases(Gases.OXYGEN); - not exist
    }
}
