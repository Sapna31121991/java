package exceptionexample;

public class ExceptionEx {
		
	public static void main(String[] args) {
		int s=10;
		
		try
		{
			int result=s/0;
			int a[]=new int[3];
			a[6]=50;
		}
	catch(ArithmeticException e)
		{
		System.out.println("Division by zero not possible");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array size exception");
		}
		catch(Exception e)
		{
			System.out.println("Parent exception");
		}
		finally
		{
		System.out.println("Finally code execution ");
		}
		System.out.println("remaining codes........................");
	}
}


