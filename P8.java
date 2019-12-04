import java.io.*;
import java.util.*;
class P9{
public static void main(String arg[]){ 
int a=Integer.parseInt(arg[0]);
System.out.println( arg[0]);
switch (a)
{
case "1":
System.out.println("JANUARY");
case "2":
System.out.println("FEBRUARY"):
case "3":
System.out.println("MARCH");
case "4":
System.out.println("APRIL");
case "5":
System.out.println("MAY");
case "6":
System.out.println("JUNE");
case "7":
System.out.println("JULY");
case "8":
System.out.println("AUGUST");
case "9":
System.out.println("SEPTEMBER");
case "10":
System.out.println("OCTOBER");
case "11":
System.out.println("NOVEMBER");
case "12":
System.out.println("DECEMBER");
default:
System.out.println("invalid");
}
}
































if(arg[0]=="R")
System.out.println("RED");
else if(arg[0]=="B")
System.out.println("BLUE");
else if(arg[0]=="G")
System.out.println("GREEN");
else if(arg[0]=="O")
System.out.println("ORANGE");
else if(arg[0]=="Y")
System.out.println("YELLOW");
else if(arg[0]=="W")
System.out.println("WHITE");
else
System.out.println("invalid inputs");
}