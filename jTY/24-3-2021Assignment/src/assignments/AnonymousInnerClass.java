package assignments;

abstract class Anonumus{//abstract class decaration
	public abstract void myMethod();
}
public class AnonymousInnerClass {//main method
	public static void main(String[] args) {
		Anonumus inner =new Anonumus(){//decaration and intilization of Anonymous innner class
			public void myMethod(){
				System.out.println("this is ananoymus implementation of class");
			}
		};
		inner.myMethod();
	}
}
