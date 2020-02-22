package com.EPAMPEP.maven.EstimateCost;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
/**
 * Hello world!
 *
 */
public class App 
{
	private static final Logger LOGGER = LogManager.getLogger(App.class);
    public static void main( String[] args )
    {
        
    }
    
    static
    {
    	App.costCalculation();
    }
    
    static void costCalculation()
    {
    	Scanner sc = new Scanner(System.in);
    	while(true)
    	{
    		double totalCost=0, squareFeet;
    		LOGGER.debug("\n\nPress 1 to use Standard Materials\nPress 2 to use Above Standard Materials\nPress 3 to use High Standard Materials\nPress 4 to use High Standard Material and need Fully Automated Home\nPress 5 to Exit\n");
    		LOGGER.debug("\nEnter your choice: ");
    		int choice = sc.nextInt();
    		switch(choice)
    		{
    			case 1: LOGGER.debug("\nHow many square feet do you want? : ");
        				squareFeet = sc.nextDouble();
    					LOGGER.debug("\nPer Square Feet cost: 1200INR");
    					totalCost=squareFeet*1200;
    					LOGGER.debug("\nThe Total Cost is: "+totalCost);
    					break;
    			case 2: LOGGER.debug("\nHow many square feet do you want? : ");
        				squareFeet = sc.nextDouble();
        				LOGGER.debug("\nPer Square Feet cost: 1500INR");
						totalCost=squareFeet*1500;
						LOGGER.debug("\nThe Total Cost is: "+totalCost);
						break;
    			case 3: LOGGER.debug("\nHow many square feet do you want? : ");
        				squareFeet = sc.nextDouble();
        				LOGGER.debug("\nPer Square Feet cost: 1800INR");
						totalCost=squareFeet*1800;
						LOGGER.debug("\nThe Total Cost is: "+totalCost);
						break;
    			case 4: LOGGER.debug("\nHow many square feet do you want? : ");
        				squareFeet = sc.nextDouble();
        				LOGGER.debug("\nPer Square Feet cost: 2500INR");
						totalCost=squareFeet*2500;
						LOGGER.debug("\nThe Total Cost is: "+totalCost);
						break;
    			case 5: System.exit(0);
    			default: LOGGER.debug("\nWrong Choice!\n");
    		}
    	}
    }
}
