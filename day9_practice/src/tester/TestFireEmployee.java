package tester;

import static utils.HibernateUtils.getSessionFactory;

import java.util.Scanner;

import org.hibernate.SessionFactory;

import dao.EmployeeDaoImpl;

public class TestFireEmployee {

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in);SessionFactory sf=getSessionFactory()){
			System.out.println("Hibernate booted ...");
			EmployeeDaoImpl dao=new EmployeeDaoImpl();
			System.out.println("Enter department id and employee id:");
			System.out.println(dao.fireEmp(sc.nextInt(),sc.nextInt()));
		}catch(Exception e) {
			e.printStackTrace();
		}


	}

}
