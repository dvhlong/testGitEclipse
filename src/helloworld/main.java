package helloworld;
public class main
{
	public static void main(String[] args)
	{
		Staff s1=new Staff("Long","Han thuyen","NTP",2.53);
		Student s2=new Student("Long","Han Thuyen","IT",2020,2.33);
		Employee e1=new Employee(1234,"Doan","Long",2000000);
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(e1.toString());
		System.out.print(false);
	}
}