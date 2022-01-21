package h02.embeddables;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunnerFetch02 {

	public static void main(String[] args) {
		
		Student02 st01 = new Student02();

		Configuration con = new Configuration().
				configure("hibernate.cfg.xml").
				addAnnotatedClass(Student02.class);
		SessionFactory sf = con.buildSessionFactory();		
		Session session = sf.openSession();
		
		Transaction tx = session.beginTransaction();
		
		st01 = session.get(Student02.class, 101);
		System.out.println(st01.getStudent_id()+", "+ st01.getName()+", "+ st01.getCourses().getSelective());	
		System.out.println(st01);
		tx.commit();		
		
		
		session.close();


	}

}
