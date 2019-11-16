package tester;

import org.hibernate.SessionFactory;
import static utils.HibernateUtils.*;

public class TestHibernate {

	public static void main(String[] args) {
		try(SessionFactory sf=getSessionFactory()){
			System.out.println("Hibernate booted ...");
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
