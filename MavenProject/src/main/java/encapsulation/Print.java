package encapsulation;

public class Print {
	public static void main(String args[])
	{
		StudentDetails ob=new StudentDetails();
		ob.setName("Anu");
		System.out.println(ob.getName());
		ob.setMid("sapna@gmail.com");
		System.out.println(ob.getMid());
		ob.setMark(98);
		System.out.println(ob.getMark());
	}

}
