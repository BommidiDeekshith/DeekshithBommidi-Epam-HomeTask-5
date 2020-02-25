package com.epam.vnrvjiet.DeekshithBommidi.week4.Interests;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

//import java.util.Scanner;

public class SimpleInterest {
	private static final Logger LoggerObject = LogManager.getLogger(InterestsMain.class);

			public void calculateSimpleInterest()
			{
				Scanner sc = new Scanner(System.in);
				double totalAmount,initialAmount,rateOfInterest;
				double noOfMonths;
				YearsFunction calcYears=new YearsFunction();
				LoggerObject.info("Enter the Amount:");
				initialAmount=sc.nextDouble();
				LoggerObject.info("Enter the Rate Of Interest(in percentage):");
				rateOfInterest=sc.nextDouble();
				LoggerObject.info("Enter the Number Of Months:");
				noOfMonths=sc.nextInt();
				double Years=calcYears.noOfYears(noOfMonths,12);
				totalAmount=((initialAmount*rateOfInterest*Years)/100);
				LoggerObject.info("Interest Amount after Simple Interest  for " +noOfMonths+ " months is:"+totalAmount);
				double result=totalAmount+initialAmount;
				LoggerObject.info("Total Amount after Simple Interest for " +noOfMonths+ " months is:"+result);
				sc.close();
			}
}
