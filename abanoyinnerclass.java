abstract class A 
{
    public void bala()
    {
        System.out.println("abstract class A method");
    }
}

public class abanoyinnerclass {
    public static void main(String a[])
    {
       A obj1 = new A()
       {
        public void bala()
        {
            System.out.println("abstract anonymous class ");
        }
       };
       obj1.bala();
    }
    
}
