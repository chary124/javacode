import java.util.*;

//var args in java

class Var_args{
    public int m1(int ... num)
    {
        int sum = 0;
        for(int res : num)
        {
            sum += res;
        }
        return sum;
    }
}

class Main{
    public static void main(String[] args)
    {
      Var_args c = new Var_args();
      System.out.println(c.m1(1,21,2));
    }
}