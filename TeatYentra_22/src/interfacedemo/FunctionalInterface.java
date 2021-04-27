package interfacedemo;

public interface FunctionalInterface {
	void abstractMethod(int x);
	default void normalMethod(){
		System.out.println("Hello");
	}
	class Normal{
		public static void main(String[] args) {
			FunctionalInterface fi=(int x)->{

				System.out.println("the multipilication is "+2*x);
			};
			fi.abstractMethod(20);
		}
	}
}
