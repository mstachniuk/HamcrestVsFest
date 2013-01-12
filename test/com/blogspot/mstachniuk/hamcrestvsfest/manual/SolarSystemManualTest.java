package com.blogspot.mstachniuk.hamcrestvsfest.manual;

import com.blogspot.mstachniuk.hamcrestvsfest.Gases;
import com.blogspot.mstachniuk.hamcrestvsfest.Planet;
import com.blogspot.mstachniuk.hamcrestvsfest.RotationDirection;
import com.blogspot.mstachniuk.hamcrestvsfest.SolarSystem;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

public class SolarSystemManualTest {


    @Test
    public void shouldGenerateInnerPlanets() {
        // given
        SolarSystem solarSystem = new SolarSystem();

        // when
        Set<Planet> innerPlanets = solarSystem.getInnerPlanets();

        // then
        for (Planet innerPlanet : innerPlanets) {
            if (innerPlanet.getName().equals("Mercury")) {
                List<Gases> mercuryGases = Arrays.asList(Gases.OXYGEN, Gases.SODIUM, Gases.HYDROGEN);
                assertPlanet(innerPlanet, RotationDirection.LEFT, 4_879_400, 87.96935, 3.701, mercuryGases);
            } else if (innerPlanet.getName().equals("Venus")) {
                List<Gases> venusGases = Arrays.asList(Gases.CARBON_DIOXIDE, Gases.NITROGEN);
                assertPlanet(innerPlanet, RotationDirection.RIGHT, 12_103_700, 224.700_96, 8.87, venusGases);
            } else if (innerPlanet.getName().equals("Earth")) {
                List<Gases> earthGases = Arrays.asList(Gases.NITROGEN, Gases.OXYGEN);
                assertPlanet(innerPlanet, RotationDirection.LEFT, 12_756_273, 365.256_363_004, 9.806_65, earthGases);
            } else if (innerPlanet.getName().equals("Mars")) {
                List<Gases> marsGases = Arrays.asList(Gases.CARBON_DIOXIDE, Gases.NITROGEN);
                assertPlanet(innerPlanet, RotationDirection.LEFT, 6_804_900, 686.960_1, 3.69, marsGases);
            } else {
                throw new AssertionError("Undefined Planet Name: " + innerPlanet.getName()
                        + " in result\n" + innerPlanet.toString());
            }
        }
    }

    private void assertPlanet(Planet planet, RotationDirection direction, long diameterInMeter,
                              double yearInEarthDays, double acceleration, List<Gases> atmosphereGases) {
        assertEquals(planet.getRotationDirection(), direction);
        assertEquals(planet.getDiameter(), diameterInMeter);
        assertEquals(planet.getSiderealYear().inEarthDays(), yearInEarthDays);
        assertEquals(planet.getAcceleration(), acceleration);
        for (Gases gas : atmosphereGases) {
            assertTrue("Planet " + planet.getName() + " doesn't contains " + gas,
                    planet.getAtmosphereGases().contains(gas));
        }
    }
}
