import java.util.Scanner;
public class DemoConstt
{
  int n1,n2;
  float total;
  
  DemoConstt()
  {
    Scanner scn=new Scanner(System.in);
	System.out.println("Enter the 1st value:");
	n1=scn.nextInt();
	System.out.println("Enter the 2st value:");
	n2=scn.nextInt();
	
  }
  void show()
  {   
      total=n1+n2;
	  System.out.println("Addition is :"+total);
      System.out.println("This is a method");
  }
  public static void main(String args[])
  {
   DemoConstt dc1=new DemoConstt();
   dc1.show();
  }
}