package sum_of_natural_number;

import java.util.Scanner;

public class Natural_numberApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Number");
		int n=scan.nextInt();
		sum_of_natural_num nm=new sum_of_natural_num();
        nm.natural_num(n);
        scan.close();
	}

}
