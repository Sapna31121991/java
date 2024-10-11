package Inheritance;

public class Puppy extends Dog{
	int food=3;
	public void sleep()
	{
		System.out.println("Food items are"+food);
	}

	public static void main(String[] args) {
		Puppy obj=new Puppy();
		obj.food();
		obj.type();
		obj.sleep();
	}

}
