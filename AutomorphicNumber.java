package ProgrammingClass;
                           // Automorphic Numbers
import java.util.Scanner;

public class AutomorphicNumber {

	public static void main(String[] args) {
	
//		Scanner sc=new Scanner(System.in);
//		System.out.print("Enter Any Number : ");
//		int n=sc.nextInt();
//		int digit=0;
//		int mod=10;
//		int square= n*n;
//		
//		while(digit<n) {
//			
//			digit= square%mod;
//			mod=mod*10;
//		}
//		if(digit==n) {
//			System.out.println(n+" is Automorphic Number");
//		}
//		else {
//			System.out.println(n+" is Not Automorphic Number");
//		}
//		sc.close();
		
		// second logic
//		public static void check() {
//			
//		}
		int n=625;
		int square=n*n;
		int temp=n;
		int d=1;
		
		while(n>0) {
			d=d*10;
			n=n/10;
		}
		int last=square%d;
		
	if(last==temp) {
         System.out.println(temp+" is Automorphic Number");
	}
	else {
		System.out.println(temp+" is Not Automorphic Number");
	}
  }
}
