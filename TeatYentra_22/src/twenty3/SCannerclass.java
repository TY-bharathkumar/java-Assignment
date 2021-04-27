package twenty3;

import java.util.*;

public class SCannerclass {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter student id ");
		int studentid=s.nextInt();
		System.out.println("enter student name ");
		String Studentname=s.next();
		System.out.println("enter gender ");
		char gender=s.next().charAt(0);
		System.out.println("enter CGPA of the student ");
		double CGPA=s.nextDouble();
		System.out.println("enter student phone number ");
		long phno=s.nextLong();
		s.close();
		System.out.println("student details are");
		System.out.println("student id:"+studentid+"\nstudent name "+Studentname+"nStudent gender "+gender+"\nCGPA of student "+CGPA+"\nPhone number "+phno);
	}
}
