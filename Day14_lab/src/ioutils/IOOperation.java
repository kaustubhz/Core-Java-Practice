package ioutils;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import com.app.core.Employee;

public class IOOperation {

	public static void writeData(String fileName,List<Employee> emps) throws IOException
	{
		try(PrintWriter pw=new PrintWriter(fileName)){
			pw.println(emps);
		}
		
		
	}
}
