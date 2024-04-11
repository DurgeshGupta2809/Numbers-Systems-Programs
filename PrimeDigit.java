package ProgrammingClass;

public class PrimeDigit {

	public static void main(String[] args) {

     int n=23758;
    
      while(n>0) {
    	  boolean isprime=true;
    	int rem=n%10;
    	  for(int i=2; i<=rem/2; i++) {
    		  if(rem%i==0)
    		  isprime=false;
    		  break;
    	  }
    	  n=n/10;
    	  if(isprime) {
    		  System.out.println(rem);
    	  }
       }
      
     }
}
