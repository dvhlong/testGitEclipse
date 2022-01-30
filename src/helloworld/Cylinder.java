package helloworld;
public class Cylinder extends Circle {
	private double height;
	public Cylinder() {
		super();
	}
	public Cylinder(double radius,double height) {
		super(radius);
		this.height = height;
	}

	public double getHeight() {
		return height;
	}
	public double getVolume() {
		return super.getArea()*height;
	}
	@Override
	public String toString() {
		return String.format("Cylinder[%f,%f]",super.getRadius(),height);
	}
	@Override
	public double getArea() {
		return 2*super.getArea()+2*super.getRadius()*Math.PI*height;
	}
	
}