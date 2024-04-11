package ProgrammingClass;

public class DiseriumNumber {

	public static void main(String[] args) {
		
		int n=175;
		int temp=n;
		int temp2=n;
		int sum=0;
		int count=0;
		
		while(n>0) {
			count++;
			n=n/10;
		}
		
		while(temp>0){
			int last= temp%10;
			int power=1;
			
			for(int i=1;i<=count;i++) {
				power=power*last;
			}
			count--;
			sum=sum+power;
		    temp=temp/10;	
		}
		
		if(temp2==sum) {
			System.out.println(temp2+" is Diserium Number");
		}
		else {
			System.out.println(temp2+" is Not Diserium Number");
		}

	}

}
