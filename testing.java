class A
{
    public void show()
    {
        System.out.println(" print A ..");
    }
}
class B extends A
{
    public void show()
    {   this.show();
        System.out.println("print B  ..");
    }
}
class C extends A
{
    public void show()
    {
        super.show();
        System.out.println(" print C ..");
    }
}


public class testing {
    public static void main(String a[])
    {
A obj = new C();
obj.show();
    }
}
