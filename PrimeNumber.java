package ProgrammingClass;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Number : ");
		int n=sc.nextInt();
		
		boolean isprime=true;
		
		for(int i=2; i<=n/2; i++) {
			
			if(n%i==0) {
				isprime = false;
				break;
			}
		}
		if(isprime) {
			System.out.println(n+" is Prime Number");
		}
		else {
			System.out.println(n+" is Not Prime Number");
		}

	}

}
