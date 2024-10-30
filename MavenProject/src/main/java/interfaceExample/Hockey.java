package interfaceExample;


public class Hockey implements Sports {
	public void game()
	{
		System.out.println("hockey game");
	}
	public static void main(String[] args) {
		Sports ob;
		 ob=new Hockey();
		 ob.game();
		 ob=new Cricket();
		 ob.game();
		 ob=new Football();
		 ob.game();
	}

}