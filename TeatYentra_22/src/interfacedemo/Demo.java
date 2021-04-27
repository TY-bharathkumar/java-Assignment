package interfacedemo;

import java.util.Date;

interface DateFunction {
	int process();
	static Date now(){
		return new Date();
	}
	default String formatDate(Date date){//concrete methods
		return date.toString();
	}
	default int sum(int a,int b){//concrete menthods
		return a+b;
	}
}

class Demo{
	public static void main(String[] args) {
		DateFunction datefunc =()->77;//lambda expression
		System.out.println(datefunc.process());
		System.out.println(DateFunction.now());
		
	}
}

