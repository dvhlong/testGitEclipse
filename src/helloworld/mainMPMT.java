package helloworld;
public class mainMPMT {
	public static void main(String[] args) {
	MyPoint p1=new MyPoint(0,0);
	MyPoint p2=new MyPoint(0,2);
	MyPoint p3=new MyPoint(1,0);
	MyTriangle t=new MyTriangle(p1,p2,p3);
	System.out.println(t.toString());
	System.out.println(t.getPerimeter());
	System.out.println(t.getType());
	}
}