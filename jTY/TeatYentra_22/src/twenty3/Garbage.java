package twenty3;

public class Garbage {
	
		public static void main(String[] args) {
			Garbage g=new Garbage();
			Garbage g1=new Garbage();
			g=null;
			g1=null;
			System.gc();
			System.out.println(g);
			
		}
		

protected void finalize(){
	System.out.println("trinh");
}
}