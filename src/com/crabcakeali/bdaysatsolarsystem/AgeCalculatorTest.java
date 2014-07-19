package com.crabcakeali.bdaysatsolarsystem;

import static org.junit.Assert.*;

import org.joda.time.DateTime;
import org.junit.Test;

public class AgeCalculatorTest {

	@Test
	public void test() {
		AgeCalculator ac = new AgeCalculator();
		ac.GetAge(new DateTime(2013, 3, 27, 0, 0, 0));
		fail("Not yet implemented");
	}

}
