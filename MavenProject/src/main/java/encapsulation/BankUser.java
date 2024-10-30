package encapsulation;

public class BankUser {
	private String name;
	private int acc,bal;
	public void setter(String name,int acc,int bal)
	{
		this.name=name;
		this.acc=acc;
		this.bal=bal;
	}
	public void getter()
	{
		System.out.println("Name  :"+name);
		System.out.println("Account number :"+acc);
		System.out.println("Balance :"+bal);
	}

}
