interface A
{
    void show();
    void config();
}
interface x{
  void run();
}
interface y extends x{
       void show();
    //    void bala();
}
// class c implements y{
//     public void shown(){

//     }
//     public void run(){

//     }
// }

class B implements A ,y
{
    public void show(){
         System.out.println("show run ");
    }
    public void config(){
           System.out.println("config run ");
    }
    public void run(){
              System.out.println("running run ");
    }
    public void shown(){

    }

}
    

public class extendsimplements {
    public static void main(String a[])
    {
        // A obj = new B();
        // obj.config();
        // obj.show();
        
        y obj1 = new B();
        obj1.run();

        A obj = new B();
        obj.config();
        obj.show();
        
    }
    
}
