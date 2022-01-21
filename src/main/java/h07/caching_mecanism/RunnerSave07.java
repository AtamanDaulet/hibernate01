package h07.caching_mecanism;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class RunnerSave07 {

	public static void main(String[] args) {
		Book07 b1 = new Book07(10, "Math Book");
		Book07 b2 = new Book07(11, "Science Book");
		Book07 b3 = new Book07(12, "Java Book");	
		
		List<Book07> bookList1 = new ArrayList<Book07>();
		bookList1.add(b1);
		bookList1.add(b2);
		
		
		Student07 std1 = new Student07(101, "Daulet", 12, bookList1);
	
		b1.setStudent(std1);

		System.out.println(std1);
						
		Configuration con = new Configuration().configure("hibernate.cfg.xml").
				addAnnotatedClass(Book07.class).
				addAnnotatedClass(Student07.class);
		
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
