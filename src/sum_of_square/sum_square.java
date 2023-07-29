package sum_of_square;

public class sum_square {
	public void sum_of_Square(int n) {
		int sum=0;                        //initialize sum to zero
		for(int i=1; i<=n; i++) {            //loop from 1 t n
			sum=(i*i)+sum;	                  //Multiply i and i add with sum and store it in sum
		}
		System.out.println(sum);
		
	}

}
