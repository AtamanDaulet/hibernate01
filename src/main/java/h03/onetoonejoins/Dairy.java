package h03.onetoonejoins;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Dairy {
	@Id
	private int dairy_id;
	private String dairy;
	
	@OneToOne
	@JoinColumn(name = "student_id")
	private Student03 student03;
	
	public Dairy() {
	}

	public Dairy(int dairy_id, String dairy) {
		super();
		this.dairy_id = dairy_id;
		this.dairy = dairy;
	}

	public int getDairy_id() {
		return dairy_id;
	}

	public void setDairy_id(int dairy_id) {
		this.dairy_id = dairy_id;
	}

	public String getDairy() {
		return dairy;
	}

	public void setDairy(String dairy) {
		this.dairy = dairy;
	}

	public Student03 getStudent03() {
		return student03;
	}

	public void setStudent03(Student03 student03) {
		this.student03 = student03;
	}

	@Override
	public String toString() {
		return "Dairy [dairy_id=" + dairy_id + ", dairy=" + dairy + "]";
	}
	
	
	
}
