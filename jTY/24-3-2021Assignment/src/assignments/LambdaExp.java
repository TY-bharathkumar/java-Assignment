package assignments;

interface Methods{
	void zero();
	static int single(int x){
		return x*x;
	}
	static double multiple(double x,double y){
		return x+y;
	}
}
public class LambdaExp {
	public static void main(String[] args) {

		/*Methods l=()->{
			System.out.println("this is the zero method in the interface");
		};*/
		
	/*	Methods l=()->{	
			System.out.println("this is the single parameter output "+Methods.single(5));
		};
		l.zero();*/
		
		Methods l=()->{	
			System.out.println("this is the multipe parameterd output "+Methods.multiple(5.3,25.2));
		};
		l.zero();
	}

}
