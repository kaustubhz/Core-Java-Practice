package tester;

import static utils.HibernateUtils.getSessionFactory;

import java.util.List;
import java.util.Scanner;

import org.hibernate.SessionFactory;

import dao.EmployeeDaoImpl;
import pojos.*;


public class TestListEmployees {

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in);SessionFactory sf=getSessionFactory()){
			System.out.println("Hibernate booted ...");
			System.out.println("Enter department name");
			EmployeeDaoImpl dao=new EmployeeDaoImpl();
			List<Employee> list=dao.listEmps(sc.next());
			for(Employee e:list) {
				System.out.println(e);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
