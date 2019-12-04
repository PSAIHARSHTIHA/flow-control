import java.io.*;
import java.util.*;
class P15{
public static void main(String arg[]){
int a,n,sum=0;
System.out.println("enter a number");
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
System.out.println("enter the number of digits in the given number");
int b;
n=sc.nextInt();
for(int i=0;i<n;i++)
{
b=a%10;
sum=sum+b;
a=a/10;
}
System.out.println("sum is"+sum);
}
}


























