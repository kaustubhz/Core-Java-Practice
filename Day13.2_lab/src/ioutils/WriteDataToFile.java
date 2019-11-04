package ioutils;

import static collectionutils.DepartmentRecords.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;


import com.app.core.Department;

import utils.SortBySalary;

public class WriteDataToFile implements Serializable {
	private static HashMap<Integer, Department> allDepartments = populateDepartment();

	public WriteDataToFile() {
		super();
//		 allDepartments = populateDepartment();
		// TODO Auto-generated constructor stub
	}

	public static void writeData() {
		if (!new File("File1.ser").exists()) {
			try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("File1.ser"))) {
				for(int key:allDepartments.keySet())
				{
					Collections.sort(allDepartments.get(key).getEmployeeList(),new SortBySalary());					
				}
				oos.writeObject(allDepartments);
					
				
			} catch (IOException ie) {
				System.out.println(ie.getMessage());
			}
		}

	}
	public static void readData()
	{
//		System.out.println("\nInside readData");
		if(new File("File1.ser").exists()) {
//			System.out.println("\nInside read");
			try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("File1.ser"))) {
//				HashMap<Integer, Department> tempObj=(HashMap<Integer, Department>) ois.readObject();
				System.out.println( (HashMap<Integer, Department>) ois.readObject());
				
			} catch (IOException | ClassNotFoundException ie) {
				System.out.println(ie.getMessage());
			}
		}
	}
}
