package polymorphism;

public class OffSeason extends OnSeason {
	public void discount(int no)
	{
		double disc=no*0.40;
		System.out.println("Off season discount :"+disc);
		super.discount(10000);	
		
	}

	public static void main(String[] args) {
	OffSeason ob=new OffSeason();
	ob.discount(10000);

	}

}
