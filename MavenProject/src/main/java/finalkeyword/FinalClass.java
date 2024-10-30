package finalkeyword;

public class FinalClass {
	final int A=10;
	final int B;//blank final variable or uninitialized final variable
	public FinalClass()
	{
		B=25;
	}
	
	public final void method()
	{
		System.out.println("Final method");
	}
}
