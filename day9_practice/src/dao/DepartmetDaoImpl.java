package dao;

import org.hibernate.*;
import pojos.*;
import static utils.HibernateUtils.*;

public class DepartmetDaoImpl implements IDepartmentDao {

	@Override
	public String createNewDeptDepartment(Department d) {
		String messg = "Department creation failed";
		Session hs = getSessionFactory().getCurrentSession();
		Transaction tx = hs.beginTransaction();
		try {
			hs.save(d);
			tx.commit();
			messg="Depart created successfully";
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			throw e;
		}
		return messg;
	}


}
