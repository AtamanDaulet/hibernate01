package h01.annotations;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class RunnerFetch01 {

	public static void main(String[] args) {
		Students01 st1 = new Students01();
		
		Configuration con = new Configuration().
				configure("hibernate.cfg.xml").
				addAnnotatedClass(Students01.class);
		SessionFactory sf = con.buildSessionFactory();

		Session session = sf.openSession();		
	      
        session.beginTransaction();
        
        st1 = session.get(Students01.class, 101);
        System.out.println(st1.getId()+" "+ st1.getName());	
        
    /*
        List<Students01> studentsList = session.
        		createQuery("FROM students_table", Students01.class).list();

		for (Students01 student : studentsList) {
			System.out.println(student.getId()+" "+ student.getName());
		}*/
			
			
			
			session.close();
	}

}
