package exceptionexample;

import java.util.Scanner;

public class AgeLicence {
	public static void AgeLicence(int age) throws LicenceException
	{
	if(age<18)
	{
		throw new LicenceException("Exception occured");
	}
	else
	{
		System.out.println("Age greater than 18"); 
	}
}
public static void main(String args[])
{
	
try
{
	AgeLicence(34);
	
	}
catch(LicenceException e)
{
	System.out.println(e);
	}


	}
}
