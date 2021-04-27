package array;

public class ArrayDemo {
	public static void main(String[] args) {
		int number []={1,2,3,4,5,6,7,8,9,10};
		for(int i:number){
			System.out.println(i);
		}
		for(int i:number){
			System.out.print(i+" ");
		}
		int  sum=0;
		for(int j=0;j<number.length;j++){
			sum=sum+number[j];
		}
		System.out.println("the sum of element of array "+sum);
		int average=0;
		for(int i=0;i<number.length;i++){
			average+=number[i];
		}
		System.out.println("the average of array is "+average/number.length);
	}
}
