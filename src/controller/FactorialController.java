package controller;

public class FactorialController {
	
	public FactorialController() {
		super();
	}
	
	public int factorial(int n) {
		if(n == 1) 
			return 1;
		else
			return n * factorial(n - 2);
	}
	
	public boolean validate(int n) {
		if(n <= 0 || n % 2 == 0)
			return false;
		else
			return true;
	}
}
