public class LongestSubArray
{
	public static void main(String[] args) {
	    int a[] = {2,6,1,4,3};
	    int b[] = new int[a.length-1]; 
	    Arrays.sort(a);
	    int index = 0;
	    //1,2,3,4,6
	   for(int i=0;i<a.length;i++)
	   {
	       for(int j=i+1;j<a.length;j++)
	       {
	          if(a[i]+1==a[j]||a[i]-1==a[i-1])
	          {
	              b[index] = a[i];
	              index++;
	              break;
	          }
	       }
	   }
	   for(int i=0;i<b.length;i++)
	   {
	       System.out.println(b[i]);
	   }
	   
	}
}