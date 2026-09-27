class A 
{
public void show()
{
System.out.println(" class A show the method");
}
}

class B 
{
public void show()
{ 
  System.out.println("class B show method");
}
}


public class anonymas {
    public static void main(String a[])
    {
       A obj = new A()
       {
        public void show()
        {
            System.out.println("class new show method");
        }
       };
       obj.show();
    }
    
}
