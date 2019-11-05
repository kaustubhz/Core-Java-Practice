package threads;

import java.util.ArrayList;

import static ioutils.IOOpeartions.*;
import com.app.core.Employee;

public class MyThreads implements Runnable {

	private String fileName;
	private ArrayList<Employee> emp;
	public MyThreads(String fileName,ArrayList<Employee> emp) {
		super();
		this.fileName = fileName;
		this.emp=emp;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		writeData(fileName,emp);
		try {
			Thread.sleep(5000);
			System.out.println("\n Reading from a file");
			readData(fileName);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
}
