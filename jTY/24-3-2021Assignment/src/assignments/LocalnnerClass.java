package assignments;
// Program describing the inner classes access 

public class LocalnnerClass {//begin of outer class
	public void outerMethod(){
		int number=22;
		System.out.println("outer class method implementation"+number);
		class InnerClass{  // begin inner class
			public void innerMethod(){
				System.out.println("innner class method output is "+number);
			}
		}// end of inner class
		InnerClass inner=new InnerClass();
		inner.innerMethod();// innner method invoing
	} //end of inner class


	public static void main(String[] args) {
		LocalnnerClass o=new LocalnnerClass();
		o.outerMethod();//outer method invoking

	}
}
