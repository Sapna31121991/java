package encapsulation;

import java.util.Scanner;
public class Bank {
	int camount=100000;
	private String name;
	private int pin;
	public void setter(String name,int pin )
	{
		this.name=name;	
		this.pin=pin;
		}	
	public void validate()
	{
		if(pin==1001||pin==1234||pin==1212)
		{
			System.out.println("VALID PIN");
			Scanner s=new Scanner(System.in);
			System.out.println("enter the amount");
			int amount=s.nextInt();
			System.out.println("Withdrawel Amount : "+amount);
			int bal=camount-amount;
			System.out.println("Balance :"+bal);
		}
		else
		{
			System.out.println("Invalid pin,Please enter a valid pin");
		}
		}
	public void getter()
	{
		System.out.println("Hai ,"+name);

	}
	}