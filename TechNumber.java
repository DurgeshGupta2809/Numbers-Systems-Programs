package ProgrammingClass;

public class TechNumber {

	public static void main(String[] args) {
		int n=2025;
		int temp=n;
		int count=0;
		int d=1;
		int sum=0;
		int square=1;
		
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
		if(square==temp) {
			System.out.println(temp+" is Tech Number");
		}
		else {
			System.out.println(temp+" is Not Tech Number");
		}
	}

}
