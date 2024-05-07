import java.util.*;
class m1 extends Thread{
    int i ;
    public void run()
    {
        for(i=1;i<=5;i++)
        {
            System.out.println("chary");
        }
    }
}
class m2 extends Thread{
    int i ;
    public void run()
    {
        for(i=1;i<=5;i++)
        {
            System.out.println(i);
        }
    }
}
public class Threads
{
	public static void main(String[] args) {
	    m1 t1 = new m1();
	    m2 t2 = new m2();
	    t1.start();
	    t2.start();
	    for(int i=11;i<=15;i++)
        {
            System.out.println(i);
        }
 	