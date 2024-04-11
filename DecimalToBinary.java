package ProgrammingClass;

public class DecimalToBinary {

	public static void main(String[] args) {
	
		int n=125;
		int []arr= new int[10];
		int index=0;
		
		while(n>0){
		
			int rem=n%2;
			arr[index]=rem ; 
			index++;
		    n= n/2;
		 }
		for(int i=arr.length-1; i>=0; i--) {
			 System.out.print(arr[i]);
		}
		
         
	}

}
