package accessmodifier;

    public class Class {
protected int a=12;
	public  void read()
	{
		System.out.println("The value of a :"+a);
				
	}
public static void main(String args[])
{
	Class ob=new Class();
	ob.read();
}
}
