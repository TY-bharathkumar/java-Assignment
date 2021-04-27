package of.tydd.error;

public class ErrorDemo {
public static void main(String[] args) {
	count(5);
	
}
static void count(int i){
	if(i==0){
		System.out.println("zero");
	}
	else
	{
		count(i++);
	}
}
}
