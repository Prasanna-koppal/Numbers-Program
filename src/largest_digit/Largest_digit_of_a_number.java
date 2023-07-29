package largest_digit;

import java.util.Scanner;

public class Largest_digit_of_a_number {
	public static void main(String []args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number");
	    int n = scan.nextInt();
	    largest_digit num=new largest_digit();
	    num.largest_num(n);
	    scan.close();
	}

}
