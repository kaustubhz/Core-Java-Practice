package ioutils;

import static collectionutils.DepartmentRecords.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;


import com.app.core.Department;
import com.app.core.Employee;

import utils.SortBySalary;

public class IOOpeartions implements Serializable {

	public IOOpeartions() {
		super();
	}

	public static void writeData(String file,ArrayList<Employee> empList) {
		if (!new File(file.concat(".ser")).exists()) {
			try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file.concat(".ser")))) {				
					Collections.sort(empList,new SortBySalary());									
				oos.writeObject(empList);									
			} catch (IOException ie) {
				System.out.println(ie.getMessage());
			}
		}

	}

	public static void readData(String file)
	{
//		System.out.println("\nInside readData");
		if(new File(file.concat(".ser")).exists()) {
//			System.out.println("\nInside read");
			try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file.concat(".ser")))) {
//				HashMap<Integer, Department> tempObj=(HashMap<Integer, Department>) ois.readObject();
				System.out.println( (ArrayList<Employee>) ois.readObject());
				
			} catch (IOException | ClassNotFoundException ie) {
				System.out.println(ie.getMessage());
			}
		}
	}
}
