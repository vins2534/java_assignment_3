package assignment3;

import java.util.*;

import assignment3_books.Book;

public class StudentFunctions 
{
	
	ArrayList<Student> student = new ArrayList<>();
	
	Scanner sc = new Scanner(System.in);
	
	public void addStudent()
	{
		System.out.print("Enter number of Students that you want to add: ");
		int noOfStudents = sc.nextInt();
		System.out.println("Enter Student/s: ");
		for(int i = 0; i < noOfStudents; i++)
		{
			System.out.print("Enter PRN: ");
			int prn = sc.nextInt();
			System.out.print("Enter Name: ");
			String name = sc.next();
			System.out.print("Enter DoB: ");
			String dob = sc.next();
			System.out.print("Enter Marks: ");
			double marks = sc.nextDouble();
			Student s = new Student(prn, name, dob, marks);
			student.add(s);
		}
	}
	
	public void printStudentToString()
	{
		System.out.println("-----------Student Details------------");
		String list = student.toString();
		System.out.println(list);
	}
	
	public void printStudentsDetails()
	{
		System.out.println("-----------Student Details------------");
		System.out.println("PRN\t Name\t DoB\t Marks");
		for (int i = 0; i < student.size(); i++)
		{
			printStudent(i);
		}
	}
	
	private void printStudent(int i)
	{
		System.out.println(student.get(i).getPrn() + "\t" + 
				student.get(i).getName() + "\t" + 
				student.get(i).getDob() + "\t" +
				student.get(i).getDob());
	}
	
	public void deleteStudent()
	{
		System.out.print("Enter PRN for deleting the Student Information: ");
		int prn = sc.nextInt();
		System.out.println("PRN\t Name\t DoB\t Marks");
		
		
		for(int i = 0; i < student.size(); i++)
		{
			if(student.get(i).getPrn() == prn)
			{
				student.remove(i);
			}
			else
			{
				System.out.println("Student does not exist");
			}
		}
	}
	
	public void updateStudentPrn()
	{
		System.out.print("Enter PRN for updating the Student Information: ");
		int prn = sc.nextInt();
		//System.out.println("PRN\t Name\t DoB\t Marks");
		
		for(int i = 0; i < student.size(); i++)
		{
			if(student.get(i).getPrn() == prn)
			{
				System.out.print("Enter updated Name: ");
				String name = sc.next();
				System.out.print("Enter updated Dob: ");
				String dob = sc.next();
				System.out.print("Enter updated Marks: ");
				double marks = sc.nextDouble();
				student.get(i).setName(name);
				student.get(i).setDob(dob);
				student.get(i).setMarks(marks);
			}
			else
			{
				System.out.println("Student does not exist");
			}
		}
		
	}

}
