package Inheritance;

public class Calculate extends SalarySystem {
	float hra,pf;
	public void method1()
	{
		hra=bonus*.05f;
		pf=bonus*0.5f;
		System.out.println("HRA :"+hra);
		System.out.println("Pf :"+pf);
	}

	public static void main(String[] args) {
		Calculate obj=new Calculate();
		obj.details();
		obj.method1();
		

	}

}
