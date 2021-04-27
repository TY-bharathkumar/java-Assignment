package assignments;

public class StringConcatDiff {
	public static void main(String[] args) {
		String name1="Bharath";
		String name2="kumar";
		System.out.println(name1+=name2);// returns Bharathkumar
		System.out.println(name1.concat(name2));// returns Bharathkumarkumar
	}// there is no differnce
}
