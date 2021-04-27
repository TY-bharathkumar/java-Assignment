package c.tyss.runnableinterface;

public class RunnableSolutin {
	public static void main(String[] args) {
		RunnableInterfaceDemo a=new RunnableInterfaceDemo();
		Thread t=new Thread(a);
		
		t.start();
	}
}
