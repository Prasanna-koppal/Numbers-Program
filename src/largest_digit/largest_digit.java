package largest_digit;

public class largest_digit {
	public void largest_num(int n) {
		int largest=0;                       // initialize sum zero
		while(n!=0) {                    //loop until is not equal to zero
			int r=n%10; 
			largest = Math.max(r,largest);//Calculate largest using max comparing with 0
			n=n/10;                         
		
		}
		System.out.println(largest);
	}

}
