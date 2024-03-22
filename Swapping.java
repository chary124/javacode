import java.util.Scanner;

public  class  Swapping{
public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     System.out.println("enter the first number");
     
     int mynum1 = sc.nextInt();
      System.out.println("enter the secound number");
int mynum2 = sc.nextInt();
       

System.out.println("intial value of mynum 1" +mynum1+ " my num2 is "+ mynum2);
mynum1 = mynum1 + mynum2;
mynum2 = mynum1 - mynum2;
mynum1 = mynum1 - mynum2;

System.out.println("after swapping the value num1 is " + mynum1 +" mynum2 value is  " + mynum2);
}
}