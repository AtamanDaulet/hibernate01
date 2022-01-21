package h01.annotations;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunnerSave01 {

	public static void main(String[] args) {
		Students01 student1 = new Students01(101, "Ali Can", 10);
		Students01 student2 = new Students01(102, "Veli Han", 11);

		Configuration con = new Configuration().
				configure("hibernate.cfg.xml").
				addAnnotatedClass(Students01.class);
		SessionFactory sf = con.buildSessionFactory();
		
		Session session = sf.openSession();
		
		Transaction tx = session.beginTransaction();
		
		session.save(student1);
		session.save(student2);
		
		tx.commit();
		System.out.println("Record inserted");
		
		
		
		session.close();
	}

}
