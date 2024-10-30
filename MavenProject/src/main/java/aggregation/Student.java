package aggregation;

public class Student {
	String name;
	int roll;
	Address add;
public Student(String name,int roll,Address add)
{
this.name=name;
this.roll=roll;
this.add =add;
}

public void details()
{
System.out.println(name);
System.out.println(roll);
System.out.println(add.houseName);
System.out.println(add.houseNo);
System.out.println(add.state);

}
public static void main(String args[])
{
	Address ob=new Address("anu",4,"malappuram");
	Student ob1=new Student("Anil",1,ob);
	ob1.details();
	}
}