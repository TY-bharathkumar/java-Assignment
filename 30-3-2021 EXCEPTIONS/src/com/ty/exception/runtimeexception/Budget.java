package com.ty.exception.runtimeexception;

public class Budget {
	double monthlybudget=6000;
	void expenditure(int exp){
		if(exp>monthlybudget){
			throw new BudgetPlanningException("your monthly budget limit is reached");
		}else {
			monthlybudget=monthlybudget-exp;
			System.out.println("you can save this amount "+monthlybudget);
		}
	}
}