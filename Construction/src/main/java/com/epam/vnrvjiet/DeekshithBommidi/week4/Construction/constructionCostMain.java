package com.epam.vnrvjiet.DeekshithBommidi.week4.Construction;
import java.util.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.epam.vnrvjiet.DeekshithBommidi.week4.Construction.constructionCostMain;
public class constructionCostMain {
	private static final Logger LoggerObject = LogManager.getLogger(constructionCostMain.class);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		materialType materialTypeObject = new materialType();
		CostCalculation costCalculationObject = new CostCalculation();
		long landSize;
		LoggerObject.info("Enter the size of Land in square meters:");
		landSize=sc.nextLong();
		
		LoggerObject.info("Select Material Type:");
		int material=materialTypeObject.materialTypeFormats();
		long totalCost=costCalculationObject.calculateCostOfLand(landSize, material);
		LoggerObject.info("The Total Cost Of Your Land according to Your Specification is : "+totalCost+" Rupees Only");
		sc.close();
	}

}
