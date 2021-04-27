
public class Static {
	static int num;
	static String mystr;
	static {
		num=200;
		mystr="static keyword in java";
	}
	public static void main(String[] args) {
		Static s=new Static();
		s.num=120;
		System.out.println(num);
		s.mystr="number is not the end";
		System.out.println(mystr);
	}
}
