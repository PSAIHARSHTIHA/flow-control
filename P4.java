import java.io.*;
import java.util.*;
class P4{
public static void main(String arg[])
{
char a,b;
System.out.println("enter the letters");
Scanner sc=new Scanner(System.in);
a=sc.nextChar();
System.out.println(":");
b=sc.nextChar();
if(a>b)
System.out.println(b+" , "+a);
else
System.out.println(a +" , "+ b);
}
}


