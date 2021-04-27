package com.array.Methods.manipulation;

public class Myarray {
	int array[]=new int[10];
	int index_count=0;
	int size=0;
	void add(int i){
		array[index_count]=i;
		index_count++;  // index value incremented
		size++;         // size variable incremented
	}
	void remove(int i){
		array[i]=0;     // assigning index of array =0;
		size--;         // decreasing the size count of an array
	}
	int get(int i){       // getting the output from the method
		return array[i];
	}
	int size(){           // current size of the array
		return size;
	}
	void  search(int x){
		for (int j = 0; j < array.length; j++) {
			if(array[j]==x)
				System.out.println("the value is present in index"+j);
			break;
		}
		System.out.println("not present in the arrray");
	}
}
