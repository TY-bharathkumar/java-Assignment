package com.tyss.Hashset;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class StudentHAshset {
	public static void main(String[] args) {
		HashSet<StudentDemoTree> hs=new HashSet<StudentDemoTree>();
		StudentDemoTree student1=new StudentDemoTree(10,"shailu","shailu1234@gmail.com");
		StudentDemoTree student2=new StudentDemoTree(30,"bablu","lovelybablu234@gmail.com");
		StudentDemoTree student3=new StudentDemoTree(45,"guldu","gulugul1234@gmail.com");
		StudentDemoTree student4=new StudentDemoTree(60,"ammulu","ammu1234@gmail.com");
		StudentDemoTree student5=new StudentDemoTree(65,"ralu","raluue5256@gmail.com");
		StudentDemoTree student6=new StudentDemoTree(65,"ralu","raluue5256@gmail.com");
		hs.add(student1);
		hs.add(student2);
		hs.add(student3);
		hs.add(student4);
		hs.add(student5);
		hs.add(student6);
		System.out.println("before sort");
		System.out.println();
		for(StudentDemoTree i:hs){
			System.out.print(i+"\n");
		}
		ArrayList<StudentDemoTree> arrayList=new   ArrayList<StudentDemoTree>(hs);
		Collections.sort(arrayList);
		System.out.println("after sort");
		for(StudentDemoTree i:arrayList){
			System.out.print(i+" \n");
		}
		
	}
}
