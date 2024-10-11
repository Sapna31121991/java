package Inheritance;

public class Father extends Grand {
	public void method2()
	{
		System.out.println("Father method");
	}
	public static void main(String args[])
	{
		Father obj=new Father();
		obj.method1();
		obj.method2();
	}
}