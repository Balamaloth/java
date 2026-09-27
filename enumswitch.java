enum status{
    Running,Failed,Peding,Success;
}
public class enumswitch {
    public static void main(String[] args) {
        status s = status.Failed;
        switch(s)
        {
        case Running:
            System.out.println("application running");
            break;
        case Failed:
            System.out.println("it failes ...");
            break;
        case Peding:
            System.out.println("peding appli");
            break;
        default:
            System.out.println("appli succes"); 
        }
    }
    
}
