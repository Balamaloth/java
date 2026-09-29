import java.util.*;

public class strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the number : ");
       int size = sc.nextInt();
       System.out.println("enter the string :");
       String array[] = new String[size];
       int totLength =0;

       for (int i=0; i<size; i++){
        array[i] = sc.next();
        totLength += array[i].length();
       }
       System.out.println(totLength);
    }
}
