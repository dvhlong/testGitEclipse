package helloworld;
public class Circle
{
	private double radius;
	public Circle()
	{
		radius=1;
	}
	public Circle(double radius)
	{
		this.radius=radius;
	}
	public double getRadius()
	{
		return radius;
	}
	public double getArea()
	{
		return Math.PI*radius*radius; 
	}
	@Override
	public String toString() {		
		return String.format("Circle[%f]",radius);
	}
}
