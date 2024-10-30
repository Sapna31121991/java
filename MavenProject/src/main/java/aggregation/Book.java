package aggregation;

public class Book {
	String name;
	int pageNo;
	int edtn;
Author add;
	public Book(String name,int pageNo,int edtn,Author add)
	{
		this.name=name;
		this.pageNo=pageNo;
		this.edtn=edtn;
		this.add=add;
	}
	public void read()
	{
		System.out.println(name);
		System.out.println(pageNo);
		System.out.println(edtn);
		System.out.println(add.name);

	}
	public static void main(String args[])
	{
		Author ob=new Author("Keshav");
		Book ob1=new Book("Mazha",200,13,ob);
		ob1.read();
	}

}
