package model;

public class Student {
	
	private int id;
	private String name;
	private int age;
	private String course;
	private String email;
	
	public Student() {
		// TODO Auto-generated constructor stub
		
	}
	
	public Student(int id) {
		this.id=id;
	}
	
	public Student(int id,String name) {
		this(id);
		this.name=name;
	}
	
	public Student(int id,String name,int age) {
		this(id,name);
		this.age=age;
	}
	public Student(int id,String name,int age,String course) {
		this(id,name,age);
		this.course=course;
	}
	public Student(int id,String name,int age,String course,String email) {
		this(id,name,age,course);
		this.email=email;
	}
	

	
	void setstudent(int id,String name,int age,String course,String email) {
		this.id=id;
		this.name=name;
		this.age=age;
		this.course=course;
		this.email=email;
		
	}
	
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	public String getCourse() {
		return course;
	}
	public String getEmail() {
		return email;
	}

}
