interface computer 
 {
  public void code();
  
}


class laptop implements computer 
{
    public void code()
    {
        System.out.println("coding .. compile run");
    }
}
  
class developer 
{
    public void devApp(computer lap)
    {
        lap.code();
    }    
}

class desktop implements computer
{
    public void code()
    {
        System.out.println("desktop codding some faster ");
    }
}
public class needinterface {
    public static void main(String a[])
    {
        computer lap = new laptop();  // interface referience 
        computer desk = new desktop();  // interface referience 


      developer bala = new developer();
        bala.devApp(lap);
        bala.devApp(desk); 
    }
    
}

