package Inheritance;
public class Calculate extends SalarySystem {
	float hra,pf;
	public void method1()
	{
		hra=basic*0.5f;
		pf=basic*0.05f;
		System.out.println("HRA :"+hra);
		System.out.println("Pf :"+pf);
	}
		
	}
