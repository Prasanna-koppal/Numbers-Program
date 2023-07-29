package cube_root;

import java.util.Scanner;

public class Cube_root {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number:");
		int n=scan.nextInt();
		int res=(int) Math.cbrt(n);
		System.out.println(res);
		scan.close();
	}

}
