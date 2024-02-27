package view;

import java.util.Scanner;

import controller.FactorialController;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		FactorialController fc = new FactorialController();
		
		int n = sc.nextInt();
		
		System.out.println(fc.validate(n) ? fc.factorial(n) : "Invalid data");
		
		sc.close();

	}

}
