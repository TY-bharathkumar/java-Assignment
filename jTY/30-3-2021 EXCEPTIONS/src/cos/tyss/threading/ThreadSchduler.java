package cos.tyss.threading;

public class ThreadSchduler {
	public static void main(String[] args) {


		Bubbles b=new Bubbles();
		Alphabets a=new Alphabets();
		//b.start();
		a.start();
		b.start();

	}
}