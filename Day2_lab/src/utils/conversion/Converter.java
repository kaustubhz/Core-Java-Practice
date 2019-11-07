package utils.conversion;

class Converter
{
	public static double convertPoundsToKgs(int weightInPound)
	{
		return weightInPound*0.4536;		
	}
	
	public static double converCelsToFarh(double tempInCelsius)
	{
		return (tempInCelsius*(9/5)+32);		
	}
	
	public static String convertToTime(int timeInSec)
	{
		int hr=timeInSec/3600;
		timeInSec%=3600;
		int min=timeInSec/60;
		timeInSec%=60;
		
		int sec=timeInSec;
		
		return " "+hr+" hr "+min+" min "+sec+" sec";
	}
}
