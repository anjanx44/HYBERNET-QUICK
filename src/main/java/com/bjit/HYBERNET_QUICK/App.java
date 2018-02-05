package com.bjit.HYBERNET_QUICK;

import java.util.List;
import javax.persistence.criteria.CriteriaQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import com.bjit.HYBERNET_QUICK.HibernateUtil;
import com.bjit.training.Employee;
import com.bjit.training.EmployeeDAO;
import com.bjit.training.EmployeeDaoImpl;

public class App {
	public static void main(String[] args) throws Exception {
//		SessionFactory sessFact = HibernateUtil.getSessionFactory();
//		Session session = sessFact.getCurrentSession();
//		org.hibernate.Transaction tx = session.beginTransaction();
//		CriteriaQuery<Employee> cq = session.getCriteriaBuilder().createQuery(Employee.class);
//		cq.from(Employee.class);
//		List<Employee> employeeList = session.createQuery(cq).getResultList();
//		for (Employee employee : employeeList) {
//			System.out.println("Hello: " + employee.getEmpName());
//		}
//		tx.commit();
//		System.out.println("Data displayed");
		
		EmployeeDAO employeeDAO = new EmployeeDaoImpl();
		Employee emp = new Employee();
		
		try{
			emp.setEmpName("Anjan");
			emp.setEmpAddress("USA");
			emp.setEmpMobileNos("121345");
			
			Integer empID = employeeDAO.addEmployee(emp);
			
			System.out.println(empID);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
//		sessFact.close();
	}
}