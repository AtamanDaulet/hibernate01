package h05.manytomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import h04.onetomany.Book04;
import h04.onetomany.Student04;

public class RunnerSave05 {

	public static void main(String[] args) {
		Book05 b1 = new Book05(10, "Math Book");
		Book05 b2 = new Book05(11, "Science Book");
		Book05 b3 = new Book05(12, "Java Book");		
		Book05 b4 = new Book05(13, "Art Book" );	
		
		List<Book05> bookList1 = new ArrayList<Book05>();
		bookList1.add(b1);
		bookList1.add(b2);
		bookList1.add(b4);
		
		List<Book05> bookList2 = new ArrayList<Book05>();
		bookList2.add(b2);
		bookList2.add(b3);
		bookList2.add(b4);
		
		Student05 std1 = new Student05(101, "Daulet", 10, bookList1);
		Student05 std2 = new Student05(102, "Darren", 11, bookList2);
		
		List<Student05> studentList = new ArrayList<Student05>();
		studentList.add(std1);
		b1.setStudent(studentList);
		
		List<Student05> studentList2 = new ArrayList<Student05>();
		studentList2.add(std1);
		studentList2.add(std2);
		b2.setStudent(studentList2);
		
		List<Student05> studentList3 = new ArrayList<Student05>();
		studentList3.add(std2);
		b3.setStudent(studentList3);
		
		List<Student05> studentList4 = new ArrayList<Student05>();
		studentList4.add(std1);
		studentList4.add(std2);
		b4.setStudent(studentList4);
		
		System.out.println(std1);
		System.out.println(std2);
		
						
		Configuration con = new Configuration().configure("hibernate.cfg.xml").
				addAnnotatedClass(Book05.class).
				addAnnotatedClass(Student05.class);
		
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();		
		
		Transaction tx = session.beginTransaction();		
		
		session.save(b1);
		session.save(b2);
		session.save(b3);
		session.save(b4);

		session.save(std1);
		session.save(std2);
		
		tx.commit();

		
		
	}

}
