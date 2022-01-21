package h02.embeddables;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="students02_table")
	public class Student02 {
	@Id 
	private int student_id;	
	@Column(name="students_name")
	private String name;
	private int grate;
	private Courses courses;
	
	public Student02() {
	}

	public Student02(int student_id, String name, int grate, Courses courses) {
		super();
		this.student_id = student_id;
		this.name = name;
		this.grate = grate;
		this.courses = courses;
	}

	public int getStudent_id() {
		return student_id;
	}

	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGrate() {
		return grate;
	}

	public void setGrate(int grate) {
		this.grate = grate;
	}

	public Courses getCourses() {
		return courses;
	}

	public void setCourses(Courses courses) {
		this.courses = courses;
	}

	@Override
	public String toString() {
		return "Student02 [student_id=" + student_id + ", name=" + name + ", grate=" + grate + ", courses=" + courses
				+ "]";
	}
	
	
}
