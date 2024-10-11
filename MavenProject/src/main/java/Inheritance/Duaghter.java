package Inheritance;

public class Duaghter extends Father{
	public void method4()
	{
		System.out.println("The Duaghter class method");
	}
	

	public static void main(String[] args) {
		Son obj=new Son();
		Duaghter obj1=new Duaghter();
		obj.method3();
		obj.method2();
		obj1.method4();
		//obj1.method2(); 
	}

}
