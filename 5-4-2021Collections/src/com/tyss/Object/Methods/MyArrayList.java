package com.tyss.Object.Methods;

import java.util.Iterator;

public class MyArrayList implements Iterable {
	static Object [] data =new Object[10];
	private static int index_count =0;
	private static int size_count=0;
	public static void add(Object i){
		incrementcapacity(); 
		data[index_count]=i;
		index_count++;
		size_count++;
	}

/*	static void incrementcapacity(){
		if(index_count>=data.length){
			grow(data,new Object[capacity()]);
		}
	}
	private static void grow(Object[] array, Object[] array1) {

		System.arraycopy(array, 0, array1, 0, array.length);
		data=array1;
	}
	static int capacity(){
		return data.length+(data.length>>1);*/
	//}
	static void incrementcapacity(){
		Object temp[]=new Object[data.length+(data.length>>1)];
		for(int i=0;i<data.length;i++){
			temp[i]=data[i];
		}
		data=temp;
	}
	static void remove(int i){
		System.arraycopy(data, i+1, data, i, data.length-i-1);
		size_count--;
	}

	static Object  get(int i){
		return data[i];
	}

	static int size(){
		return size_count;
	}
	class Itr implements Iterator{

		private int index;
		@Override
		public boolean hasNext() {
			return (index<size_count)?true:false;
		}

		@Override
		public Object next() {
			Object o=data[index];
			index++;
			return o;
		}
	}
	@Override
	public Iterator iterator() {
		return new Itr();
	}
}