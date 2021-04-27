package assignments;

import java.util.Scanner;

public class ArrayManupualtions {
	public static void main(String[] args) {
		int positivecount=0,negativecount=0,evencount=0,oddcount = 0,zerocount=0;
         int nums[]=new int[10];
		System.out.println("enter 20 elements");
		Scanner s=new Scanner(System.in);
		for(int i=0;i<nums.length;i++){
			nums[i]=s.nextInt();
		}
		System.out.println("enterd elements are");
		for (int j=0;j<nums.length;j++){
			System.out.print(j+" ");
			if(nums[j]>0){
				positivecount++;
			}
			else{
				negativecount++;
			}

			if(nums[j]%2==0){
				evencount++;
			}
			else{
				oddcount++;
			}
			if(nums[j]==0){
				zerocount++;
			}
		}
		System.out.println("++++++++++++++++++");
		System.out.println("number of positive number are "+positivecount);
		System.out.println("number of negative number are  "+negativecount);
		System.out.println("number of positive number are "+evencount);
		System.out.println("number of negative number are  "+oddcount);
		System.out.println("number of zeros are "+zerocount);
	}
}
