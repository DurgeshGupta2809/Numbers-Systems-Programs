package ProgrammingClass;

import java.util.Scanner;

public class ArmstrongWithRange {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Min Number : ");
			int min=sc.nextInt();
	    System.out.println("Enter Max Number : ");
		    int max=sc.nextInt();
			
			int count=0;
			int temp1=min;
			int sum=0;
			int temp2=min;
		for(int j=min; j<=max; j++) {	
			while(j>0) {
				count++;
				min=j;
				j=j/10;
				
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
				System.out.println(sum);
			}
			
		}

	}

}
