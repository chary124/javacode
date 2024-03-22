 import java.util.*;

public class SecoundLargest
{
	public static void main(String[] args) {
	    int a[] = {1,10,23,2,3};
	    Arrays.sort(a);
	    System.out.println(a[a.length-1] + " using the sort");
	    System.out.println(a[a.length-2] + " secound largest element ");
	    
	    //another method 
	    int max = 0;
	    for(int i=0;i<a.length;i++)
	    {
	        if(max<a[i])
	        {
	            max = a[i];
	        }
	    }
	    System.out.println(max + " using the logic ");
 	}
}
[10:17 am, 05/03/2024] ##chary: ublic class Main
