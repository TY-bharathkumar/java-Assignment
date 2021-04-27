package com.tyss.treeSet;

import java.util.Comparator;

public class SortedByName implements Comparator<StudentDemoTree> {

	@Override
	public int compare(StudentDemoTree o1, StudentDemoTree o2) {
		
		return o1.student_name.compareTo(o2.student_name);
	}

	

}
