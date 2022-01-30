package FTA;
public class StringToPerson{
	public static void main(String[] args) {
		String s="18T1021162|Doan|Long|15/09/200|TP Hue|1|Hue";
		PersonS p1=PersonS.parse(s);
		System.out.print(p1.toString());
	}
}
