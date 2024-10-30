package abstraction;

import java.util.Scanner;

public class FulltimeEmployee extends Employee {
	public void calculateSalary()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of payment for full time employee");
		int a=s.nextInt();
		int salary=a*hour;
		System.out.println("Salary of Full time employee :"+salary);
	}

	public static void main(String[] args) {
		Contractor ob1=new Contractor();
		ob1.calculateSalary();

		FulltimeEmployee ob=new FulltimeEmployee();
		ob.calculateSalary();
		
	}

}
