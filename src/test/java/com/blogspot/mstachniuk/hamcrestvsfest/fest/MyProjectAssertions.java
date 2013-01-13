package com.blogspot.mstachniuk.hamcrestvsfest.fest;

import com.blogspot.mstachniuk.hamcrestvsfest.Planet;
import org.fest.assertions.api.Assertions;

import java.util.Set;

// extending make all standard Fest assertions available.
public class MyProjectAssertions extends Assertions {

    // add the custom assertions related to MyProject
    public static PlanetSetAssert assertThat(Set<Planet> actual) {
        return PlanetSetAssert.assertThat(actual);
    }

    public static PlanetAssert assertThat(Planet actual) {
        return PlanetAssert.assertThat(actual);
    }


}
