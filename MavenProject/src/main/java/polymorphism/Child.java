package polymorphism;

public class Child extends Parent {
	public void read(int c,int d)
	{
		int sum=c+d;
		System.out.println("Child class sum :"+sum);
		super.read(12,43);
	}

	public static void main(String[] args) {
		
            Parent ob=new Child();
            ob.read(10,10);
	}

}
