package interfacedemo;



interface A{
	void display();
}
interface B extends A{
	void dislay1();
}
public class Test implements A,B{

	@Override
	public void display() {
		System.out.println("diplay one");

	}
	public static void main(String[] args) {
		A a=new Test();
		a.display();
		B b=new Test();
		b.dislay1();
	}
	@Override
	public void dislay1() {
		System.out.println("dispaly two");
		
	}
}