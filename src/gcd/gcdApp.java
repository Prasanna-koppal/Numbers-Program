package gcd;

import java.util.Scanner;

public class gcdApp {
  //GCD=Greatest Common Divisor or HCF=Highest Common Factor
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter First Number");
		int a=scan.nextInt();
		System.out.println("Enter Second Number");
		int b=scan.nextInt();
		GCD gd=new GCD();
		gd.gcd(a, b);
		scan.close();
		

	}

}
