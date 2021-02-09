import java.io.*;
import java.util.Scanner;
public class Main{
  public static void main(String[] args)
{
  int a,b,c;
  System.out.println("enter the value of a:");
  Scanner sc=new Scanner(System.in);
  a=sc.nextInt();
  System.out.println("enter the value of b:");
  Scanner s=new Scanner(System.in);
  b=s.nextInt();
  System.out.println("divident"+ a);
  System.out.println("divisor" + b);
  try {
        c=a/b;
        System.out.println("quotient"+ c);
      }
  catch(Exception e)
    {
      System.out.println(e);
      System.out.println("the program continues...");
    }
      
 }
}
