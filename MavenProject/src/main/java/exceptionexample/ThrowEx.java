package exceptionexample;

public class ThrowEx {
	
	public void add(int a,int b)
	{
		int s=a+b;
		if(s>50)
		{
			throw new ArithmeticException("Arithmetic exception occured");
		}
		else
		{
			System.out.println("Sum is less than 50");
		}
		
	}

	public static void main(String[] args) {
		
		ThrowEx ob=new ThrowEx();
		try
		{
		ob.add(50, 10);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		System.out.println("Rest of the codes............");
	}

}
