enum status{
    Running,Failed,Pending,Success;
}

public class enumfor {
    public static void main(String[] args) {
        
        status s = status.Running;
        if (s == status.Running)
            System.out.println("running the application");
        else if (s == status.Failed) 
            System.out.println("it was failed");
        else if(s == status.Pending)
             System.out.println("its peding");
            else
                System.out.println("all working good");
    }
    
}
