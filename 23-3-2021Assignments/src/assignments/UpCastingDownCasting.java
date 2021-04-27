package assignments;
class Father{
	Father(){
		System.out.println("only Father super can be accessed");
	}
}
class Son extends Father{
	public static void son() {
		System.out.println(" son super can be accessed");
	}
}
class Daughter extends Father{
	public static void daughter(){
		System.out.println(" Daughter super can be accessed");
	}
}

public class UpCastingDownCasting {
	public static void main(String[] args) {
		System.out.println("upcasted");
		Father f=new Son();

		System.out.println("downcasted to son");
		Son s=(Son) f;
		s.son();


		System.out.println();

		System.out.println("upcasted");
		Father f1=new Daughter();
		System.out.println("downcasted to daughter");
		Daughter d=(Daughter) f1;
		d.daughter();

	}
}
