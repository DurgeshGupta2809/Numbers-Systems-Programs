package ProgrammingClass;

public class XylemAndPhloem {

	public static void main(String[] args) {
		
		int n=21234;
		int temp=n;
		int last = n%10;  // only last digit
		n=n/10;
		int inner=0;
		
		while(n>9) {
			
			int digit=n%10;
			inner=inner+digit;
			n=n/10;
		}
		int outer= n+last;
		
		if(outer==inner) {
			System.out.println(temp+" is Xylem Number");
		}
		else {
			System.out.println(temp+" is Phloem Number");
		}
		
	}
}
