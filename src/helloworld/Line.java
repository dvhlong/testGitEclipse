package helloworld;

public class Line {
	private Point begin;
	private Point end;
	public Line(Point a, Point b) {
		begin = new Point(a.getX(),a.getY()); //tranh hien tuong 2 doi tuong cung tro vao 1 vung nho //cach 1
		end = new Point(b); //cach 2 (su dung ham khoi tao sao chep)
	}
	/**
	 * Do dai cua doan thang
	 * @return Do da
	 */
	public double length()
	{
		return begin.distance(end);
	}
}
