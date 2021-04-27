package interfacedemo;
import java.util.*;
//demonstration interface inside a class
class TestInterface{
	interface yes{ //inside a class
		void show();
	}
}
class Testing implements TestInterface.yes{
	public void show(){
		System.out.println("show method interface");
	}
}
public class InterfaceDEmo {
	public static void main(String[] args) {
		TestInterface.yes obj;
		Testing t=new Testing();
		obj=t;
		obj.show();
	}//end of main
}//end of class
