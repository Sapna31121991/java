package interfaceExample;

public class TryCatch {
	
public static void main(String[] args) {
	int s=10;
	
	try
	{
		int result=s/0;
	}
catch(ArithmeticException e)
	{
	System.out.println("Division by zero not possible");
	}
	System.out.println("Remaining codes........................ ");
}
}
