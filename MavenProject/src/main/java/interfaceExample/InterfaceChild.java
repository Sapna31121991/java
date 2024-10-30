package interfaceExample;

public class InterfaceChild implements InterfaceClass {
	public void print()
	{
		System.out.println("Method 1 value  :"+MAX_VALUE);
	}
	public void display()
	{
		System.out.println("Method 2 value  :"+MIN_VALUE);
	}

	public static void main(String[] args) {
		InterfaceClass ob=new InterfaceChild();
		ob.print();
		ob.display();	

	}

}
