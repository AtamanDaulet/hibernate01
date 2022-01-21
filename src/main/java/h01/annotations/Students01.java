package h01.annotations;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity(name="students_table") // @Entity annotation is used to make/ convert a class to a table
public class Students01 {
	 /*
     * POJO: Plain Old Java Object
     * private variables
     * constructors  => non prameterized one with params
     * getters and setters
     * toString
     * 
     */
	@Id //when we use id annotation, we make this variable a primary key in our table
	private int id;
	
	@Column(name="students_name") // This will change the name of your variable as a new name in table
	private String name;
	
	//@Transient   //This will skip this column name for Database table
	private int grate;
	public Students01() {
	}
	public Students01(int id, String name, int grate) {
		this.id = id;
		this.name = name;
		this.grate = grate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	@Override
	public String toString() {
		return "Students01 [id=" + id + ", name=" + name + ", grate=" + grate + "]";
	}
	
	
}
