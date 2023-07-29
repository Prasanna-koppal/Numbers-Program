package gcd;

public class GCD {
	
	public void gcd(int a, int b) {
		int gcd=0;                        //create gcd variable and initialize to zero
		for(int i=1; i<=a && i<=b; i++) {  // create for loop from 1 to number less than first number and less than second number
			if(a%i==0 && b%i==0) {         // condition if number is completely divisble by firstnumber and second number(factors)
		    gcd=i;                         //if condition is true initialize to gcd
			}
		}
		System.out.println("GCD of "+a+" and "+b+" is "+gcd);
	}

}
