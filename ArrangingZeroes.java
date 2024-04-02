 //**************************************************************************/

import java.util.*;

public class ArrangingZeroes
{
	public static void main(String[] args) {
	     int a[] = {2,0,2,0,5};
	     int n = a.length;
	     Vector<Integer> v = new Vector<>();
	     for(int i=0;i<a.length;i++)
	     {
	        if(a[i]!=0)
	        {
	            v.add(a[i]);
	        }
	     }
	     int num = n-v.size();
	     for(int i=0;i<num;i++)
	     {
	         v.add(0);
	     }
	     System.out.println(v);
	}
}
