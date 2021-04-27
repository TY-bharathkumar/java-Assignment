package array;

public class ArrayDemo1 {
	public static void main(String[] args) {
		int [] list =new int[10];
		int []num ={1,2,3};
		int [][] table ={
				{1,2,3},
				{4,5},
				{6,7,8,9}
		};
		System.out.println("length of the list array is "+list.length);
		System.out.println("length of the num is "+num.length);
		System.out.println("length of the table is "+table.length);
		System.out.println("length of the table[0] is "+table[0].length);
		System.out.println("length of the table[1]is "+table[1].length);
		System.out.println("length of the table[2]is "+table[2].length);
		for(int i=0;i<list.length;i++){
			list[i]=i*i;
		}
		for(int j=0;j<list.length;j++)
			System.out.println("list elements are "+list[j]);
	}
}