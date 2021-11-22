public class DemoConst6
{
  static int count;
  
  DemoConst6()
  {
    count=count+1;
  }
  void show()
  {
    System.out.println("Total objects created: "+count);
  }
  public static void main(String args[])
  {
    DemoConst6 obj1=new DemoConst6();
	DemoConst6 obj2=new DemoConst6();
	DemoConst6 obj3=new DemoConst6();
	obj1.show();
	
  }
}