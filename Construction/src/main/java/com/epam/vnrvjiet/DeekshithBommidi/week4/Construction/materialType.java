package com.epam.vnrvjiet.DeekshithBommidi.week4.Construction;

import java.util.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class materialType {
	private static final Logger LoggerObject = LogManager.getLogger(constructionCostMain.class);

	public int materialTypeFormats()
	{
		
		int d;
		Scanner sc=new Scanner(System.in);
		LoggerObject.info("1.Standard Material : 1200 Rupees only");
		LoggerObject.info("2.Above Standard Material : 1500 Rupees only");
		LoggerObject.info("3.High Standard Material : 1800 Rupees only");
		LoggerObject.info("4.High Standard Material and Fully Automated Home : 2500 Rupees only");
		LoggerObject.info("Choose One of the Material Standard:");
		d=sc.nextInt();
		sc.close();
		return d;

	}
}
