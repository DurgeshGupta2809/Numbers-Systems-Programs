package ProgrammingClass;

import java.util.Scanner;
                  // Divisible by One or Itself 
public class PrimeWithMethod {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Any Number : ");
        int n=sc.nextInt();
        
        if(isprime(n))
        {
        	System.out.println(n+" is Prime Number");
        }
        else
        {
        	System.out.println(n+" is Not Prime Number");
        }
    }
 public static boolean isprime(int num)
    	{
		if(num<=1) {
			
			return false;
		}

		for(int i=2; i<num; i++)
		{
			if(num%i==0)
			{
				return false;
			}
		}
		return true;
	}

}
