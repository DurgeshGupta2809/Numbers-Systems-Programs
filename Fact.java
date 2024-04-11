package ProgrammingClass;

public class Fact {

	public static void main(String[] args) {
		// factorial
//		int n=3;
//		int factorial=1;
//		
//		for(int i=1; i<=n; i++) {
//			factorial=factorial*i;
//		}
//
//		System.out.println(factorial);
		
		
		// factor
//		int n=12;
//		
//		for(int i=1; i<=n; i++) {
//			
//			if(n%i==0) {
//				System.out.print(i+"  ");
//			}
//		}
		
		
		// Product
//		int n=6;
//		int prod=1;
//		for(int i=1; i<=n; i++) {
//			
//			if(n%i==0) {
//				prod=prod*i;
//			}
//		}
//		System.out.println(prod);
		
		
		
		// Reverse
//		int n=12345;
//		int rev=0;
//		while(n>0) {
//	  int digit=n%10;
//			rev=rev*10+digit;
//			n=n/10;
//		}
//		System.out.println(rev);
		
		
		
		// Palindrome
//		int n=1221;
//		int rev=0;
//		int temp=n;
//		
//		while(n>0) {
//			int digit=n%10;
//			rev=rev*10+digit;
//			n=n/10;
//		}
//		if(rev==temp) {
//			System.out.println("palindorme");
//		}
//		else {
//			System.out.println("Not");
	//	}
		
		
		
		
		// Perfect
//		int n=6;
//		int sum=0;
//		for(int i=1; i<=n/2; i++) {
//			if (n%i==0) {
//				sum=sum+i;
//			}
//		}
//		if(sum==n) {
//			System.out.println("perfect");
//		}
//		else {
//			System.out.println("Not");
//		}
		
		
		
		
		// Fibbonacci
//		int n1=0;
//		int n2=1;
//		System.out.print(n1+" ");
//		System.out.print(n2+" ");
//		
//		for(int i=1; i<=8;i++) {
//			int  n3=n1+n2;
//				System.out.print(n3+" ");
//			n1=n2;
//			n2=n3;
//		}
		
		// Strong 
//		int n=145;
//	    int temp=n;
//		int sum=0;
//		
//		while(n>0) {
//			
//			int digit=n%10;
//			int fact=1;
//			for(int i=1; i<=digit; i++) {
//				fact=fact*i;
//	    	}
//			sum=sum+fact;
//			n=n/10;
//		}
//	  if(temp==sum) {
//		  System.out.println("Strong");
//	  }else {
//		  System.out.println("not");
//	  }
		
		
		
		// Prime
		int n=6;
		boolean p=true;
		for(int i=2; i<=n/2 ;i++){
			
			if(n%i==0) {
				p=false;
				break;
			}
		}
		if(p) {
			System.out.println("prime");
		}else {
			System.out.println("not");
		}
				
		
		
		
		
	}

}
