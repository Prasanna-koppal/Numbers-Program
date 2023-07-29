package primenumber;

import java.util.Scanner;

public class primenumberApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number");
	    int n = scan.nextInt();
	    primenum pn=new primenum();
	    pn.prime_number(n);
        scan.close();
	}

}
