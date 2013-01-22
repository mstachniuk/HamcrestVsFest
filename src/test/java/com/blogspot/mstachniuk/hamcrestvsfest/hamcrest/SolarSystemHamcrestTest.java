package com.blogspot.mstachniuk.hamcrestvsfest.hamcrest;

import com.blogspot.mstachniuk.hamcrestvsfest.Planet;
import com.blogspot.mstachniuk.hamcrestvsfest.RotationDirection;
import com.blogspot.mstachniuk.hamcrestvsfest.SolarSystem;
import org.junit.Test;

import java.util.Set;

import static com.blogspot.mstachniuk.hamcrestvsfest.hamcrest.PlanetWithNameMatcher.withName;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;


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
        assertThat(mercury, PlanetRotationDirectionMatcher.hasRotation(RotationDirection.LEFT));
    }

    private Planet findPlanetByName(Set<Planet> planets, String planetName) {
        for (Planet planet : planets) {
            if(planet.getName().equals(planetName)) {
                return planet;
            }
        }
        throw new AssertionError("Not found " + planetName + " in Planets " + planets
        );
    }


}
