package ProgrammingClass;

public class ArmstrongUsingMethod {
	static int n=370;
	static int sum=0;
	static int temp2=n;
	
    public static void check() {
        int count=0;
		int temp1=n;
	
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
	}
	public static void main(String[] args) {
		
		check();    // Method Calling
	
		if(sum==temp2) {
			System.out.println("Armstrong Number");
		}
		else {
			System.out.println("Not Armstrong Number");
		}
	}
}
