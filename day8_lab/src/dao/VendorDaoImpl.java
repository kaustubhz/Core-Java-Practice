package dao;

import java.time.LocalDate;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import pojos.Vendor;
import static utils.HibernateUtils.*;
public class VendorDaoImpl implements IVendorDao {

	@Override
	public String registerVendor(Vendor v) {
		Session ss=getSessionFactory().getCurrentSession();
		Transaction tx=ss.beginTransaction();
		try {
			ss.save(v);
			tx.commit();
		}
		catch(HibernateException e)
		{
			if(tx != null)
				tx.rollback();
			throw e;
		}
		return "Vendor successfully registered";
	}

	@Override
	public Vendor getDetails(int id) {
		Vendor v=null;
		Session ss=getSessionFactory().getCurrentSession();
		Transaction tx=ss.beginTransaction();
		try {
			v=ss.get(Vendor.class,id);
			tx.commit();
		}
		catch(HibernateException e)
		{
			if(tx != null)
				tx.rollback();
			throw e;
		}
		return v;
	}

	@Override
	public List<Vendor> getAllVendors() {
		Session ss=getSessionFactory().getCurrentSession();
		Transaction tx=ss.beginTransaction();
		List<Vendor> vendorList=null;
		String query="SELECT objVendor FROM Vendor objVendor";
		try {
			vendorList=ss.createQuery(query, Vendor.class).getResultList();
			tx.commit();
		}
		catch(HibernateException e)
		{
			if(tx != null)
				tx.rollback();
			throw e;
		}
		return vendorList;
	}

	@Override
	public List<Vendor> getSelectedVendors(String city, LocalDate dt) {
		List<Vendor> vendors=null;
		String jpql="SELECT vendor FROM Vendor vendor WHERE vendor.city= :c1 and vendor.regDate= :d1";
		Session ss=getSessionFactory().getCurrentSession();
		Transaction tx=ss.beginTransaction();
		try {
			vendors=ss.createQuery(jpql, Vendor.class).setParameter("c1", city).setParameter("d1", dt).getResultList();
			tx.commit();
		}
		catch(HibernateException e)
		{
			if(tx != null)
				tx.rollback();
			throw e;
		}
		return vendors;
	}

	@Override
	public String updateVendorDetails(int vid, String newCity, String newPhone) {
		Vendor v=null;
		String jpql="SELECT v FROM Vendor v WHERE v.id= :id1";
		Session ss=getSessionFactory().getCurrentSession();
		Transaction tx=ss.beginTransaction();
		try {
			v=ss.createQuery(jpql,Vendor.class).setParameter("id1",vid).getSingleResult();
			v.setCity(newCity);
			v.setPhone(newPhone);
			tx.commit();
		}
		catch(Exception e)
		{
			if(tx != null)
				tx.rollback();
			throw e;
		}
		return "Vendor details updated successfully";
	}

	@Override
	public String deleteVendorDetails(Integer vid) {
		Vendor v=null;
		Session ss=getSessionFactory().getCurrentSession();
		Transaction tx=ss.beginTransaction();
		String jpql="DELETE FROM Vendor vendor WHERE vendor.id= :id1";
//		String jpql="SELECT v FROM Vendor v WHERE v.id= :id1";
		try {
			int res=ss.createQuery(jpql,Vendor.class).setParameter("id1",vid).executeUpdate();
			
			
			tx.commit();
//			return "SUCCESS";
		}
		catch(Exception e)
		{
			if(tx != null)
				tx.rollback();
			throw e;
		}
		return "Success";
	}

}
