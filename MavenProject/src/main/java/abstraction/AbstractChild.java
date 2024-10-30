package abstraction;

public class AbstractChild extends AbstractClass {
	public void print()
	{
		System.out.println("Abstract method implementation");
	}
	public void read()
	{
		System.out.println("Normal method2");
	}
	

	public static void main(String[] args) {
		AbstractChild ob=new AbstractChild();
		ob.print();
		ob.read();
		ob.display(); 
	}

}
