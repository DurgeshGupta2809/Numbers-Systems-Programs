package ProgrammingClass;

public class TechNumberWithRange {

	public static void main(String[] args) {
		int min=25;
		int max=2030;
		int temp=min;
		int count=0;
		int d=1;
		int sum=0;
		int square=1;
		
		for(int j=min; j<=max; j++) {
		while(min>0) {
			count++;
			min=min/10;
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

}
