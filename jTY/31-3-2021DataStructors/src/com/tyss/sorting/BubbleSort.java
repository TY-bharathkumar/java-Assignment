package com.tyss.sorting;

public class BubbleSort {
	static void bubbleSort(int[] a){
		int temp=0;
		for(int i=0;i<a.length;i++){
			for(int j=1;j<a.length-i;j++){
				if(a[j-1]>a[j]){
					temp=a[j];
					a[j]=a[j-1];
					a[j-1]=temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		int a[]={20,6,97,2,0,6,94,-9};
		System.out.println("unsorted array");
		for(int i:a){
			System.out.print(i+" ");
		}
		System.out.println();
/*		for(int i=0;i<a.length;i++){
			for(int j=1;j<a.length-i;j++){
				int temp=0;
				if(a[j-1]>a[j]){
					temp=a[j];
					a[j]=a[j-1];
					a[j-1]=temp;
				}
			}
		}*/
		bubbleSort(a);
		System.out.println("sorted array");
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
	}
}
