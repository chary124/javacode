 //***************************************************************************/
import java.util.*;

public class NumberProblem
{
	public static void main(String[] args) {
	    int n = 30;
	    int count = 0;
	    while(n>0)
	    {
	        int rem = n%10;
	        int rem1 = n/10;
	        if(rem>rem1)
	        {
	            n = n - rem;
	        }
	        else
	        {
	            n = n - rem1;
	        }
	        count++;
	    }
	    System.out.println(count);
 	}
}
