package assignments;

public class StaticNestedClass {//main class
	static int number1=30;
	static int number2=89;
	static class InnerClass{//inner static class
		void staticInnerMethod(){
			System.out.println("inner class manipulation of two number is given as "+number1*number2);
		}
		public static void main(String[] args) {
			StaticNestedClass.InnerClass staticnested=new StaticNestedClass.InnerClass();
			staticnested.staticInnerMethod();	
		}
	}//inner static class ends
}//outer  class ends
