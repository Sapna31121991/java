package Inheritance;

	public class Car extends Vehicle
	{
		int time=10;
		public void inherit()
		{
			System.out.println("Child classmethod");
		}

	public static void main(String[] args) {
		Car obj=new Car();
		
		obj.inherit();
		obj.run();
		System.out.println(obj.speed);
		System.out.println(obj.time);

	}

}