package ProgrammingClass;

public class Power {
	
	public static void check(int n) {
		
		while(n>0) {
			int pow=1;
		    int last=n%10;
		    
		   for(int i=1; i<=last; i++) {
			  
			   pow=pow*last;
			}
		   System.out.println(last+" Power of Digit : "+pow);
		   n=n/10;
		}
		
	}

	public static void main(String[] args) {
		 check(549);
   }
}