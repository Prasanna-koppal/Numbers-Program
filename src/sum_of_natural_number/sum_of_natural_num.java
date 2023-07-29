package sum_of_natural_number;

public class sum_of_natural_num {
public void natural_num(int n) {
	//logic for sum of 1 to n natural number
	int count=0;        // initialize count to 0
	for(int i=1; i<=n; i++) {       //for loop from 1 to n
		count=count+i;                // add the count and  i value and store it in count variable
	}
	System.out.println(count);
}
}
