package fibonacci;

public class fibonacci {
	
	public void fibN(int n) {
		int a=0;
		int b=1;
		System.out.print(a+" ");
        System.out.print(b+" ");
        for(int i=0; i<n-2; i++) {
        	int c=a+b;
        	System.out.print(c+" ");
        	a=b;
        	b=c;
        	
        }
	}

}
