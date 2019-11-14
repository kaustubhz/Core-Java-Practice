package utils;

import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;


public class HibernateUtils {
	private static SessionFactory sessionFactory;
	static {
		try {
			System.out.println("in static init block");
			// reg
			StandardServiceRegistry reg = new StandardServiceRegistryBuilder().configure().build();
			sessionFactory = new MetadataSources(reg).buildMetadata().buildSessionFactory();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
}
