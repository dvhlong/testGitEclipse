package helloworld;
public class MyTriangle {
	private MyPoint v1;
	private MyPoint v2;
	private MyPoint v3;
	public MyTriangle(int x1,int y1,int x2,int y2,int x3,int y3) {
		v1=new MyPoint(x1,y1);
		v2=new MyPoint(x2,y2);
		v3=new MyPoint(x3,y3);
	}
	public MyTriangle(MyPoint v1,MyPoint v2,MyPoint v3) {
		this.v1=new MyPoint(v1);
		this.v2=new MyPoint(v2);
		this.v3=new MyPoint(v3);
	}
	@Override
	public String toString() {
		return String.format("MyTriangle[v1=%s,v2=%s,v3=%s]",v1.toString(),v2.toString(),v3.toString());
	}
	public double getPerimeter() {
		return v1.distance(v2)+v2.distance(v3)+v3.distance(v1);
	}
	public String getType() {
		double u1=v1.distance(v2);
		double u2=v2.distance(v3);
		double u3=v3.distance(v1);
		if (u1==u2&&u2==u3)
			return "Equilateral";
		if (u1==u2||u2==u3||u3==u1)
			return "Isosceles";
		return "Scalene";
	}
}