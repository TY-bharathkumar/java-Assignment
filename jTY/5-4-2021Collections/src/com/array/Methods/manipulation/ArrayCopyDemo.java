package com.array.Methods.manipulation;

public class ArrayCopyDemo {
	public static void main(String[] args) {
		int a1[]={1,5,6,9,8,6,9,9};
		int a2[]=new int[a1.length];
		/*for(int i=0;i<a1.length;i++){
			a2[i]=a1[i];
		}*/

		System.arraycopy(a1, 0, a2, 5, a1.length-5);
		for(int i:a2){
			System.out.print(i+" ");
		}
		//System.ar
	}
}
