package h03.onetoonejoins;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import h02.embeddables.Student02;

public class RunnerFetch03 {

	public static void main(String[] args) {
		Student03 st01 = new Student03();
		Dairy dairy = new Dairy();

		Configuration con = new Configuration().
				configure("hibernate.cfg.xml").
				addAnnotatedClass(Student03.class).
				addAnnotatedClass(Dairy.class);
		SessionFactory sf = con.buildSessionFactory();		
		Session session = sf.openSession();
		
		Transaction tx = session.beginTransaction();
		/*
		st01 = session.get(Student03.class, 101);
		System.out.println(st01);
		
		dairy = session.get(Dairy.class, 10);
		System.out.println(dairy);
		*/
		/*
		String sqlQuery2 = "Select s.student_name, s.grate, s.student_id, d.dairy "+
				"FROM students03_table s "+
				"right JOIN Dairy d "+
				"ON s.student_id = d.student_id";
		
		List<Object[]> sqlList2 = session.createSQLQuery(sqlQuery2).getResultList();
		
		for (Object[] object : sqlList2) {
			System.out.println(Arrays.toString(object));
		}
		*/
		/*
		String hqlQuery2 = "Select s.name, s.grate, s.student_id, d.dairy "+
		"FROM students03_table s "+
		"inner JOIN Dairy d "+
		"ON s.student_id = d.student03";
		
		List<Object[]> hglList2 = session.createQuery(hqlQuery2).getResultList();
		
		for (Object[] object : hglList2) {
			System.out.println(Arrays.toString(object));
		}
		*/
		
		//Fetch all the records getting name, id, 
		//grade, dairy, we need to use sql query and HQL query
		/*
		String sqlQuery3 = "Select s.student_name, s.grate, d.dairy_id, d.dairy "
		+ "FROM students03_table s "
		+ "full JOIN Dairy d "
		+ "ON s.student_id = d.student_id";
		
		List <Object[]> sqlList3 = session.createSQLQuery(sqlQuery3).getResultList();
		for (Object[] object : sqlList3) {
			System.out.println(Arrays.toString(object));
		}
		*/
		/*
		String hqlQuery3 = "Select s.name, s.grate, d.dairy_id, d.dairy "
				+ "FROM students03_table s "
				+ "full JOIN Dairy d "
				+ "ON s.student_id = d.student03";
				
				List <Object[]> hqlList3 = session.createQuery(hqlQuery3).getResultList();
				for (Object[] object : hqlList3) {
					System.out.println(Arrays.toString(object));
				}
		*/
		//************************************
		/*
		String sqlQuery4 = "Select s.student_id, s.student_name, s.grate, d.dairy_id, d.dairy "
				+ "FROM students03_table s "
				+ "full JOIN Dairy d "
				+ "ON s.student_id = d.student_id";
				
				List <Object[]> sqlList4 = session.createSQLQuery(sqlQuery4).getResultList();
				for (Object[] object : sqlList4) {
					System.out.println(Arrays.toString(object));
				}
		*/		
		/*		
		String hqlQuery4 = "FROM students03_table s "
				+ "full JOIN Dairy d "
				+ "ON s.student_id = d.student03";
				
				List <Object[]> hqlList4 = session.createQuery(hqlQuery4).getResultList();
				for (Object[] object : hqlList4) {
					System.out.println(Arrays.toString(object));
				}
				*/
		tx.commit();		
		
		
		session.close();


	}

}
