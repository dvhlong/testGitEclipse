package helloworld;

import java.util.Scanner;

public class arr
{
	public static void main(String[] args)
	{
		Scanner nhap=new Scanner(System.in);
		System.out.println("Nhap so phan tu cua mang :");
		int n= nhap.nextInt();
		int a[]=new int[n];
		for (int i=0;i<n;i++)
		{
			System.out.println(String.format("[%d] : ",i));
			a[i]=nhap.nextInt();
		}
		int b[]=mangChan(a);
		System.out.println("Mang so chan :");
		for (int i=0;i<b.length;i++)
			System.out.println(String.format("%d ,",b[i]));
		if (b.length==0) System.out.println("Ko co");
		int c[]=mangLe(a);
		System.out.println("Mang so le :");
		for (int i=0;i<c.length;i++)
			System.out.println(String.format("%d ,",c[i]));
		if (c.length==0) System.out.println("Ko co");
		if (doixung(a))
			System.out.println("Mang doi xung");
		else
			System.out.println("Mang ko doi xung");
	}
	/**
	 * tach cac phan tu chan cua mang 
	 * @param mang
	 * @return mang so chan (b) 
	 */
	public static int[] mangChan(int[] mang)
	{
		int dem=0;
		int b[]=new int[mang.length];
		int blen=0;
		for (int ptu:mang)
			if(ptu%2==0)
			{
				dem=0;
				for (int ptu1:b)
					if (ptu1==ptu)				//kiem tra co trung ko
					{
						dem++;
						break;
					}
				if (dem==0)
				{
					blen++;
					b[blen-1]=ptu;
				}
			}
		b[blen]='\0';
		return b;	
	}
	/**
	 * tach cac phan tu le cua mang 
	 * @param mang
	 * @return mang so le (c)
	 */
	public static int[] mangLe(int[] mang)
	{
		int dem=0;
		int c[]=new int[mang.length];
		int clen=0;
		for (int ptu:mang)
		if(ptu%2!=0)
		{
			dem=0;
			for (int ptu1:c)
				if (ptu1==ptu)				//kiem tra co trung ko 
				{
					dem++;
					break;
				}
			if (dem==0)
			{
				clen++;
				c[clen-1]=ptu;
			}
		}
		c[clen]='\0';
		return c;
	}
	/**
	 * kiem tra tinh doi xung cua mang
	 * @param mang
	 * @return true or false
	 */
	public static boolean doixung(int[] mang)
	{
		if(mang.length%2==0)
		{
			int dau=0,cuoi=mang.length-1;
			while(cuoi-dau!=1)
				if(mang[dau]!=mang[cuoi])
					return false;
				else
				{
					dau++;
					cuoi--;
				}
		}
		else
		{
			int dau=0,cuoi=mang.length-1;
			while(cuoi!=dau)
				if(mang[dau]!=mang[cuoi])
					return false;
				else
				{
					dau++;
					cuoi--;
				}
		}
		return true;
	}
}