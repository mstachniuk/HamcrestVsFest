package com.blogspot.mstachniuk.hamcrestvsfest.fest;

import com.blogspot.mstachniuk.hamcrestvsfest.Planet;
import org.fest.assertions.api.AbstractAssert;
import org.fest.assertions.api.Assertions;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

public class PlanetSetAssert extends AbstractAssert<PlanetSetAssert, Set<Planet>> {

    private PlanetSetAssert(Set<Planet> actual) {
        super(actual, PlanetSetAssert.class);
    }

    public static PlanetSetAssert assertThat(Set<Planet> actual) {
        Assertions.assertThat(actual)
                .isNotNull();
        return new PlanetSetAssert(actual);
    }

    public PlanetSetAssert containsPlanetWithName(String expectedPlanetName) {
        for (Planet planet : actual) {
            if(planet.getName().equals(expectedPlanetName)) {
                return this;
            }
        }
        throw new AssertionError("Actual Set doesn't contains Planet with name: " + expectedPlanetName);
    }

    public PlanetSetAssert containsPlanetWithName2(String expectedPlanetName) {
        Planet expectedPlanet = new Planet(expectedPlanetName);

        Assertions.assertThat(actual)
                .usingElementComparator(new PlanetNameComparator())
                .contains(expectedPlanet);
        return this;
    }

    public PlanetAssert containsPlanetWithName3(String expectedPlanetName) {
        Planet expectedPlanet = new Planet(expectedPlanetName);

        PlanetNameComparator comparator = new PlanetNameComparator();
        Assertions.assertThat(actual)
                .usingElementComparator(comparator)
                .contains(expectedPlanet);

        for (Planet planet : actual) {
            if(comparator.compare(planet, expectedPlanet) == 0) {
                return PlanetAssert.assertThat(planet);
            }
        }
        return null;
    }

    public PlanetSetAssert containsOnlyPlanets(String... planets) {
        List<Planet> expectedPlanets = new ArrayList<>();
        for (String planet : planets) {
            Planet p = new Planet(planet);
            expectedPlanets.add(p);
        }
        Assertions.assertThat(actual)
                .usingElementComparator(new PlanetNameComparator())
                .containsOnly(expectedPlanets.toArray(new Planet[expectedPlanets.size()]));
        return this;
    }

    private class PlanetNameComparator implements Comparator<Planet> {
        @Override
        public int compare(Planet p1, Planet p2) {
            return p1.getName().compareTo(p2.getName());
        }
    }
}
