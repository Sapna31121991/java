package Superkeyword;

public class Class2 extends Class1 {

	String colour="blue";
	public Class2(String name)
	{
	    super("Anju");
	    super.read();
		System.out.println("Child class constructor");
	}
	public void read()
	{
		super.read();
		System.out.println(colour);
		System.out.println(super.colour);
		System.out.println("child class methods");
	}
	
	public static void main(String[] args) {
		Class2 ob=new Class2("Anu");
		ob.read();
	}
}