package Inheritance;

public class Developer extends Employee {
int age=29;
public void method1()
{
	System.out.println("The age is "+age);
}
	public static void main(String[] args) {
		Developer obj=new Developer();
		obj.details();
		obj.method1();
	}

}
