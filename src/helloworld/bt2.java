package helloworld;
//import java.util.Arrays;
public class bt2
{
	public static void main(String[] args)
	{
		
		int a[];
		int n=5;
		a= new int[n];
		a[0]=1;
		a[1]=2;
		a[2]=3;
		a[3]=4;
		a[4]=5;
		System.out.println(String.format("tong cac phan tu la %d ",tong(a)));
		float reSult[]=minMaxAve(a);
		System.out.println(String.format("max = %.2f\n min = %.2f\n ave = %.2f",reSult[0],reSult[1],reSult[2]));
	}
	/**
	 * tinh tong cac phan tu trong mang 
	 * @param mang can xet
	 * @return tong cac phan tu 
	 */
	public static int tong(int[] mang)
	{
		int s=0;
		//su dung foreach (ko phu thuoc vao thu tu ptu cua mang)
		for (int ptu:mang)
		{
			s+=ptu;
		}
		return s;
	}
	/**
	 * tim phan tu nho nhat, lon nhat va gia tri trung binh
	 * @param mang
	 * @return gia tri min, max va trung binh
	 */
	public static float[] minMaxAve(int[] mang)
	{
		float min=Float.MAX_VALUE,max=Float.MIN_VALUE,s=0;
		for (float ptu:mang)
		{
			if(min>ptu)
				min=ptu;
			if(max<ptu)
				max=ptu;
			s+=ptu;
		}
		float tb=0;
		if(mang.length>0)
			tb=s/mang.length;
		float ketQua[]= {min,max,tb};
		return ketQua;
	}	
}