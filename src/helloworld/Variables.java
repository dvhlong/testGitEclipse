package helloworld;

import java.util.Scanner;

public class Variables{
	public static void main(String[] args)
	{
		int a;
		int b;
		int n=5;
		a=40;
		b=26;
		float c;
		c=(float)a/b;
		System.out.println(c);
		System.out.println(Variables.giaithua(n));
		if(Variables.soChan(n))
			System.out.println(n+" la so chan");
		else
			System.out.println(n+" la so le");
		Scanner nhap=new Scanner(System.in);
		
	}
	public static long giaithua(int n)
	{
		long s=1;
		for(int i=1;i<n;i++)
			s *=i;
		return s;
	}
	public static boolean soChan(int n)
	{
		if(n%2==0)
			return true;
		else
			return false;
	}
}