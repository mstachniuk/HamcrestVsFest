package com.blogspot.mstachniuk.hamcrestvsfest.fest;

import com.blogspot.mstachniuk.hamcrestvsfest.Planet;
import com.blogspot.mstachniuk.hamcrestvsfest.SolarSystem;
import org.junit.Test;

import java.util.Set;

import static com.blogspot.mstachniuk.hamcrestvsfest.fest.MyProjectAssertions.assertThat;

public class SolarSystemFestTest {

    @Test
    public void shouldCreateNewProfile() {
        // given
        SolarSystem service = new SolarSystem();

        // when
        Set<Planet> innerPlanets = service.getInnerPlanets();

        // then
        assertThat(innerPlanets);
    }
}
