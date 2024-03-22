import java.util.Scanner;

class    Palidrome {
 static int r,sum = 0,temp;
public static void main(String[] args){
Scanner obj1 = new Scanner(System.in);
System.out.println("enter the number");
int num = obj1.nextInt();

temp = num;

while(num > 0){
r = num%10;
sum = (sum*10)+r;
num = num/10;
}
if(temp==sum){
System.out.println(" number Palidrome");
}
else{
System.out.println("it is not an number Palidrome");
}
}
}