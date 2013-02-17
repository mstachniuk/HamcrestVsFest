package com.blogspot.mstachniuk.hamcrestvsfest.fest2;

import com.blogspot.mstachniuk.hamcrestvsfest.Gases;
import com.blogspot.mstachniuk.hamcrestvsfest.Planet;
import com.blogspot.mstachniuk.hamcrestvsfest.RotationDirection;
import com.blogspot.mstachniuk.hamcrestvsfest.SiderealYear;
import org.fest.assertions.api.AbstractAssert;
import org.fest.assertions.api.Assertions;

import static java.lang.String.format;


/**
 * {@link Planet} specific assertions - Generated by CustomAssertionGenerator.
 */
public class PlanetAssert extends AbstractAssert<PlanetAssert, Planet> {

  /**
   * Creates a new </code>{@link PlanetAssert}</code> to make assertions on actual Planet.
   * @param actual the Planet we want to make assertions on.
   */
  public PlanetAssert(Planet actual) {
    super(actual, PlanetAssert.class);
  }

  /**
   * An entry point for PlanetAssert to follow Fest standard <code>assertThat()</code> statements.<br>
   * With a static import, one's can write directly : <code>assertThat(myPlanet)</code> and get specific assertion with code completion.
   * @param actual the Planet we want to make assertions on.
   * @return a new </code>{@link PlanetAssert}</code>
   */
  public static PlanetAssert assertThat(Planet actual) {
    return new PlanetAssert(actual);
  }

  /**
   * Verifies that the actual Planet's acceleration is equal to the given one.
   * @param acceleration the given acceleration to compare the actual Planet's acceleration to.
   * @return this assertion object.
   * @throws AssertionError - if the actual Planet's acceleration is not equal to the given one.
   */
  public PlanetAssert hasAcceleration(double acceleration) {
    // check that actual Planet we want to make assertions on is not null.
    isNotNull();

    // we overrides the default error message with a more explicit one
    String errorMessage = format("Expected Planet's acceleration to be <%s> but was <%s>", acceleration, actual.getAcceleration());
    
    // check
    if (actual.getAcceleration() != acceleration) { throw new AssertionError(errorMessage); }

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual Planet's atmosphereGases contains the given Gases elements.
   * @param atmosphereGases the given elements that should be contained in actual Planet's atmosphereGases.
   * @return this assertion object.
   * @throws AssertionError if the actual Planet's atmosphereGases does not contain all given Gases elements.
   */
  public PlanetAssert hasAtmosphereGases(Gases... atmosphereGases) {
    // check that actual Planet we want to make assertions on is not null.
    isNotNull();

    // check that given Gases varargs is not null.
    if (atmosphereGases == null) throw new AssertionError("Expecting atmosphereGases parameter not to be null.");
    
    // check with standard error message (see commented below to set your own message).
    Assertions.assertThat(actual.getAtmosphereGases()).contains(atmosphereGases);

    // uncomment the 4 lines below if you want to build your own error message :
    // WritableAssertionInfo assertionInfo = new WritableAssertionInfo();
    // String errorMessage = "my error message";
    // assertionInfo.overridingErrorMessage(errorMessage);
    // Iterables.instance().assertContains(assertionInfo, actual.getTeamMates(), teamMates);
    
    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual Planet has no atmosphereGases.
   * @return this assertion object.
   * @throws AssertionError if the actual Planet's atmosphereGases is not empty.
   */
  public PlanetAssert hasNoAtmosphereGases() {  
    // check that actual Planet we want to make assertions on is not null.
    isNotNull();

    // we overrides the default error message with a more explicit one
    String errorMessage = format("Expected actual <%s> not to have atmosphereGases but had :\\n%s", actual, actual.getAtmosphereGases());
    
    // check
    if (!actual.getAtmosphereGases().isEmpty()) throw new AssertionError(errorMessage);
    
    // return the current assertion for method chaining
    return this;
  }
  

  /**
   * Verifies that the actual Planet's diameter is equal to the given one.
   * @param diameter the given diameter to compare the actual Planet's diameter to.
   * @return this assertion object.
   * @throws AssertionError - if the actual Planet's diameter is not equal to the given one.
   */
  public PlanetAssert hasDiameter(long diameter) {
    // check that actual Planet we want to make assertions on is not null.
    isNotNull();

    // we overrides the default error message with a more explicit one
    String errorMessage = format("Expected Planet's diameter to be <%s> but was <%s>", diameter, actual.getDiameter());
    
    // check
    if (actual.getDiameter() != diameter) { throw new AssertionError(errorMessage); }

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual Planet's name is equal to the given one.
   * @param name the given name to compare the actual Planet's name to.
   * @return this assertion object.
   * @throws AssertionError - if the actual Planet's name is not equal to the given one.
   */
  public PlanetAssert hasName(String name) {
    // check that actual Planet we want to make assertions on is not null.
    isNotNull();

    // we overrides the default error message with a more explicit one
    String errorMessage = format("Expected Planet's name to be <%s> but was <%s>", name, actual.getName());
    
    // check
    if (!actual.getName().equals(name)) { throw new AssertionError(errorMessage); }

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual Planet's rotationDirection is equal to the given one.
   * @param rotationDirection the given rotationDirection to compare the actual Planet's rotationDirection to.
   * @return this assertion object.
   * @throws AssertionError - if the actual Planet's rotationDirection is not equal to the given one.
   */
  public PlanetAssert hasRotationDirection(RotationDirection rotationDirection) {
    // check that actual Planet we want to make assertions on is not null.
    isNotNull();

    // we overrides the default error message with a more explicit one
    String errorMessage = format("Expected Planet's rotationDirection to be <%s> but was <%s>", rotationDirection, actual.getRotationDirection());
    
    // check
    if (!actual.getRotationDirection().equals(rotationDirection)) { throw new AssertionError(errorMessage); }

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual Planet's siderealYear is equal to the given one.
   * @param siderealYear the given siderealYear to compare the actual Planet's siderealYear to.
   * @return this assertion object.
   * @throws AssertionError - if the actual Planet's siderealYear is not equal to the given one.
   */
  public PlanetAssert hasSiderealYear(SiderealYear siderealYear) {
    // check that actual Planet we want to make assertions on is not null.
    isNotNull();

    // we overrides the default error message with a more explicit one
    String errorMessage = format("Expected Planet's siderealYear to be <%s> but was <%s>", siderealYear, actual.getSiderealYear());
    
    // check
    if (!actual.getSiderealYear().equals(siderealYear)) { throw new AssertionError(errorMessage); }

    // return the current assertion for method chaining
    return this;
  }

}
