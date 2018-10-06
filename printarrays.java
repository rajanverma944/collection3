import java.util.*;
class gen
{
	public static <E> void display(E[] o)
	{
		for(int i=0;i<o.length;i++)
		{
			System.out.println(o[i]+" ");
		}
	}
}
public class printarrays
{
	public static void main(String[] x)
	{
		Integer arr[]={1,2,3,4,5,6,7};
		Double ar1[]={2.3,5.6,4.0,3.1,8.9};
		String ar2[]={"hello","world","?"};
		Character ar3[]={'a','b','c','d','e'};
		gen.display(arr);
		gen.display(ar1);
		gen.display(ar2);
		gen.display(ar3);
	}
}
