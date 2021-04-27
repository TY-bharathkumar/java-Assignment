package com.tyss.treeSet;

import java.util.TreeSet;

import com.tyss.Hashset.StudentDemoTree;

public class TreesetDemo {
	/*public TreesetDemo E;*/
	public static void main(String[] args) {
		SortedByName name=new SortedByName();
		//SortBypercentage percentage=new SortBypercentage(name);
		TreeSet<StudentDemoTree> ts=new TreeSet<StudentDemoTree>(name);
		StudentDemoTree student1=new StudentDemoTree(10,"shailu",90.3);
		StudentDemoTree student2=new StudentDemoTree(30,"bablu",20.3);
		StudentDemoTree student3=new StudentDemoTree(45,"guldu",55.4);
		StudentDemoTree student4=new StudentDemoTree(60,"ammulu",39.3);
		StudentDemoTree student5=new StudentDemoTree(65,"ralu",23.7);
		StudentDemoTree student6=new StudentDemoTree(65,"ralu",28.9);
		ts.add(student1);
		ts.add(student2);
		ts.add(student3);
		ts.add(student4);
		ts.add(student5);
		ts.add(student6);
		
			System.out.println(ts);
	}
}
