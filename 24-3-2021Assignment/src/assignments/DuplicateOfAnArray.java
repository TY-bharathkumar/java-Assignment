package assignments;
import java.util.Arrays;
public class DuplicateOfAnArray {

	public static void main(String[] args) {
		int[] arr1 = { 26,25,98,64,64};
		int c = 0;
		int[] arr2 = Arrays.copyOf(arr1, 8);
		arr2[6] = 3;
		arr2[7] = 3;
		for (int i = 0; i < arr2.length; i++) {
			for (int j = i + 1; j < arr2.length; j++) {
				if (arr2[i] == arr2[j]) {
					arr2[j] = '@';
					c++;

				}
			}
			if (c > 0 && arr2[i] != '@') {
				System.out.println(arr1[i]);
				c = 0;
			}
		}

	}

}



