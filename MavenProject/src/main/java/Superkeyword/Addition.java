package Superkeyword;

public class Addition {
	
	public static int add(int a,int b)
	{
		int s=a+b;
		return s;
	}
	public void check()
	{
		int res=Addition.add(12,14);
		int r=res%10;
		if(r==0)
		{
				   System.out.println("Divisible");
			   }
			   else
			   {
				   System.out.println("not Divisible");
			   }
		}
			 
	  
	}