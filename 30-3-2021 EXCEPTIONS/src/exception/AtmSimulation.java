package exception;

import customexcption.InsufficientBalenceException;

public class AtmSimulation {
	double balance=10000;
	void withdraw(double amount) throws InsufficientBalenceException{
		if(amount>balance){
			throw new InsufficientBalenceException("amount is not greater then your A/C balance");
		}else if (amount<=0){
			throw new InsufficientBalenceException("invalid amount enter proper input");
		}else {
			balance=balance-amount;
			System.out.println("your balance is "+balance);
		}

	}

}
