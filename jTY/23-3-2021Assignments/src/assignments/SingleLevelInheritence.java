package assignments;



class SuperClass{
	public void superMethod(){
		System.out.println("this is super class method implentation ");
	}
}
class Single extends SuperClass{
	public void singleMethod(){
		System.out.println("single level inheritence");
	}
}
public class SingleLevelInheritence {
	public static void main(String[] args) {
		Single s=new Single();
		s.singleMethod();

	}
}
