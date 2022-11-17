package fabo;

import java.util.Scanner;

public class A {

	public static void main(String[] args)
	{
		String name="chnaged";
		// TODO Auto-generated method stub

		int num, a=0,b=0, c=1;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the no ");
		
		num=sc.nextInt();
		
		System.out.println("fabolanci Series");
		
		for(int i=0 ;i<=num; i++)
		{
			a=b;
			b=c;
			c=a+b;
			
			System.out.println(a+ " " );
			
		}
		
		
	}

}
