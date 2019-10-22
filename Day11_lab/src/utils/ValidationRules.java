package utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.app.customer.CustomerType;

public class ValidationRules {
private static SimpleDateFormat sdf;
	
	static
	{
		sdf=new SimpleDateFormat("dd-MM-yyyy");
	}
	
//	This converts string to date 
	public static Date convertToDate(String regDate)throws ParseException	{
		return sdf.parse(regDate);
	}
	
//	This checks if proper card type has been inserted
	public static CustomerType validateCustomerType(String type)
	{
		return CustomerType.valueOf(type);
	}
}
