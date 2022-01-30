package helloworld;
public class mainCC {
	public static void main(String[] args) {
		Cylinder c=new Cylinder(2,5);
		System.out.println(c.toString());
		System.out.println(c.getVolume());
		System.out.println(c.getArea());
	}
}