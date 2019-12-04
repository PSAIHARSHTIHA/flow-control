import java.io.*;
import java.util.*;
class P16{
public static void main(String arg[]){
int a,i,j,number=0;
System.out.println("enter a number");
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
for(i=1;i<=a;i++)
{
for(j=1;j<=i;j++)
{
System.out.print("*"+" ");
number++;
}
System.out.println();
}
}
}























