package ass2;

import java.util.Scanner;

public class assia {
	public static void main(String arg[])
	{
		
		Scanner sc =  new Scanner(System.in);
		System.out.print("insert value for A =  ");
		int a,b;
		a = sc.nextInt();
		System.out.print("insert value for B =  ");
		b = sc.nextInt();
		a=a+b;
		b=a-b;
		a=a-b; 
		System.out.println("=It is Swapped  =  ");
		System.out.print("value of A =  ");
		System.out.println(a);
		System.out.print("value of B =  ");
		System.out.println(b);
		
	}
	

}

