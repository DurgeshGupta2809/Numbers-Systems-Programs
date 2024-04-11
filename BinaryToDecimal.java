package ProgrammingClass;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Number : ");
		int n=sc.nextInt();
		int temp=n;
		long binary=0;
		int i=1;
		
		while(n!=0) {              // other way ()
		
		int	rem=n%10;
			n=n/10;
			binary=binary+rem*i;
			i=2*i;
		}
		System.out.println(temp+" Decimal Value is : "+binary);

	}

}
