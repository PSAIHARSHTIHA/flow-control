import java.io.*;
import java.util.*;
class P6{
public static void main(String arg[]){
int a=Integer.parseInt(arg[1]);
System.out.println("enter the details gender and age"+arg[0]+arg[1]);
if(arg[0]=="female")
{
if(a>1&&a<580)
System.out.println("the intrest you can have is 8.2%");
else 
System.out.println("the interest you can have is 7.6%");
}
else
{
if(a>1&&a<60)
System.out.println("the interest you can have is 9.2");
else
System.out.println("the intrest you can have is 8.3");
}
}
}