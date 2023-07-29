package sum_of_digit;

public class Sum_digit {
	public void sum_of_digits(int n) {
	int sum=0;                       // initialize sum zero
	while(n!=0) {                    //loop until is not equal to zero
		int digit=n%10;               //Calculate digit by dividing in by 10
		n=n/10;                        //remove digit
		sum+=digit;                     // add to sum
	}
	System.out.println(sum);
	
}
}

