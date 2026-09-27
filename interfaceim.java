interface  A
{
    int age = 10;
    String movie = "krishna";
    void bala();
    void show();
}
 class B implements A
{
  public void bala()
  {
     System.out.println(" some thing");
  }

  public void show()
  {
     System.out.println("nothing ");
  }
}


public class interfaceim {
    public static void main(String a[])
    {
         B obj = new B();
         obj.bala();
         obj.show();

         System.out.println(" age : " + obj.age  + " movie : " + obj.movie);
    }

    
}
