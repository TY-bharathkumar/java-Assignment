package interfacedemo;
interface U{
	void ko();
	interface K{
		void f();
	}
}
public class Test1 implements U,U.K {

	public void ko() {
		System.out.println("interface 1");

	}
	public static void main(String[] args) {
		U.K  l= new Test1();
		U m=new Test1();
		m.ko();
		l.f();
	}
	@Override
	public void f() {
		System.out.println("interface 2");
	}

}
