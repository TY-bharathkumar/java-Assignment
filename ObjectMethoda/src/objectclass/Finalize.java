package objectclass;
//code to demonstrate the finalize() menthod
//signature:: protected void finalize throws Throwable{}
public class Finalize {
	protected void finalize()throws Throwable{
		try{
			System.out.println("inside throwable finalize() ");
		} catch (Throwable e){
			throw e;
		}
		finally
		{
			System.out.println("calling finalize method "+ " of the object class");
			super.finalize();
		}
	}
	public static void main(String[] args) throws Throwable {
		Finalize d=new Finalize();// crating a object of class
		//calling a finalize of class with reference variablae
		d.finalize();
	}
}
