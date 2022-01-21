package h04.onetomany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunnerDelete04 {

	public static void main(String[] args) {
		Student04 std = new Student04();
        Book04 book = new Book04();
        
        
        Configuration con = new Configuration().configure("hibernate.cfg.xml").
                addAnnotatedClass(Student04.class).
                addAnnotatedClass(Book04.class);
        
        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();
        
        Transaction tx= session.beginTransaction();
        
        String sqlQuery = "Delete from Book04";
        
       // int numberOfRowDeleted = session.createSQLQuery(sqlQuery).executeUpdate();
        
       // System.out.println("numberOfRowDeleted :" +numberOfRowDeleted);
        
        String sqlQuery2 = "Delete from Student04";
        
       // int numberOfRowDeleted2 = session.createQuery(sqlQuery2).executeUpdate();        
       // System.out.println("numberOfRowDeleted :" +numberOfRowDeleted2);
        
        std = session.get(Student04.class, 102);
        
        session.delete(std);
        
        
        tx.commit();

	}

}
