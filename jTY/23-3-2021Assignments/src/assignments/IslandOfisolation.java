package assignments;

public class IslandOfisolation {
	IslandOfisolation reference;
	public static void main(String[] args) {
		IslandOfisolation reference1= new IslandOfisolation ();
		IslandOfisolation reference2= new IslandOfisolation ();
		IslandOfisolation reference3= new IslandOfisolation ();
		IslandOfisolation reference4= new IslandOfisolation ();
		reference1.reference=reference2;
		reference2.reference=reference1;
		reference4.reference=reference3;
		reference3.reference=reference4;
		reference1=null;
		reference2=null;
		reference3=null;
		reference4=null;
		System.gc();
	}
	@Override
	protected void finalize() throws Throwable  
	{  
		System.out.println("Finalize method called");  
	} 
}
