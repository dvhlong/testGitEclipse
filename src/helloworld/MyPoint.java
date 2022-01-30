package helloworld;
public class MyPoint
{
	private int x;
	private int y;
	public MyPoint() {
		super();
	}
	public MyPoint(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	public MyPoint(MyPoint A)
	{
		this.x=A.x;
		this.y=A.y;
	}
	public double distance(MyPoint A)
	{
		return Math.sqrt(Math.pow(x-A.x,2)+Math.pow(y-A.y,2));
	}
	@Override
	public String toString() {
		return String.format("(%d,%d)",x,y);
	}
}