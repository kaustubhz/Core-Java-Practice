package dao;

import static utils.HibernateUtils.getSessionFactory;

import java.util.List;

import org.hibernate.*;

import pojos.*;

public class EmployeeDaoImpl implements IEmployeeDao {
	@Override
	public String hireEmp(int deptId, Employee e) {
		String messg = "Hiring employee failed";
		Session hs = getSessionFactory().getCurrentSession();
		Transaction tx = hs.beginTransaction();
		try {
			Department d=hs.get(Department.class,deptId);
			d.addEmployee(e);
			tx.commit();
			messg = "Hiring employee success";
		} catch (HibernateException e1) {
			if (tx != null)
				tx.rollback();
			throw e1;
		}
		return messg;
	}

	@Override
	public List<Employee> listEmps(String deptName) {
		String jpql="SELECT d FROM Department d JOIN FETCH d.employees WHERE d.name= :nm";
		List<Employee> list=null;
		Session hs = getSessionFactory().getCurrentSession();
		Transaction tx = hs.beginTransaction();
		try {
			Department d=hs.createQuery(jpql,Department.class).setParameter("nm",deptName).getSingleResult();
			list=d.getEmployees();
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			throw e;
		}
		return list;
	}

	@Override
	public String fireEmp(int deptId, int empId) {
		String messg = "Firing employee failed";
		Session hs = getSessionFactory().getCurrentSession();
		Transaction tx = hs.beginTransaction();
		try {
			Department d=hs.get(Department.class,deptId);
			Employee e=d.getEmployees().get(empId-1);
			d.removeEmployee(e);
			tx.commit();
			messg = "Firing employee success";
		} catch (HibernateException e1) {
			if (tx != null)
				tx.rollback();
			throw e1;
		}
		return messg;
	}
}
