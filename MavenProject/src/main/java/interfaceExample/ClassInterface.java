package interfaceExample;

public class ClassInterface implements Interface1,Interface2 {
	
	public void read()
	{
		System.out.println("The value of first method :"+VALUE);
	}
	public void input()
	{
		System.out.println("The value of second method :"+NO);
	}

	public static void main(String[] args) {
		ClassInterface ob =new ClassInterface();
		ob.read();
		ob.input();

		
		

	}

}
