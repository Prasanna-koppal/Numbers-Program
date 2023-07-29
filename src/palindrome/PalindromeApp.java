package palindrome;

import java.util.Scanner;

public class PalindromeApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number");
		int n=scan.nextInt();
		palindrome num=new palindrome();
		num.palindrome_num(n);
		scan.close();

	}

}
