package com.blogspot.mstachniuk.hamcrestvsfest;

import java.util.HashSet;
import java.util.Set;

public class SolarSystem {

    public Set<Planet> getInnerPlanets() {
        Set<Planet> innerPlanets = new HashSet<Planet>();
        Planet mercury = new PlanetBuilder()
                .withName("Mercury")
                .withRotation(RotationDirection.LEFT)
                .withDiameterInMeter(4_879_400)
                .withYearInEarthDays(87.96935)
                .withAcceleration(3.701)
                .withGas(Gases.OXYGEN)
                .withGas(Gases.SODIUM)
                .withGas(Gases.HYDROGEN)
                .build();
        innerPlanets.add(mercury);
        Planet venus = new PlanetBuilder()
                .withName("Venus")
                .withRotation(RotationDirection.RIGHT)
                .withDiameterInMeter(12_103_700)
                .withYearInEarthDays(224.700_96)
                .withAcceleration(8.87)
                .withGas(Gases.CARBON_DIOXIDE)
                .withGas(Gases.NITROGEN)
                .build();
        innerPlanets.add(venus);
        Planet earth = new PlanetBuilder()
                .withName("Earth")
                .withRotation(RotationDirection.LEFT)
                .withDiameterInMeter(12_756_273)
                .withYearInEarthDays(365.256_363_004)
                .withAcceleration(9.806_65)
                .withGas(Gases.NITROGEN)
                .withGas(Gases.OXYGEN)
                .build();
        innerPlanets.add(earth);
        Planet mars = new PlanetBuilder()
                .withName("Mars")
                .withRotation(RotationDirection.LEFT)
                .withDiameterInMeter(6_804_900)
                .withYearInEarthDays(686.960_1)
                .withAcceleration(3.69)
                .withGas(Gases.CARBON_DIOXIDE)
                .withGas(Gases.NITROGEN)
                .build();
        innerPlanets.add(mars);
        return innerPlanets;
    }
}
