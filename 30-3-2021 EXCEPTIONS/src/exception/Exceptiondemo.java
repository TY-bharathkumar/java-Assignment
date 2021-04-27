package exception;

public class Exceptiondemo {
	public static void main(String[] args) {
		System.out.println(" exception try and catch block");
		try{
			System.out.println(10/0);
		}
		catch(ArithmeticException  e){
			System.out.println(e.getMessage());
			System.out.println(e);
		}
		System.out.println("this is an null pointer exception");
		try{
			Object o = null;
			o.hashCode();
		} catch(NullPointerException l){
			//l.printStackTrace();
			System.out.println(l);
		}
		System.out.println("example for ArrayIndexOutOfBoundsExeption k :");
		int a[]={1,2,3,9};
		try{
			System.out.println(a[-10]);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e);
		}

		System.out.println("example for string index out of bounds exception");
		String s="String";
		for(int i=0;i<s.length();i++){
			System.out.println(s.charAt(i));
		}
		try{
			System.out.println(s.charAt(-1));
		}
		catch(StringIndexOutOfBoundsException e){
			System.out.println(e);
		}

	}

}
