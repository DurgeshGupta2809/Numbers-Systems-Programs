package ProgrammingClass;

import java.util.Scanner;

public class NthPower {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a Number : ");
	int pow=sc.nextInt();
		int n=5;
		int mul=1;
		
		for(int i=1; i<=pow; i++) {
			
			mul = mul*n;
		}
		System.out.println("Nth Power is : "+mul);
			
		

	}

}
