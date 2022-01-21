package h07.caching_mecanism;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunnerFetch07 {

	public static void main(String[] args) {
		Student07 std = new Student07();
		Book07 b = new Book07();
						
		Configuration con = new Configuration().configure("hibernate.cfg.xml").
				addAnnotatedClass(Book07.class).
				addAnnotatedClass(Student07.class);
		
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();		
		
		Transaction tx = session.beginTransaction();		
		
		//std = session.get(Student07.class, 101);
		//std = session.get(Student07.class, 101);
		b = session.get(Book07.class, 10);		
		b = session.get(Book07.class, 11);
		b = session.get(Book07.class, 10);
		b = session.get(Book07.class, 11);
		
		tx.commit();

		Session session2 = sf.openSession();		
		
		Transaction tx2 = session2.beginTransaction();	
		
		Book07 b2 = session.get(Book07.class, 10);		
		b = session.get(Book07.class, 12);
		b = session.get(Book07.class, 12);
		
		tx2.commit();
		
		System.out.println(std);
		//System.out.println(std);
		System.out.println(b);

	}

}
