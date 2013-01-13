package com.blogspot.mstachniuk.hamcrestvsfest;

import java.util.HashSet;
import java.util.Set;

public class SolarSystem {

    public Set<Planet> getInnerPlanets() {
        Set<Planet> innerPlanets = new HashSet<Planet>();
        Planet mercury = new PlanetBuilder()
                .name("Mercury")
                .rotation(RotationDirection.LEFT)
                .diameterInMeter(4_879_400)
                .yearInEarthDays(87.96935)
                .acceleration(3.701)
                .addGas(Gases.OXYGEN)
                .addGas(Gases.SODIUM)
                .addGas(Gases.HYDROGEN)
                .build();
        innerPlanets.add(mercury);
        Planet venus = new PlanetBuilder()
                .name("Venus")
                .rotation(RotationDirection.RIGHT)
                .diameterInMeter(12_103_700)
                .yearInEarthDays(224.700_96)
                .acceleration(8.87)
                .addGas(Gases.CARBON_DIOXIDE)
                .addGas(Gases.NITROGEN)
                .build();
        innerPlanets.add(venus);
        Planet earth = new PlanetBuilder()
                .name("Earth")
                .rotation(RotationDirection.LEFT)
                .diameterInMeter(12_756_273)
                .yearInEarthDays(365.256_363_004)
                .acceleration(9.806_65)
                .addGas(Gases.NITROGEN)
                .addGas(Gases.OXYGEN)
                .addGas(Gases.ARGON)
                .addGas(Gases.CARBON_DIOXIDE)
                .build();
        innerPlanets.add(earth);
        Planet mars = new PlanetBuilder()
                .name("Mars")
                .rotation(RotationDirection.LEFT)
                .diameterInMeter(6_804_900)
                .yearInEarthDays(686.960_1)
                .acceleration(3.69)
                .addGas(Gases.CARBON_DIOXIDE)
                .addGas(Gases.NITROGEN)
                .build();
        innerPlanets.add(mars);
        return innerPlanets;
    }
}
