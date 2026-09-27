class A 
{
    public A()
    {
        System.out.println("in A...");
    }

    public A(int n)
    {
        System.out.println("this is A");
    }
}

class B extends A
{
    public B()
    {
       super();
        System.out.println("in B ..");
    }
    public B(int n)
    {
        this ();      // super(n);
        System.out.println("this is B");
    }
}



public class thiss
{  
    public static void main(String a[])
    {
        B obj = new B(1);
    }

    
}
