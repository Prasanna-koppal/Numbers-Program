package square_root;

import java.util.Scanner;

public class Square_root {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number:");
		int n=scan.nextInt();
		int res=(int) Math.sqrt(n);
		System.out.println(res);
		scan.close();
	}

}
