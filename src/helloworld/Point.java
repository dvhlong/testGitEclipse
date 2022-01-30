package helloworld;

public class Point
{
	private int x;
	private int y;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public Point(Point A) //ham khoi tao sao chep
	{
		x=A.x;
		y=A.y;
	}
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	public Point() {
		super();
	}
	@Override
	public String toString() {
		return String.format("Point[%d, %d]",x,y);
	}
/**
 * Tinh khoang cach tu (x,y) den goc toa do O(0,0)
 * @return Khoang cah tu (x,y) den toa do O(0,0)
 */
	public double distance()
	{
		return Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
	}
	/**
	 * Tinh khoang cach tu doi tuong den 1 diem B nao do
	 * @param B Diem can xac dinh khoang cach voi doi tuong
	 * @return khoang cach tu doi tuong den diem do
	 */
	public float distance(Point B)
	{
		return (float) Math.sqrt(Math.pow(x-B.x,2)+Math.pow(y-B.y,2));
	}
}