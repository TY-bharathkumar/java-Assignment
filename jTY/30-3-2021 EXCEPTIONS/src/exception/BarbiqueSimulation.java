package exception;

public class BarbiqueSimulation {
	int foodentry=1000;
	void tipAmount(int bill) throws BarbiqueException{
		if(bill>foodentry){
			String message="have to pay extra";
			BarbiqueException a=new BarbiqueException(message);
			throw a;
		} else if(bill<foodentry){
			throw new BarbiqueException("your bill is less then entry card");
		}
		{
			System.out.println("thank you ...!!! ");
		}
	}
}
