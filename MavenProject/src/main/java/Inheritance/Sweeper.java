package Inheritance;

public class Sweeper extends Employee {
	int days=100;
	public void method2()
	{
		System.out.println("No of Working days is "+days);
	}

	public static void main(String[] args) {
		Sweeper obj=new Sweeper();
		obj.details();
		obj.method2();

	}

}
