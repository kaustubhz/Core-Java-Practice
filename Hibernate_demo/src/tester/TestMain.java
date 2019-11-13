package tester;
import static utils.HibernateUtils.*;
import org.hibernate.*;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(SessionFactory objSessionFactory=getSf()) {
			System.out.println("\n Hibernate booted");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
