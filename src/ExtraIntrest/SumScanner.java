package ExtraIntrest;

import java.util.Scanner;

public class SumScanner {
	public static void main(String[] args) {
		
	
	long a , b ,sum;
	Scanner f = new Scanner(System.in);
    System.out.println("enter a number: ");
    a =f.nextInt();
    
    System.out.println("enter another number: ");
    b =f.nextInt();
    
    f.close();
    sum=a+b;
    System.out.println(sum);
   
    
	}

}
