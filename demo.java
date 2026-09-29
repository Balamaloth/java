

class A
{

    public A(){
        System.out.println(" printing A ..");
    }
   class B extends A 
   {
    public B(){
        System.out.println(" print B ..");
    }
   } 


}

 class B extends A 
   {
    public B(){
        System.out.println(" print B ..");
    }
   } 



public class demo {
    public static void main(String args[]){
      A obj = new B();


    }
    
}
