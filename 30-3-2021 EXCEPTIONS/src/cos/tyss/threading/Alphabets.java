package cos.tyss.threading;

public class Alphabets extends Thread {
	public void run(){

		for(int i=65;i<=95;i++){
			System.out.println((char)i);
			if(i=='K')
				break;

			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			};
		}
		System.out.println(Thread.currentThread().getName());
	}
}