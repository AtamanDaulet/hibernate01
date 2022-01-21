package h06.lazy_fetch_eager_fetch;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunnerFetch06 {

	public static void main(String[] args) {
		Student06 std = new Student06();

						
		Configuration con = new Configuration().configure("hibernate.cfg.xml").
				addAnnotatedClass(Book06.class).
				addAnnotatedClass(Student06.class);
		
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();		
		
		Transaction tx = session.beginTransaction();		
		
		std = session.get(Student06.class, 101);
		
		
		
		
		
		tx.commit();

		System.out.println(std);
		System.out.println(std.getBookList());

	}

}
