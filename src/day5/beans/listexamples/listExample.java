package day5.beans.listexamples;

import java.util.List;

public class listExample {
	public static void displayStudentsList(List<Student> listOfStudents)
	{
		//display foreach loop
		for( Student student:listOfStudents)
		{
			System.out.println(student);
		}
	}
	public static void displayStudentsBetweenAge(List<Student> listOfStudents,int startAge,int endAge)

	{
		for(Student student:listOfStudents)
		{
			if(student.getAge()>startAge && student.getAge()<endAge)
				System.out.println(student);
		}
		
	}
	public static void displayStudentsFromCity(List<Student> listOfStudents,String cityOfBirth)
	{
		for(Student student:listOfStudents)
		{
			if(student.getCityOfBirth().equalsIgnoreCase(cityOfBirth))
			{
				System.out.println(student);
			}
		}
		
	}
	}

}
