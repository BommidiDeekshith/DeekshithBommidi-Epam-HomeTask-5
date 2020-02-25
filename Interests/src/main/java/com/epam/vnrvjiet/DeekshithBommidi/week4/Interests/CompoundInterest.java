package com.epam.vnrvjiet.DeekshithBommidi.week4.Interests;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CompoundInterest {
	private static final Logger LoggerObject = LogManager.getLogger(InterestsMain.class);
	public void calculateCompoundInterest()
	{
		Scanner sc = new Scanner(System.in);
		double totalAmount,initialAmount,rateOfInterest;
		double noOfMonths;
		int compoundInterestMethod;
		YearsFunction calcYears=new YearsFunction();
		LoggerObject.info("Enter the Amount:");
		initialAmount=sc.nextDouble();
		LoggerObject.info("Enter the Rate Of Interest(In Percentage):");
		rateOfInterest=sc.nextDouble();
		LoggerObject.info("Enter the Number Of Months:");
		noOfMonths=sc.nextDouble();
		LoggerObject.info("Compound Interest Annually(0)/HalfYearly(1)/Quarterly(2):");
		compoundInterestMethod=sc.nextInt();
		double Years=12;
		switch(compoundInterestMethod)
		{
		case 0:Years=calcYears.noOfYears(noOfMonths,12);break;
		case 1:Years=calcYears.noOfYears(noOfMonths,6);break;
		case 2:Years=calcYears.noOfYears(noOfMonths,3);break;
		default:LoggerObject.info("Enter correct Mode of Interest");
		}
		totalAmount=((initialAmount*Math.pow((1+rateOfInterest/100),Years)))-initialAmount;
		LoggerObject.info("Interest Amount after Compound Interest  for " +noOfMonths+ " months is:"+totalAmount);
		double result=totalAmount+initialAmount;
		LoggerObject.info("Total Amount after Compound Interest  for " +noOfMonths+ " months is:"+result);
		sc.close();
	}
};
