package h04.onetomany;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunnerFetch04 {

	public static void main(String[] args) {
		Student04 std1 = new Student04();
		
		Book04 b1 = new Book04();
		
		Configuration con = new Configuration().configure("hibernate.cfg.xml").
				addAnnotatedClass(Book04.class).
				addAnnotatedClass(Student04.class);	
		
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		
		Transaction tx = session.beginTransaction();
		/*		
		std1 = session.get(Student04.class, 101);
		
		b1 = session.get(Book04.class, 12);
		
		*/
		/*
		tx.commit();
		
		List<Book04> bookList = std1.getBookList();
		for(Book04 eachbook : bookList) {
			System.out.println(eachbook);
		}
*/
		//get the student name, student id, and book name from common records
		
		
		String sqlQuery1 = "Select s.name, s.std_id, b.book_name "+
				"FROM Student04 s "+
				"inner JOIN Book04 b "+
				"ON s.std_id = b.std_id";
		
		List<Object[]> sqlList1 = session.createSQLQuery(sqlQuery1).getResultList();
				
//      for(Object[] each : sqlList1) {
//      System.out.println(Arrays.toString(object));
	//      for(Object eachO:each ) {
	//          System.out.println(eachO);
	//      }
//      
//  }
		
		  String hqlQuery = "Select s.name, s.std_id, b.book_name "
	                + "FROM Student04 s "
	                + "INNER JOIN Book04 b "
	                + "ON s.std_id = b.student";
	        
	        List<Object[] > hqlList1= session.createQuery(hqlQuery).getResultList();
	        
	        for(Object[] each : hqlList1) {
	            
	            System.out.println(Arrays.toString(each));
	            
	        }
	}
}
