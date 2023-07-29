package sum_of_square;

import java.util.Scanner;

public class squareApp {
	public static void main(String []args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number:");
		int n=scan.nextInt();
		sum_square sq=new sum_square();
		sq.sum_of_Square(n);
		scan.close();
	}

}
