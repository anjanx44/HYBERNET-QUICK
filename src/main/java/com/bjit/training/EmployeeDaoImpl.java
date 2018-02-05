package com.bjit.training;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import com.bjit.HYBERNET_QUICK.HibernateUtil;
import com.bjit.training.Employee;

public class EmployeeDaoImpl implements EmployeeDAO {
	public Integer addEmployee(Employee employee) {
		SessionFactory sessFact = HibernateUtil.getSessionFactory();
		Session session = sessFact.getCurrentSession();
		org.hibernate.Transaction tx = session.beginTransaction();
		Integer employeeID = null;
		try {
			employeeID = (Integer) session.save(employee);
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return employeeID;
	}
}