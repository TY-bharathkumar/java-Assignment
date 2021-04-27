package exception;

import customexcption.InsufficientBalenceException;

public class Atm {
	public static void main(String[] args) throws InsufficientBalenceException {


		AtmSimulation a=new AtmSimulation();
		a.withdraw(100);
	}
}
