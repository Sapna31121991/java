package exceptionexample;

import java.io.IOException;

public class Throws2 {

	public static void add() throws IOException
	{
		throw new IOException();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			add();
		}
		catch(IOException e)
		{
			System.out.println("Exception");
		}

	}

}
