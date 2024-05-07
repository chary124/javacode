 
public class  Boat
{
	public static void main(String[] args) 
	{
	int a[] = {3,2,1,2};
	int le = 3;
	Arrays.sort(a);
	int count=0;
	int l = 0;
	int r = a.length-1;
	while(l<=r)
	{
	  if((a[l]+a[r])<=le)
	  {
	      l++;
	  }
	  r--;
	  count++;
	}
		System.out.println(count);
	}
}
 