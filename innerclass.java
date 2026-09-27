class A 
{
    int age ;
    public void show()
    {
        System.out.println(" class A show the method");
    }
    static class B 
    {
        public void show()
        {
            System.out.println("class B show method");
        }
    }
}


public class innerclass
{

    public static void main(String a[])
    {
    A obj = new A();
    obj.show();

    A.B obj1 = new A.B();
    obj1.show();
    }
}