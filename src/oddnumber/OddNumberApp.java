package oddnumber;

import java.util.Scanner;
public class OddNumberApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		OddNumber obj=new OddNumber();    //create object for odd number
		System.out.println("Enter Number");  
		int n=scan.nextInt();                
		obj.OddNum(n);		              //calling the object
		scan.close();


	}

}
