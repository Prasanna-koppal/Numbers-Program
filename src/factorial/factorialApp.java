package factorial;

import java.util.Scanner;

public class factorialApp {

	public static void main(String[] args) {
	   Scanner scan = new Scanner(System.in);
       System.out.println("Enter number");
       int n = scan.nextInt();
       Calculate_factorial fact = new Calculate_factorial(); //create object to calculate factorial of a given number
       fact.factN(n);                                         
       scan.close();
	}

}
