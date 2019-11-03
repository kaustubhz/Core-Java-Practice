package tester;

import static ioutils.WriteDataToFile.*;

public class TestMain {

	public static void main(String[] args) {
//		HashMap<Integer, Department> allDepartments = populateDepartment();
//		System.out.println("\n Department Info: \n"+allDepartments);
//		System.out.println("\n Data being written to a file");
	writeData();
		System.out.println("\n Reading data from a file");
		readData();
	}

}
