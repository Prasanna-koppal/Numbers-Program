package factorial;

public class Calculate_factorial {
	
	public void factN(int n) {
		int fact=1;  //initialize fact to 1
		for(int i=n; i>=1; i--) {  // for loop from n to 1 decrement the loop every time
			fact=fact*i;             // multiplying fact and i store it in fact
		}
		System.out.println(fact);     //display the factorial of a given number
	}

}
