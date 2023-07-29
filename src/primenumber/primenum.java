package primenumber;

public class primenum {
	int count=0;                             //initialize count to zero
	public void prime_number(int n) {
		System.out.print("Prime Number:");
		 for(int i=1;i<=n;i++){               //for loop counting from 1 to n
	         int count=0;                       
	         for(int j=2;j<=i;j++){             //for loop counting from 2 to i
	            if(i%j==0){                     //condition if i and j completely divisible 
	               count++;                     //condition  is True increment the count value
	            }
	         }
	         if(count==1)                       //if count is 1
	         System.out.print(i+" ");           //display the value
	      }


}

	}
