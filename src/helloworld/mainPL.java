package helloworld;

public class mainPL {

	public static void main(String[] args) {
		Point a = new Point(2,2);
		Point b = new Point(5,5);
		System.out.println(String.format("D(a,b)=%f",a.distance(b)));
		Line ab=new Line(a,b);
		System.out.println(String.format("Lab=%f",ab.length()));
	}

}
