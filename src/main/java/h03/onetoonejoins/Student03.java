package h03.onetoonejoins;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity(name="students03_table")
public class Student03 {
	@Id 
	private int student_id;	
	@Column(name="student_name")
	private String name;
	private int grate;
	@OneToOne(mappedBy = "student03")
	private Dairy dairy;
	
	public Student03() {
	}

	public Student03(int student_id, String name, int grate, Dairy dairy) {
		super();
		this.student_id = student_id;
		this.name = name;
		this.grate = grate;
		this.dairy = dairy;
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

	public Dairy getDairy() {
		return dairy;
	}

	public void setDairy(Dairy dairy) {
		this.dairy = dairy;
	}

	@Override
	public String toString() {
		return "Student03 [student_id=" + student_id + ", name=" + name + ", grate=" + grate + ", dairy=" + dairy + "]";
	}

	
	
	
}
