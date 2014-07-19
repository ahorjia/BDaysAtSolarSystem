package com.crabcakeali.bdaysatsolarsystem;

import org.joda.time.DateTime;
import org.joda.time.Interval;
import org.joda.time.Period;
import org.joda.time.PeriodType;

public class AgeCalculator {
	public void GetAge(DateTime birthdate) {
		Period age = new Period(birthdate, new DateTime(), PeriodType.yearMonthDay());
		int years = age.getYears();
		int months = age.getMonths();
		int days = age.getDays();
	}
}
