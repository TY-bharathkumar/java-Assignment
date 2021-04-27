package objectclass;
import java.lang.Cloneable;
//signature  public Object clone() throws CloneNotSupportedException
public class CloneingObjects implements Cloneable{
	int Studentid;
	String Studentname;

	public CloneingObjects(int studentid, String studentname) {
		super();
		this.Studentid = studentid;
		this.Studentname = studentname;
	}
	/*public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}*/
	public static void main(String[] args) {
		try{
			CloneingObjects real=new CloneingObjects(1456, "Bharathkumar");
			CloneingObjects clone1=(CloneingObjects)real.clone();
			System.out.println("Student has student id "+real.Studentid+"  Student name "+real.Studentname);
			System.out.println("cloned student details are "+clone1.Studentid+"  clones name is "+clone1.Studentname);
		}catch(CloneNotSupportedException e){
			e.printStackTrace();
		}
	}
}
