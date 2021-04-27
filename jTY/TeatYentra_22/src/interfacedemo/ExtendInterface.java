package interfacedemo;

interface Int1  {
	void m1();
}
interface Int2 extends Int1{
	void m2();
}
public class ExtendInterface implements Int2{
	@Override
	public void m1() {
		System.out.println("method 1");

	}

	@Override
	public void m2() {
		System.out.println("method 2");

	}
	public static void main(String[] args) {

		Int2 obj=new ExtendInterface();
		obj.m2();
		obj.m1();
	}

}
