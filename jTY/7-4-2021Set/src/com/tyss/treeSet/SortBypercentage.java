package com.tyss.treeSet;

import java.util.Comparator;

public class SortBypercentage implements Comparator<StudentDemoTree>{

	@Override
	public int compare(StudentDemoTree o1, StudentDemoTree o2) {

		return o1.per-o2.per;
	}

}
