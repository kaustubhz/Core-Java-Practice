package com.app.average;
class Average
{
	public static void main(String[] args)
	{
		if(args.length<2)
		{
			System.out.println("Wrong input: Arguments less than 2");
		}
		else
		{
			double sum=0;
			for(int i=0;i<args.length;i++)
			{
				sum+=Double.parseDouble(args[i]);
			}
			System.out.println("\nAverage is: "+sum/args.length);
		}
	}
}