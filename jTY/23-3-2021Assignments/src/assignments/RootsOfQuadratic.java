package assignments;
import static java.lang.Math.*;
public class RootsOfQuadratic {
	public static void main(String[] args) {
		double root1,root2;
		int a=4,b=1,c=-3;
		root1=((-b+sqrt(b*b-4*a*c))/(2*a));
		root2=((-b-sqrt(b*b-4*a*c))/(2*a));
		System.out.println("root 1 of number is "+root1);
		System.out.println("root 2 of number is "+root2);
	}
}
