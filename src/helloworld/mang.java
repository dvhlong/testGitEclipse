package helloworld;

import java.util.Scanner;

public class mang
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
		tachMang(a);
		if (doixung(a))
			System.out.println("Mang doi xung");
		else
			System.out.println("Mang ko doi xung");
	}
	/**
	 * tach cac phan tu chan le cua mang 
	 * @param mang
	 * @return mang so chan (b) va mang so le (c)
	 */
	public static void tachMang(int[] mang)
	{
		int dem=0;
		int b[]=new int[mang.length];
		int c[]=new int[mang.length];
		int blen=0,clen=0;
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
			else
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
		System.out.println("Mang so chan :");
		for (int i=0;i<blen;i++)
			System.out.println(String.format("%d ,",b[i]));
		if (blen==0) System.out.println("Ko co");
		System.out.println("Mang so le :");
		for (int i=0;i<clen;i++)
			System.out.println(String.format("%d ,",c[i]));
		if (clen==0) System.out.println("Ko co");
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