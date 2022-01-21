package h02.embeddables;

import javax.persistence.Embeddable;

@Embeddable
public class Courses {	
	private String selective;
	private String mendatory;
	public Courses() {
	}
	public Courses(String selective, String mendatory) {
		this.selective = selective;
		this.mendatory = mendatory;
	}
	public String getSelective() {
		return selective;
	}
	public void setSelective(String selective) {
		this.selective = selective;
	}
	public String getMendatory() {
		return mendatory;
	}
	public void setMendatory(String mendatory) {
		this.mendatory = mendatory;
	}
	@Override
	public String toString() {
		return "Courses [selective=" + selective + ", mendatory=" + mendatory + "]";
	}
	
}
