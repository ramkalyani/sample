package day5.beans;

public class Student {
	private int rollNumber;
	private String studentName;
	private String course;
	private int age;
	private String cityOfBirth;
	public Student()
	{
		
	}
	public Student(int rollNumber, String studentName, String course, int age, String cityOfBirth) {
		super();
		this.rollNumber = rollNumber;
		this.studentName = studentName;
		this.course = course;
		this.age = age;
		this.cityOfBirth = cityOfBirth;
	}
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCityOfBirth() {
		return cityOfBirth;
	}
	public void setCityOfBirth(String cityOfBirth) {
		this.cityOfBirth = cityOfBirth;
	}
	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", studentName=" + studentName + ", course=" + course + ", age="
				+ age + ", cityOfBirth=" + cityOfBirth + "]";
	}
	

}
