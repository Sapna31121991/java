package polymorphism;

public class Hdfc extends Bank{
public void interest()
{	super.interest();
	System.out.println("HDFC interest is");
	}
public static void main(String args[])
{
	Bank b;
	b=new Sbi();
	b.interest();
	b=new Hdfc();
	b.interest();
	}
}
