package tester;

import static utils.HibernateUtils.getSessionFactory;

import java.util.Scanner;

import org.hibernate.SessionFactory;

import dao.DepartmetDaoImpl;
import pojos.*;

public class TestCreateNewDepartment {

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in);SessionFactory sf=getSessionFactory()){
			System.out.println("Hibernate booted ...");
			System.out.println("Enter department details(name,location):");
			Department d=new Department(sc.next(),sc.next());
			for (int i = 0; i < 3; i++) {
				System.out.println("Enter employee details(name,salary):");
				Employee e=new Employee(sc.next(),sc.nextDouble());
				d.addEmployee(e);
			}
			DepartmetDaoImpl dao= new DepartmetDaoImpl();
			System.out.println(dao.createNewDeptDepartment(d));
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
