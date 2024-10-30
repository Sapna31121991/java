package exceptionexample;

public class ThrowsEx {
	public static void add() throws ArithmeticException
	{
		throw new ArithmeticException("exception in addition");
	}

	public static void main(String[] args) {
		add();
	}

}
