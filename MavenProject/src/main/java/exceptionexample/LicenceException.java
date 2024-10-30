package exceptionexample;

import java.io.IOException;

public class LicenceException extends Exception
{
	public LicenceException(String name)
	{
		super(name);
		System.out.println("Conditions checking.....");
	
	}

}
