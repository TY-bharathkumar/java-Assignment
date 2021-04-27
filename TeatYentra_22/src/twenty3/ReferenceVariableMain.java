package twenty3;
import java.io.*;
 class RefereceVariableDemo {
	int x=10;
	int display(){
		System.out.println("x= "+x);
		return 0;
	}
}
  public class ReferenceVariableMain{
	  public static void main(String[] args) {
		  RefereceVariableDemo D1=new RefereceVariableDemo();//point1
		  System.out.println(D1);//point2
		  System.out.println(D1.display());//point3
		  System.out.println(D1.x);// point4
	}
  }
  
  
  