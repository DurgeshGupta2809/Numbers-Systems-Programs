package ProgrammingClass;

public class XylemAndPhloemUsingMethod {
	
	static int n=1436;
	static int outer;
	static int inner=0;
	static int temp=n;

	public static void check() {

		int last = n%10;  // only last digit
		n=n/10;
	while(n>9) {
			
			int digit=n%10;
			inner=inner+digit;
			n=n/10;
		}
		 outer= n+last;
	}
	
	public static void main(String[] args) {
		
		check();
		
		if(outer==inner) {
			System.out.println(temp+" is Xylem Number");
		}
		else {
			System.out.println(temp+" is Phloem Number");
		}
		
	}

}
