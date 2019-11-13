package dao;

import pojos.User;
import static utils.HibernateUtils.*;

import org.hibernate.*;

public class UserDAOImpl implements IUserDao {

	@Override
	public String registerUser(User objUser) {
//		Gets session object
		Session objSession=getSf().openSession();
		
		Transaction objTransaction=objSession.beginTransaction();
		try {
			objSession.save(objUser);
		}
		catch (HibernateException e) {
			if(objTransaction!=null)
				objTransaction.rollback();
			throw e;
		}
		finally {
			objSession.close(); //Returns the session obj to SessionFactory
		}
		return "User registration success: ID"+objUser.getUserID();
	}

}
