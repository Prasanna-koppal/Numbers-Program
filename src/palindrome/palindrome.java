package palindrome;

public class palindrome {
	public void palindrome_num(int n) {
		int temp=n;   //assign n value to temp
        int sum=0;    //Initialize sum to zero
        while(n>0){    //loop until n is greater than zero
        int r=n%10;  //getting remainder  
         sum=(sum*10)+r;     //Multiply sum with 10 and add reminder assign value to sum 
        n=n/10;            //divide by 10 to get quotient
        }    
        if(temp==sum)    
         System.out.println("palindrome number ");    
        else    
         System.out.println("not palindrome");    
	}

}
