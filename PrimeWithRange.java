package ProgrammingClass;

import java.util.Scanner;

public class PrimeWithRange {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
			System.out.println("Enter Min Number : ");
			int min=sc.nextInt();
			System.out.println("Enter Max Number : ");
			int max=sc.nextInt();
			
			boolean isprime=true;
			
		for(int j=min; j<=max; j++) {
			for(int i=2; i<j; i++) {
				
				if(j%i==0) {
					isprime = false;
					break;
				}
			}
			if(isprime==true) {
				System.out.print(j+" ");
	    	}
			isprime=true;
		}
		System.out.print("All Numbers is Prime Numbers.");
	 }
}

