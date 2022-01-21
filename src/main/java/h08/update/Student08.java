package h08.update;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
public class Student08 {
	@Id
	private int std_id;
	private String name;
	private int grade;
		
	public Student08() {
		super();
	}

	public Student08(int std_id, String name, int grade) {
		super();
		this.std_id = std_id;
		this.name = name;
		this.grade = grade;
	}

	public int getStd_id() {
		return std_id;
	}

	public void setStd_id(int std_id) {
		this.std_id = std_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Student08 [std_id=" + std_id + ", name=" + name + ", grade=" + grade + "]";
	}


	
	
	
}
