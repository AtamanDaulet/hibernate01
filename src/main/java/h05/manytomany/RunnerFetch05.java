package h05.manytomany;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunnerFetch05 {

	public static void main(String[] args) {

		Student05 std = new Student05();
		
		Book05 book = new Book05();
		
		Configuration con = new Configuration().configure("hibernate.cfg.xml").
				addAnnotatedClass(Book05.class).
				addAnnotatedClass(Student05.class);	
		
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		
		Transaction tx = session.beginTransaction();
			
		std = session.get(Student05.class, 101);
		
		book = session.get(Book05.class, 12);
		
		//System.out.println(std);
		//System.out.println(book);
		
		//Just fetch the data from Book class where book name is Art Book
		
		String hqlQuery = "FROM Book05 where book_name = 'Art Book'";
		
		List<Object> bookList = session.createQuery(hqlQuery).getResultList();
				
//		for(Object each : bookList)
//		System.out.println(each);		
		
		//2. way of getting data as a single data
		
		//Book05  book2 = (Book05) session.createQuery(hqlQuery).getSingleResult();
		
		//System.out.println(book2);
		
		String hqlQuery2 = "FROM Student05 where std_id = 101";	
		
		Student05  std2 = (Student05) session.createQuery(hqlQuery2).getSingleResult();
		
		System.out.println(std2);
		
		
		tx.commit();
		

	}

}
