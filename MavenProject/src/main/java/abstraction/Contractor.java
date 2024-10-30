package abstraction;

import java.util.Scanner;

public class Contractor extends Employee{
	public void calculateSalary()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of payment per hour for contract employee");
		int a=s.nextInt();
		System.out.println("Enter the working hours");
		int b=s.nextInt();
		int salary=a*b;
		System.out.println("The total salary of Contractor :"+salary);
	}
}
