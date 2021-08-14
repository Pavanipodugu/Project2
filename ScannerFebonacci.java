package programs;

import java.util.Scanner;

public class ScannerFebonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int k=0, a = 0, b = 1;
		//k =0;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int n = sc.nextInt(); 
	
		System.out.print("0  1  ");
		 
		while(k<=n)
		{
			k = a+b;
			
			if(k>=n)
		        
				break; 
			
		System.out.print(k + "  ");
        
		a=b;
        b=k;

	}

}
}
