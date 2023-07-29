package sum_of_digit;

import java.util.Scanner;

public class sum_of_digitApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number");
	    int n = scan.nextInt();
	    Sum_digit digit=new Sum_digit();
	    digit.sum_of_digits(n);
	    scan.close();
	}

}
