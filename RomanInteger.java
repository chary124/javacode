import java.util.*;

public class RomanInteger
{
	public static void main(String[] args) {
	    Map<Character,Integer> rv = new HashMap<>();
	    rv.put('I',1);
	    rv.put('V',5);
	    rv.put('x',10);
	    rv.put('L',50);
	    //System.out.println(rv);
	    
	    String input = "Ix";
	    int pv = 0;
	    int result = 0;
	    for(int i=input.length()-1;i>=0;i--)
	    {
	        int cv = rv.get(input.charAt(i));
	        System.out.println(cv);
	      //  break;
	        if(cv<pv)
	        {
	            result -= cv;
	        }
	        else{
	            result += cv;
	        }
	        pv = cv;
	    }
	    System.out.println(result);
	   
 	}
}