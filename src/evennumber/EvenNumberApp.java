package evennumber;

import java.util.Scanner;

public class EvenNumberApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);  
		EvenNumber obj=new EvenNumber(); //create object for even number
		System.out.println("Enter Number");  //take user input for n
		int n=scan.nextInt();                  //store user input in n
		obj.EvenNum(n);		                //calling the object 
		scan.close();                       //close scanner class

	}

}
