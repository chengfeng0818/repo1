package stu;

public class student {
	private int id;
	private int sex;
	private int age;
	private int gid;
	
	public student() {
		
	}
	
	public student(int sex, int age, int gid) {
		super();
		this.sex = sex;
		this.age = age;
		this.gid = gid;
	}
	public student(int id, int sex, int age, int gid) {
		super();
		this.id = id;
		this.sex = sex;
		this.age = age;
		this.gid = gid;
	}
	
	
	public int getId() {
		return id; 
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getGid() {
		return gid;
	}
	public void setGid(int gid) {
		this.gid = gid;
	}
	

}
