  //*****************************************************************************/
 
 class SelfDivide{
     public void m1(int num)
     {
         if(res(num))
         {
             System.out.println("self");
         }
         else{
             System.out.println("no");
         }
         
     }
     public boolean res(int num1)
     {
         boolean flag = true;
         int temp = num1;
         while(num1!=0)
         {
             int rem = num1%10;
             if(temp%rem!=0)
             {
                  flag = false;
                  
             }
              
             num1 = num1/10;
         }
         return true;
          
          
         
     }
 }
 class Main{
     public static void main(String[] args)
     {
          SelfDivide ob = new SelfDivide();
          ob.m1(11);
         
          
     }
 }