import java.util.*;
class gen
{
	public static <E> void sort(E[] o)
	{
		LinkedList<E> l1=new LinkedList<E>();
		for(int i=0;i<o.length;i++)
		{
			l1.add(o[i]);
		}
		l1.sort(null);

		for(int i=0;i<o.length;i++)
		{
			System.out.println(o[i]+" ");
		}
		
	}
	
}
public class sortingarrays
{
	public static void main(String[] x)
	{
		Integer arr[]={1,2,3,4,5,6,7};
		Double ar1[]={2.3,5.6,4.0,3.1,8.9};
		String ar2[]={"abd","aab","bcd","cba"};
		Character ar3[]={'a','b','c','d','e'};
		gen.sort(arr);
		gen.sort(ar1);
		gen.sort(ar2);
		gen.sort(ar3);
	}
}