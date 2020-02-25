package com.epam.vnrvjiet.DeekshithBommidi.week4.Construction;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CostCalculation {
	private static final Logger LoggerObject = LogManager.getLogger(constructionCostMain.class);
	
	public long calculateCostOfLand(long landSize,int material)
	{
		switch(material)
		{
		case 1:return landSize*1200;
		case 2:return landSize*1500;
		case 3:return landSize*1800;
		case 4:return landSize*2500;
		default:LoggerObject.info("Choose correct Option");
		}
		return 0;
	}
	
}
