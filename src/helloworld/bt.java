package helloworld;



public class bt
{
	//bai 2
	public static long giaithua(int n)
	{
		long s=1;
		for(int i=1;i<n;i++)
			s*=i;
		return s;
	}
	//bai 1
	public static void ptb2(float a,float b,float c)
	{
		float denta=b*b-4*a*c;
		if (denta>0)
			System.out.println("Phuong trinh co 2 nghiem la x1= "+((-b+Math.sqrt(denta))/(2*a))+" va x2= "+((-b-Math.sqrt(denta))/(2*a)));
		if (denta==0)
			System.out.println("Phuong trinh co 1 nghiem la x= "+(-b/(2*a)));
		if (denta<0)
			System.out.println("Phuong trinh vo nghiem");
	}
	//bai 5
	public static boolean laSonguyeto(int n)
	{
		int dem=0;
		for (int i=1;i<Math.sqrt(n);i++)
			if (n%i==0) dem++;
		if (dem==1) 
			return true;
		else 
			return false;
	}
	public static void songuyeto(int n)
	{
		System.out.println("Cac so nguye to nho hon "+n+" la :");
		for(int i=1;i<n;i++)
		{
			if(bt.laSonguyeto(i)) System.out.println(i);
		}
	}
	//bai 4
	public static int ucln(int a,int b)
	{
		int x=a;
		int y=b;
		while (x!=y)
		{
			if (x>y) 
				x-=y;
			else
				y-=x;
		}
		return x;
	}
	public static int bcnn(int a,int b)
	{
		return (a*b)/bt.ucln(a, b);
	}
	//bai 3
	public static int fibonaci(int n)
	{
		if (n==2) return 2;
		int f1=1;
		int f2=1;
		int f3=0;
		for (int i=3;i<n;i++)
		{
			f3=f1+f2;
			f1=f2;
			f2=f3;
		}
		return f3;
	}
}