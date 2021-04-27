package com.tyss.Hashset;

public class StudentDemoTree implements Comparable<StudentDemoTree> {
	int id;
	String student_name;
	double per;
	/*this is constructor is made to accept 
	three fields from  the object of the class*/
	public StudentDemoTree(int id, String student_name, double per) { 
		super();
		this.id = id;
		this.student_name = student_name;
		this.per = per;
	}
/*	this toString() method is used to display the
	elements in the object super class in a specified way*/
	public String toString(){                                    
		return id+" : "+student_name+" : "+per;
	}
	@Override
/*	we are comparing the elements in the
	ojects with the values of object present in the object*/
	public int compareTo(StudentDemoTree o) {

		return this.id-o.id;
	}
/*	hashcode() method we are assigning the hashcode 
	of an object to the present id*/ 
	public int hashCode(){
		return this.id=id;
	}
	/* equals compares the hashcode() generated by the object class 
	 * and the object hashcode() of the present object*/
	@Override
	public boolean equals(Object obj) {

		return this.hashCode()==obj.hashCode();
	}
}