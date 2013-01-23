package com.blogspot.mstachniuk.hamcrestvsfest.hamcrest;

import com.blogspot.mstachniuk.hamcrestvsfest.Gases;
import com.blogspot.mstachniuk.hamcrestvsfest.Planet;
import com.blogspot.mstachniuk.hamcrestvsfest.RotationDirection;
import com.blogspot.mstachniuk.hamcrestvsfest.SolarSystem;
import org.junit.Test;

import java.util.Set;

import static com.blogspot.mstachniuk.hamcrestvsfest.hamcrest.PlanetAccelerationMatcher.acceleration;
import static com.blogspot.mstachniuk.hamcrestvsfest.hamcrest.PlanetDiameterMatcher.diameterInMeter;
import static com.blogspot.mstachniuk.hamcrestvsfest.hamcrest.PlanetGasHasOnlyMatcher.hasOnlyGases;
import static com.blogspot.mstachniuk.hamcrestvsfest.hamcrest.PlanetGasMatcher.hasGas;
import static com.blogspot.mstachniuk.hamcrestvsfest.hamcrest.PlanetGasMatcher.hasGases;
import static com.blogspot.mstachniuk.hamcrestvsfest.hamcrest.PlanetRotationDirectionMatcher.rotation;
import static com.blogspot.mstachniuk.hamcrestvsfest.hamcrest.PlanetWithNameMatcher.withName;
import static com.blogspot.mstachniuk.hamcrestvsfest.hamcrest.PlanetYearLong.yearLongInEarthDays;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.Matchers.is;


public class SolarSystemHamcrestTest {

    @Test
    public void shouldGenerateInnerPlanets() {
        // given
        SolarSystem solarSystem = new SolarSystem();

        // when
        Set<Planet> innerPlanets = solarSystem.getInnerPlanets();

        // then
        assertThat(innerPlanets, hasItem(withName("Mercury")));
        Planet mercury = findPlanetByName(innerPlanets, "Mercury");
        assertThat(mercury, is(rotation(RotationDirection.LEFT)));
        assertThat(mercury, is(diameterInMeter(4_879_400)));
        assertThat(mercury, is(yearLongInEarthDays(87.96935)));
        assertThat(mercury, is(acceleration(3.701)));
        assertThat(mercury, hasGas(Gases.OXYGEN));
        assertThat(mercury, hasGas(Gases.SODIUM));
        assertThat(mercury, hasGas(Gases.HYDROGEN));

        assertThat(innerPlanets, hasItem(withName("Venus")));
        Planet venus = findPlanetByName(innerPlanets, "Venus");
        assertThat(venus, is(rotation(RotationDirection.RIGHT)));
        assertThat(venus, is(diameterInMeter(12_103_700)));
        assertThat(venus, is(yearLongInEarthDays(224.700_96)));
        assertThat(venus, is(acceleration(8.87)));
        assertThat(venus, hasOnlyGases(Gases.CARBON_DIOXIDE, Gases.NITROGEN));

        assertThat(innerPlanets, hasItem(withName("Earth")));
        Planet earth = findPlanetByName(innerPlanets, "Earth");
        assertThat(earth, is(rotation(RotationDirection.LEFT)));
        assertThat(earth, is(diameterInMeter(12_756_273)));
        assertThat(earth, is(yearLongInEarthDays(365.256_363_004)));
        assertThat(earth, is(acceleration(9.806_65)));
        assertThat(earth, hasGases(Gases.NITROGEN, Gases.OXYGEN));
        assertThat(earth, PlanetGasNegation.hasNotGases(Gases.SODIUM));

        assertThat(innerPlanets, hasItem(withName("Mars")));
        Planet mars = findPlanetByName(innerPlanets, "Mars");
        assertThat(mars, is(rotation(RotationDirection.LEFT)));
        assertThat(mars, is(diameterInMeter(6_804_900)));
        assertThat(mars, is(yearLongInEarthDays(686.960_1)));
        assertThat(mars, is(acceleration(3.69)));
        assertThat(mars, hasGases(Gases.CARBON_DIOXIDE, Gases.NITROGEN));
        assertThat(mars, PlanetGasNegation.hasNotGases(Gases.OXYGEN));
    }

    private Planet findPlanetByName(Set<Planet> planets, String planetName) {
        for (Planet planet : planets) {
            if(planet.getName().equals(planetName)) {
                return planet;
            }
        }
        throw new AssertionError("Not found " + planetName + " in Planets " + planets);
    }


}
