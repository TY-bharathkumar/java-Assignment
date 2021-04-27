package assignments;


class multi
{
	static String  name="Bharath Kumar";
	public static void test()
	{
		System.out.println("this is super class");
	}
}
class mul extends multi
{
	static int secondlevel=9;
	public static void test1()
	{
		System.out.println("this is second  class");
	}
}

class multil extends mul
{
	static double thiredlevel=5.5;
	public static void test2()
	{
		System.out.println("this is third class");
	}
}

public class MultilevelInheritance {

	public static void main(String[] args) {
		multil s1 = new multil();
		System.out.println(multil.name);
		multil.test();
		System.out.println(multil.secondlevel);
		multil.test1();
		System.out.println(multil.thiredlevel);
		multil.test2();




	}
}
