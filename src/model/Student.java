package model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student {
	
	@Id
	@GeneratedValue
	@Column(name="roll")
	private int roll; 
	
	@Column(name="name")
	private String name;
	@Column
	private String course;
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String name, String course) {
		super();
		this.name = name;
		this.course = course;
	}


	public Student(int roll, String name, String course) {
		super();
		this.roll = roll;
		this.name = name;
		this.course = course;
	}
	
	
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	
	
	
	

}
