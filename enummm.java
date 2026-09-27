enum status
{
    running , failed,pending,success;
}


public class enummm {
public static void main(String[] args) {
    int i = 5;
    // status obj = status.running;
    // System.out.println(obj);
    status[] ss = status.values();
   for (status s : ss)
   {
System.out.println(s + " : " + s.ordinal());
   }
}
}