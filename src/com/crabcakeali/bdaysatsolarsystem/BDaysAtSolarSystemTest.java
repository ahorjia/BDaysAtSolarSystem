package com.crabcakeali.bdaysatsolarsystem;

import static org.junit.Assert.*;

import org.joda.time.DateTime;
import org.junit.Test;

import com.crabcakeali.bdaysatsolarsystem.BDaysAtSolarSystem.Planet;

public class BDaysAtSolarSystemTest {

	@Test
	public void testValidMercury() {
		BDaysAtSolarSystem bd = new BDaysAtSolarSystem(new DateTime(1978, 3, 15, 0, 0));
		assertEquals(220.2, bd.GetAgeInDays(Planet.MERCURY), 0.1);
		assertEquals(146.6, bd.GetAgeInYears(Planet.MERCURY), 0.1);
		assertEquals(new DateTime(2013, 8, 9, 0, 0), bd.GetNextBirthday(Planet.MERCURY));
	}

	@Test
	public void testValidVenus() {
		BDaysAtSolarSystem bd = new BDaysAtSolarSystem(new DateTime(1978, 3, 15, 0, 0));
		assertEquals(53.1, bd.GetAgeInDays(Planet.VENUS), 0.1);
		assertEquals(57.4, bd.GetAgeInYears(Planet.VENUS), 0.1);
		assertEquals(new DateTime(2013, 11, 18, 0, 0), bd.GetNextBirthday(Planet.VENUS));
	}

	@Test
	public void testValidEearth() {
		BDaysAtSolarSystem bd = new BDaysAtSolarSystem(new DateTime(1978, 3, 15, 0, 0));
		assertEquals(12905, bd.GetAgeInDays(Planet.EARTH), 0.15);
		assertEquals(35.3, bd.GetAgeInYears(Planet.EARTH), 0.15);
		assertEquals(new DateTime(2014, 3, 15, 0, 0), bd.GetNextBirthday(Planet.EARTH));
	}

	@Test
	public void testValidMars() {
		BDaysAtSolarSystem bd = new BDaysAtSolarSystem(new DateTime(1978, 3, 15, 0, 0));
		assertEquals(12529.1, bd.GetAgeInDays(Planet.MARS), 0.15);
		assertEquals(18.7, bd.GetAgeInYears(Planet.MARS), 0.15);
		assertEquals(new DateTime(2013, 12, 8, 0, 0), bd.GetNextBirthday(Planet.MARS));
	}

	@Test
	public void testValidJupiter() {
		BDaysAtSolarSystem bd = new BDaysAtSolarSystem(new DateTime(1978, 3, 15, 0, 0));
		assertEquals(31475.6, bd.GetAgeInDays(Planet.JUPITER), 0.15);
		assertEquals(2.97, bd.GetAgeInYears(Planet.JUPITER), 0.15);
		assertEquals(new DateTime(2013, 10, 15, 0, 0), bd.GetNextBirthday(Planet.JUPITER));
	}

	@Test
	public void testValidSaturn() {
		BDaysAtSolarSystem bd = new BDaysAtSolarSystem(new DateTime(1978, 3, 15, 0, 0));
		assertEquals(28677.8, bd.GetAgeInDays(Planet.SATURN), 0.15);
		assertEquals(1.19, bd.GetAgeInYears(Planet.SATURN), 0.15);
		assertEquals(new DateTime(2037, 2, 11, 0, 0), bd.GetNextBirthday(Planet.SATURN));
	}

	@Test
	public void testValidUranus() {
		BDaysAtSolarSystem bd = new BDaysAtSolarSystem(new DateTime(1978, 3, 15, 0, 0));
		assertEquals(17923.6, bd.GetAgeInDays(Planet.URANUS), 0.15);
		assertEquals(0.42, bd.GetAgeInYears(Planet.URANUS), 0.15);
		assertEquals(new DateTime(2062, 3, 19, 0, 0), bd.GetNextBirthday(Planet.URANUS));
	}

	@Test
	public void testValidNeptune() {
		BDaysAtSolarSystem bd = new BDaysAtSolarSystem(new DateTime(1978, 3, 15, 0, 0));
		assertEquals(19261.2, bd.GetAgeInDays(Planet.NEPTUNE), 0.15);
		assertEquals(0.21, bd.GetAgeInYears(Planet.NEPTUNE), 0.15);
		assertEquals(new DateTime(2142, 12, 29, 0, 0), bd.GetNextBirthday(Planet.NEPTUNE));
	}

	@Test
	public void testValidPluto() {
		BDaysAtSolarSystem bd = new BDaysAtSolarSystem(new DateTime(1978, 3, 15, 0, 0));
		assertEquals(2019.5, bd.GetAgeInDays(Planet.PLUTO), 0.15);
		assertEquals(0.142, bd.GetAgeInYears(Planet.PLUTO), 0.15);
		assertEquals(new DateTime(2226, 10, 21, 0, 0), bd.GetNextBirthday(Planet.PLUTO));
	}

	@Test
	public void testValidMercury1() {
		BDaysAtSolarSystem bd = new BDaysAtSolarSystem(new DateTime(2013, 3, 27, 0, 0));
		assertEquals(1.8, bd.GetAgeInDays(Planet.MERCURY), 0.1);
		assertEquals(1.2, bd.GetAgeInYears(Planet.MERCURY), 0.1);
		assertEquals(new DateTime(2013, 9, 18, 0, 0), bd.GetNextBirthday(Planet.MERCURY));
	}

	@Test
	public void testValidVenus1() {
		BDaysAtSolarSystem bd = new BDaysAtSolarSystem(new DateTime(2013, 3, 27, 0, 0));
		assertEquals(0.4, bd.GetAgeInDays(Planet.VENUS), 0.1);
		assertEquals(0.4, bd.GetAgeInYears(Planet.VENUS), 0.1);
		assertEquals(new DateTime(2013, 11, 6, 0, 0), bd.GetNextBirthday(Planet.VENUS));
	}

	@Test
	public void testValidEearth1() {
		BDaysAtSolarSystem bd = new BDaysAtSolarSystem(new DateTime(2013, 3, 27, 0, 0));
		assertEquals(109.1, bd.GetAgeInDays(Planet.EARTH), 0.15);
		assertEquals(0.2, bd.GetAgeInYears(Planet.EARTH), 0.15);
		assertEquals(new DateTime(2014, 3, 27, 0, 0), bd.GetNextBirthday(Planet.EARTH));
	}

	@Test
	public void testValidMars1() {
		BDaysAtSolarSystem bd = new BDaysAtSolarSystem(new DateTime(2013, 3, 27, 0, 0));
		assertEquals(105.9, bd.GetAgeInDays(Planet.MARS), 0.15);
		assertEquals(0.1, bd.GetAgeInYears(Planet.MARS), 0.15);
		assertEquals(new DateTime(2015, 2, 11, 0, 0), bd.GetNextBirthday(Planet.MARS));
	}

	@Test
	public void testValidJupiter1() {
		BDaysAtSolarSystem bd = new BDaysAtSolarSystem(new DateTime(2013, 3, 27, 0, 0));
		assertEquals(266.0, bd.GetAgeInDays(Planet.JUPITER), 0.15);
		assertEquals(0.02, bd.GetAgeInYears(Planet.JUPITER), 0.15);
		assertEquals(new DateTime(2025, 2, 4, 0, 0), bd.GetNextBirthday(Planet.JUPITER));
	}

	@Test
	public void testValidSaturn1() {
		BDaysAtSolarSystem bd = new BDaysAtSolarSystem(new DateTime(2013, 3, 27, 0, 0));
		assertEquals(242.2, bd.GetAgeInDays(Planet.SATURN), 0.15);
		assertEquals(0.01, bd.GetAgeInYears(Planet.SATURN), 0.15);
		assertEquals(new DateTime(2042, 9, 10, 0, 0), bd.GetNextBirthday(Planet.SATURN));
	}

	@Test
	public void testValidUranus1() {
		BDaysAtSolarSystem bd = new BDaysAtSolarSystem(new DateTime(2013, 3, 27, 0, 0));
		assertEquals(151.5, bd.GetAgeInDays(Planet.URANUS), 0.15);
		assertEquals(0.0, bd.GetAgeInYears(Planet.URANUS), 0.15);
		assertEquals(new DateTime(2097, 3, 31, 0, 0), bd.GetNextBirthday(Planet.URANUS));
	}

	@Test
	public void testValidNeptune1() {
		BDaysAtSolarSystem bd = new BDaysAtSolarSystem(new DateTime(2013, 3, 27, 0, 0));
		assertEquals(162.8, bd.GetAgeInDays(Planet.NEPTUNE), 0.15);
		assertEquals(0.0, bd.GetAgeInYears(Planet.NEPTUNE), 0.15);
		assertEquals(new DateTime(2178, 1, 10, 0, 0), bd.GetNextBirthday(Planet.NEPTUNE));
	}

	@Test
	public void testValidPluto1() {
		BDaysAtSolarSystem bd = new BDaysAtSolarSystem(new DateTime(2013, 3, 27, 0, 0));
		assertEquals(17, bd.GetAgeInDays(Planet.PLUTO), 0.15);
		assertEquals(0.01, bd.GetAgeInYears(Planet.PLUTO), 0.15);
		assertEquals(new DateTime(2261, 11, 2, 0, 0), bd.GetNextBirthday(Planet.PLUTO));
	}
}
