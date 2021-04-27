package objectclass;

import java.util.GregorianCalendar;
/*The java.lang.Object.getClass() method returns the runtime 
class of an object. That Class object is the object that
is locked by static synchronized methods of the represented class.*/
public class GetClass {
	// signature public final Class getClass()
	public static void main(String[] args) {

		//create a new object demo object
		GregorianCalendar g=new GregorianCalendar();
		Object o=new Object();
		//System.out.println(" "+o.);

		System.out.println(" "+g.getTime());// print current time

		System.out.println(" "+g.getClass());// prints the class of reference varibale


		Integer i = new Integer(5); // create a new object of integer

		System.out.println(" "+i);// it will print the object valus


		System.out.println(" "+i.getClass());


	}
}
