package fibonacci;

import java.util.Scanner;

public class fibonacciApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number");
		int n = scan.nextInt();
		fibonacci fib = new fibonacci();
		fib.fibN(n);
		scan.close();
		
		

	}

}
