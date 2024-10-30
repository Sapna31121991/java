package interfaceExample;

import java.util.Scanner;

public class Hdfc  implements Rbi {
	public void recurDpt()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the amount");
		int a=s.nextInt();
		System.out.println("Enter the time duration");
		float b=s.nextFloat();
		double result=a*b*RATE;
		System.out.println("After Depositing " +b +"year :"+result  );
	}

	public static void main(String[] args) {
	Rbi ob=new Hdfc();
	ob.recurDpt();
	}

}
