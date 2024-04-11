package ProgrammingClass;

import java.util.Scanner;

public class ArmstorngNUmber {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Any Number : ");
		int n=sc.nextInt();
		int count=0;
		int temp1=n;
		int sum=0;
		int temp2=n;
		
		while(n>0) {
			count++;
			n=n/10;
		}		
		while(temp1>0) {
			int digit= temp1%10;
			
			int power=1;
			
			for(int i=1; i<=count; i++) {
				power=power*digit;
			}
			sum=sum+power;
			temp1=temp1/10;
		}
		if(sum==temp2) {
			System.out.println("Armstrong Number");
		}
		else {
			System.out.println("Not Armstrong Number");
		}

	}

}
