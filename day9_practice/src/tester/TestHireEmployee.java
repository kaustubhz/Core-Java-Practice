package tester;

import static utils.HibernateUtils.getSessionFactory;

import java.util.Scanner;

import org.hibernate.SessionFactory;

import dao.EmployeeDaoImpl;
import pojos.Employee;

public class TestHireEmployee {

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in);SessionFactory sf=getSessionFactory()){
			System.out.println("Hibernate booted ...");
			System.out.println("Enter department id and employee deatails(name,salary):");
			EmployeeDaoImpl dao=new EmployeeDaoImpl();
			System.out.println(dao.hireEmp(sc.nextInt(),new Employee(sc.next(),sc.nextDouble())));
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
