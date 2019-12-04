import java.io.*;
import java.util.*;
class P1{
public static void main(String arg[])
{
int a;
System.out.println("enter a number");
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
if(a>0)
System.out.println("it is a positive integer");
else if(a<0)
System.out.println("it is a negative integer");
else
System.out.println("the number is zero");
}
}