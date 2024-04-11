package ProgrammingClass;

public class TechUsingMethod {
	
	static int n=2025;
	static int temp=n;
	static int square=1;
	
	public static void check() {
		
		int count=0;
		int d=1;
		int sum=0;
		
	while(n>0) {
			count++;
			n=n/10;
		}
		
		if(count%2==0) {
			
		for(int i=1; i<=count/2; i++) {
				d=d*10;
			}
			int last = temp%d;
			int first= temp/d;
			sum=first+last;
			square=sum*sum;
		}
	}

	public static void main(String[] args) {
		
		check();
		
		if(square==temp) {
			System.out.println(temp+" is Tech Number");
		}
		else {
			System.out.println(temp+" is Not Tech Number");
		}
	}

}

