package com.epam.vnrvjiet.DeekshithBommidi.week4.Interests;
import java.util.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class InterestsMain {
	private static final Logger LoggerObject = LogManager.getLogger(InterestsMain.class);
	public static void main(String[] args)
	{
		
		SimpleInterest calcSimpleInterest=new SimpleInterest();
		CompoundInterest calcCompoundInterest=new CompoundInterest();
		int d;
		Scanner sc=new Scanner(System.in);
		try
		{
			LoggerObject.info("Enter the Operation:Simple(0)/Compound(1)");
			d=sc.nextInt();
			if(d==0)
			{
				calcSimpleInterest.calculateSimpleInterest();
			}
			else if(d==1)
			{
				calcCompoundInterest.calculateCompoundInterest();
			}
			else
			{
				LoggerObject.info("Choose one of the above methods only");
			}
		}
		finally
		{
			
		}
		sc.close();
	}

}
