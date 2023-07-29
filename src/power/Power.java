package power;

import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("enter number");
		int a=scan.nextInt();
        System.out.println("Enter exponent");
        powerN pow =new powerN();
        int n=scan.nextInt();
        pow.power_n(a, n);
		scan.close();

	}

}
