package Inheritance;

import java.util.Scanner;

public class SalarySystem {
	int basic,bonus,ded;
	public void details()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter he basic salary :");
		int a=s.nextInt();
		System.out.println("The deduction is :");
		int b=s.nextInt();
		System.out.println("The bonus is :");
		int c=s.nextInt();
		basic=a;
		bonus=c;
		ded=b;
	}

}