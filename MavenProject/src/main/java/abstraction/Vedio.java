package abstraction;

public class Vedio extends Google {
	public void search()
	{
		System.out.println("Vedio searching");
	}

	public static void main(String[] args) {
		
       Vedio ob=new Vedio();
       Image ob1=new Image();
       ob.search();
       ob1.search();
	}

}
   