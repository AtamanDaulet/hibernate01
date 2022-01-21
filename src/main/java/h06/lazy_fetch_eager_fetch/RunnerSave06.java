package h06.lazy_fetch_eager_fetch;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class RunnerSave06 {

	public static void main(String[] args) {
		Book06 b1 = new Book06(10, "Math Book");
		Book06 b2 = new Book06(11, "Science Book");
		Book06 b3 = new Book06(12, "Java Book");	
		
		List<Book06> bookList1 = new ArrayList<Book06>();
		bookList1.add(b1);
		bookList1.add(b2);
		
		
		Student06 std1 = new Student06(101, "Daulet", 12, bookList1);
	
		b1.setStudent(std1);

		System.out.println(std1);
						
		Configuration con = new Configuration().configure("hibernate.cfg.xml").
				addAnnotatedClass(Book06.class).
				addAnnotatedClass(Student06.class);
		
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();		
		
		Transaction tx = session.beginTransaction();		
		
		session.save(b1);
		session.save(b2);
		session.save(b3);		

		session.save(std1);
		
		tx.commit();


	}

}
