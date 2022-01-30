package helloworld;
public class Employee
{
	private int id;
	private String firstName,lastName;
	private int salary;
	public Employee(int id,String firstName,String lastName,int salary)
	{
		this.id=id;
		this.firstName=firstName;
		this.lastName=lastName;
		this.salary=salary;
	}
	public int getID()
	{
		return id;
	}
	public String getFirstname()
	{
		return firstName;
	}
	public String getLastname()
	{
		return lastName;
	}
	public String getName()
	{
		return firstName+' '+lastName;
	}
	public int getSalary()
	{
		return salary;
	}
	public void setSalary(int salary)
	{
		this.salary=salary;
	}
	public int getAnnualSalary()
	{
		return salary*12;
	}
	public int raiseSalary(int percent)
	{
		return salary*percent/100;
	}
	@Override
	public String toString()
	{
		return String.format("Employee[id=%d,name=%s %s,salary=%d]",id,firstName,lastName,salary);
	}
}