package assignments;

import java.util.Scanner;

public class RemovingAnElement {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr1 = { 25,26,34,69,36 };
		System.out.println("enter deleted number from this array { 25,26,34,69,36 }");
		int key;
		key = scan.nextInt();
		int c = 0;
		int index = 0;

		for (int i = 0; i < arr1.length; i++) {
			if (key == arr1[i]) {
				c++;
				index = i;
			}

		}
		if (c == 1) {
			System.out.println(key + " element deleted ");
			System.out.println("===========================");
			for (int i = 0; i < arr1.length; i++) {
				if (i == index) {
					continue;
				}
				System.out.println(arr1[i]);
			}

		} else {
			System.out.println("element not present");
		}

	}

}

