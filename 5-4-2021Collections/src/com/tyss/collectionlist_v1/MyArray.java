package com.tyss.collectionlist_v1;

public class MyArray {
	int array []= new int[10];
	int index_value=0;
	void add(int i){
		array[index_value]=i;
		index_value++;
	}
	void remove(int index){
		array[index]=0;
	}
int size(){
	return index_value;
}
	int get(int j){
		return array[j];
	}
	void search(int i){

		for (int j = 0; j < array.length; j++) {
			if(array[j]==i)
				System.out.println( array[j]+" at index "+i );
			else 
				System.out.println("not present");
		}
	}
}
