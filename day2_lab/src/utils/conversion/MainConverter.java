package utils.conversion;

import java.util.Scanner;

public class MainConverter
{
	
	public static void main(String[] args)
	{
		boolean exit=false;
		int choice=0;
		
		
		Scanner sc=new Scanner(System.in);
		
		do
		{
			System.out.println("\nMenu");
			System.out.print("\n 1.Weight (in pounds): ");
			System.out.print("\n 2.Temperature (in celsius): ");
			System.out.print("\n 3.Time (in Seconds): ");
			System.out.print("\n 4.EXIT");
			System.out.print("\n Enter your choice: ");
			choice=sc.nextInt();
			
			switch(choice)
			{
				case 1:
						{
							int pounds;
							System.out.print("\n Enter weight (in pounds): ");
							pounds=sc.nextInt();
							System.out.print("\nWeight [in Pounds] "+pounds+"\t Weight [in KGs] "+Converter.convertPoundsToKgs(pounds));
							
						}
						break;
				
				case 2:
						{
							int tempInCelcius;
							System.out.print("\n Enter temperature (in celsius): ");
							tempInCelcius=sc.nextInt();
							System.out.print("\nTemperature [in C] "+tempInCelcius+"\t Temperature [in F] "+Converter.converCelsToFarh(tempInCelcius));
		
						}
						break;
				
				case 3:
						{
							int timeInSecs;
							System.out.print("\n Enter time (in Seconds): ");
							timeInSecs=sc.nextInt();
							System.out.print("\nTime [in Seconds] "+timeInSecs+"\t Time [hh:mm:ss] "+Converter.convertToTime(timeInSecs));
						}
						break;
						
				case 4:
						{
							System.out.print("\nEXITING");
							exit=true;
						}
						break;
			}
		}while(exit!=true);
	
		
	}
}