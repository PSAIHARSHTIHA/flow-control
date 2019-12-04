import java.io.*;
import java.util.*;
class P7{
public static void main(String arg[]){
char ch,CH;
int temp;
Scanner scan=new Scanner(System.in);
System.out.println("enter a upper charecter");
ch=scan.next().charAt(0);
temp=(int)ch;
temp=temp+32;
CH=(char)temp;
System.out.println(ch+"->"+CH);
}
}