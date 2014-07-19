package com.crabcakeali.bdaysatsolarsystem;

import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.Period;

public class BDaysAtSolarSystem {
	
	DateTime earthBirthday = null;
	DateTime currentDateTime = new DateTime();
	
	public BDaysAtSolarSystem(DateTime earthBirthday) {
		this.earthBirthday = earthBirthday;
	}
	
	public double GetAgeInDays(Planet planet) {
		return planet.age_in_days(this.earthBirthday, currentDateTime);
	}
	
	public double GetAgeInYears(Planet planet) {
		return planet.age_in_years(this.earthBirthday, currentDateTime);
	}
	
	public DateTime GetNextBirthday(Planet planet) {
		return planet.next_birthday(this.earthBirthday, currentDateTime);
	}
	
	//	Planet	 Rotation Period in days	 Revolution Period in days
	public enum Planet {
	    MERCURY ( 58.6, 87.97),
	    VENUS   ( 243.0, 224.7),
	    EARTH   ( 1, 365.26),
	    MARS    ( 1.03, 686.98),
	    JUPITER ( 0.41, 4332.71),
	    SATURN  ( 0.45, 10759.5),
	    URANUS  ( 0.72, 30685),
	    NEPTUNE ( 0.67, 60190),
	    PLUTO 	( 6.39, 90800);

	    private final double rotationPeriod;   // in days
	    private final double revolutionPeriod; // in days
	    
	    Planet(double rotationPeriod, double revolutionPeriod) {
	        this.rotationPeriod = rotationPeriod;
	        this.revolutionPeriod = revolutionPeriod;
	    }
	    
	    private double rotationPeriod() { return rotationPeriod; }
	    private double revolutionPeriod() { return revolutionPeriod; }

	    double age_in_days(DateTime onEarthBirthday, DateTime onEarthCurrentDateTime) {

	        // age is the age in days
	        int ageOnEarthDays = Days.daysBetween(onEarthBirthday, onEarthCurrentDateTime).getDays();
	        
	        if(ageOnEarthDays <= 0)
	        	return 0.00;
	        
	        double ageInDaysOnPlanet = (double)ageOnEarthDays / rotationPeriod();

	    	return ageInDaysOnPlanet;
	    }
	    
	    double age_in_years(DateTime onEarthBirthday, DateTime onEarthCurrentDateTime) {
	    	
	        // age is the age in days
	        int ageOnEarthDays = Days.daysBetween(onEarthBirthday, onEarthCurrentDateTime).getDays();
	        
	        if(ageOnEarthDays <= 0)
	        	return 0.00;
	        
	        double ageInYearsOnPlanet = (double)ageOnEarthDays / revolutionPeriod();

	    	return ageInYearsOnPlanet;
	    }
	    
	    DateTime next_birthday(DateTime onEarthBirthday, DateTime onEarthCurrentDateTime) {

	        // age is the age in days
	    	DateTime baseDateTime = new DateTime(
	    			onEarthCurrentDateTime.getYear(),
	    			onEarthCurrentDateTime.getMonthOfYear(),
	    			onEarthCurrentDateTime.getDayOfMonth(),
	    			0,
	    			0,
	    			0);
	    	
	        int ageOnEarthDays = Days.daysBetween(onEarthBirthday, baseDateTime).getDays();
	        
	        if(ageOnEarthDays <= 0)
	        	return null;
	        
	        double ageInYearsOnPlanet = (double)ageOnEarthDays / revolutionPeriod();

	        DateTime nextBirthDay = null;
	        Period totalDays = null;
	        double periodInDays = 0.0;
	        
	        if ( ageInYearsOnPlanet > 1.00) {
	        	periodInDays = ( 1 - ( ageInYearsOnPlanet - (int)ageInYearsOnPlanet)) * revolutionPeriod();
	        }
	        else {
	        	periodInDays = ( 1.00 - ageInYearsOnPlanet) * revolutionPeriod();
	        }
	        
        	totalDays = Period.minutes((int)(periodInDays * 24 * 60));
        	DateTime calcVal = baseDateTime.plus(totalDays); 
        	nextBirthDay = new DateTime(calcVal.getYear(), calcVal.getMonthOfYear(), calcVal.getDayOfMonth(), 0, 0, 0);
	    	return nextBirthDay;
	    }
	}
}
