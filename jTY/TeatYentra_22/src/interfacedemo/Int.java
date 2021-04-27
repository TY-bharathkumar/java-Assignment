package interfacedemo;

public interface Int {
	void show();
}

class LambdaDem{
	public static void main(String[] args) {
		Int i=()->{
				System.out.println("hi...");
			};
		
	}
}
