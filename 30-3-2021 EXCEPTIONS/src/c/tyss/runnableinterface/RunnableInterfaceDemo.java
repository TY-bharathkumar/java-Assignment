package c.tyss.runnableinterface;

public class RunnableInterfaceDemo implements Runnable{

	@Override
	public void run() {
		int n=10,x=0;
		while(n!=0){
			++x;
			n=n/10;
		}
		System.out.println("the loop executes for "+x+" this many times");
	}

}
