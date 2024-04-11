package ProgrammingClass;

public class AutomorphicUsingMEthod {
	static int n=625;
	static int temp=n;
	static int last;
	public static void check() {
		
		int square=n*n;
		int d=1;
	while(n>0) {
			d=d*10;
			n=n/10;
		}
	   last=square%d;
	}
	public static void main(String[] args) {
		
		check();
	if(last==temp) {
	         System.out.println(temp+" is Automorphic Number");
		}
		else {
			System.out.println(temp+" is Not Automorphic Number");
		}
	}
}
