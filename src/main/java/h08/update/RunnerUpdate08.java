package h08.update;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import h04.onetomany.Student04;

public class RunnerUpdate08 {

	public static void main(String[] args) {
		Student08 std = new Student08();
						
		Configuration con = new Configuration().configure("hibernate.cfg.xml").
				addAnnotatedClass(Student08.class);
		
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();		
		
		Transaction tx = session.beginTransaction();	
		//***************
//		String hqlQuery = "UPDATE Student08 s SET s.name = 'Veli Hane' WHERE s.name = 'Joe'";
//		int numRows  = session.createQuery(hqlQuery).executeUpdate();
//		System.out.println(numRows);
		//**********************
//		std = session.get(Student08.class, 101);
//		std.setGrade(20);
//		std.setName("Aisha");
		//*******************
		String hqlQuery = "UPDATE Student08 s SET s.name = 'Osman' WHERE s.grade >13";
		int numRows  = session.createQuery(hqlQuery).executeUpdate();
		System.out.println(numRows);
		
		
		tx.commit();

		

		

	}

}
