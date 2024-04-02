import java.util.*;

public class TwoSum
{
    public static void main(String[] args)
    {
        
    
   Map<Integer,Integer> hs = new HashMap<>();
     int a[] = {2,3,7,4,10};
     int t = 13;
     for(int i=0;i<a.length;i++)
     {
         hs.put(a[i],i);
     }
     for(int i=0;i<a.length;i++)
     {
         int differ = t - a[i];
         if(hs.containsKey(differ))
         {
            System.out.println(i + " " + hs.get(differ)); 
         }
         
     }
  	}
}

