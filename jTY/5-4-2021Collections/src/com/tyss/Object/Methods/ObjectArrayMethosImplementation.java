package com.tyss.Object.Methods;

import java.util.Iterator;

public class ObjectArrayMethosImplementation {
	public static void main(String[] args) {
		MyArrayList itr=new MyArrayList();
		MyArrayList.add("vhkl");
		MyArrayList.add(25);
		MyArrayList.add("horror");
		MyArrayList.add(10);
		MyArrayList.add("science fiction");
		MyArrayList.add(10);
		MyArrayList.add("thriller");
		MyArrayList.add("bharathkumar");
		MyArrayList.add('b');
		MyArrayList.add('d');
		MyArrayList.add('l');
		MyArrayList.add('l');
		MyArrayList.add('l');
		MyArrayList.add('l');
		MyArrayList.add('l');
		MyArrayList.add('l');
		



		System.out.println();
		System.out.println("size of an array is "+MyArrayList.size());
		System.out.println();
		for (int i = 0; i <MyArrayList.size() ; i++) {

			System.out.print(MyArrayList.get(i)+" ");


		}
		/*MyObjectArrayMethos.remove(8);
		MyObjectArrayMethos.remove(7);
		MyObjectArrayMethos.remove(6);
		MyObjectArrayMethos.remove(5);
		MyObjectArrayMethos.remove(4);
		MyObjectArrayMethos.remove(3);*/
		MyArrayList.remove(2);
		MyArrayList.remove(1);

		System.out.println();
		System.out.println("size of the array is "+MyArrayList.size());
		System.out.println();

		for (int i = 0; i < MyArrayList.size(); i++) {

			System.out.print(MyArrayList.get(i)+" ");

		}

		System.out.println();
		System.out.println("using for each loop \n");
		for (Object integer : itr) {
			System.out.print(integer+" ");
		}
		System.out.println("\n");
		System.out.println("using iterator \n");
		Iterator i=itr.iterator();
		while(i.hasNext()){
			System.out.println(i.next());
		}

	}
}
