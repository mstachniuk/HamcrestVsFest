package com.blogspot.mstachniuk.hamcrestvsfest.fest;

import com.blogspot.mstachniuk.hamcrestvsfest.Gases;
import com.blogspot.mstachniuk.hamcrestvsfest.Planet;
import com.blogspot.mstachniuk.hamcrestvsfest.RotationDirection;
import com.blogspot.mstachniuk.hamcrestvsfest.SolarSystem;
import org.junit.Test;

import java.util.Set;

import static com.blogspot.mstachniuk.hamcrestvsfest.fest.MyProjectAssertions.assertThat;

public class SolarSystemFestTest {

    @Test
    public void shouldGenerateInnerPlanets() {
        // given
        SolarSystem service = new SolarSystem();

        // when
        Set<Planet> innerPlanets = service.getInnerPlanets();

        // then
        assertThat(innerPlanets)
                .containsPlanetWithName3("Mercury")
                .withRotation(RotationDirection.LEFT)
                .withDiameterInMeter(4_879_400)
                .withYearInEarthDays(87.96935)
                .withAcceleration(3.701)
                .withGas(Gases.OXYGEN)
                .withGas(Gases.SODIUM)
                .withGas(Gases.HYDROGEN);

        assertThat(innerPlanets)
                .containsPlanetWithName3("Venus")
                .withRotation(RotationDirection.RIGHT)
                .withDiameterInMeter(12_103_700)
                .withYearInEarthDays(224.700_96)
                .withAcceleration(8.87)
                .containsOnlyGases(Gases.CARBON_DIOXIDE, Gases.NITROGEN);

        assertThat(innerPlanets)
                .containsPlanetWithName3("Earth")
                .withRotation(RotationDirection.LEFT)
                .withDiameterInMeter(12_756_273)
                .withYearInEarthDays(365.256_363_004)
                .withAcceleration(9.806_65)
                .containsGases(Gases.NITROGEN, Gases.OXYGEN)
                .doesNotContainGases(Gases.SODIUM);

        assertThat(innerPlanets)
                .containsPlanetWithName3("Mars")
                .withRotation(RotationDirection.LEFT)
                .withDiameterInMeter(6_804_900)
                .withYearInEarthDays(686.960_1)
                .withAcceleration(3.69)
                .containsGases(Gases.CARBON_DIOXIDE, Gases.NITROGEN)
                .doesNotContainGases(Gases.OXYGEN);
    }
}
