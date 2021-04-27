package assignments;

public class AvrageOfNumberArray {
	
	public static void main(String[] args) {
		int averageOfNumber []={20,30,25,35,-16,60,-100};
		double output=0.0;
		for(int i=0;i<averageOfNumber.length;i++){
			output=output+averageOfNumber[i];
		}
		System.out.println("avreage of number in a array "+output/averageOfNumber.length);
	}
}