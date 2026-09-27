class A{
 public A()
 { 
     super(); // Calls Object's default constructor
    System.out.println("int A..");
 }
public A(int n )
{

    // super(); // Calls Object's default constructor
    System.out.println("printing A ..");
}

}
class B extends A{
 
 public B()
 {
   super(); // Calls A's default constructor
   System.out.println("int B..");
 }
public B(int n )
{
    // super(n); // Calls A's parameterized constructor
    System.out.println("printing B ..");
} 
}


public class supere {
 public static void main(String a[]){
    B obj = new B();

 }
    
}
