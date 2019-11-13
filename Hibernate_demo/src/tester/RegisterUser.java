package tester;
import static utils.HibernateUtils.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import org.hibernate.*;

import pojos.User;
import pojos.UserType;
import dao.UserDAOImpl;
public class RegisterUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		
		
		try(SessionFactory objSessionFactory=getSf();
				Scanner sc=new Scanner(System.in)) {
			
			
			System.out.println("\n Hibernate booted");
			System.out.println("\n Enter user details");
			System.out.println("userName userEmail userPassword userConfirmPassword userRole userRegAmount regDate userType ");
			
			User newUser=new User(sc.next(),sc.next(),sc.next(),sc.next(),sc.next(),sc.nextDouble(),new SimpleDateFormat("dd-MM-yyyy").parse(sc.next()),UserType.valueOf(sc.next()));
			UserDAOImpl dao=new UserDAOImpl();
			dao.registerUser(newUser);
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
