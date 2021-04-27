 package cos.tyss.threading;

public class Multithreding {
	public static void main(String[] args) {
		//System.out.println(Thread.currentThread().getName());	
		for(int i=1;i<=10;i++){
			System.out.println(i);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		for(int j=65;j<=90;j++){
			System.out.println((char)j);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
