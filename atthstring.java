import java.util.*;
public class atthstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a email Id :");
        String emailString = sc.next();
        String username = "";

        for(int i =0; i <emailString.length(); i++){
            if (emailString.charAt(i) == '@') {
               break;
            }else{
                username += emailString.charAt(i);
            }
        }
        if(emailString.contains("@")){
            System.out.println(username);
        }else{
            System.out.println("invalied email : ");
        }
        
        
    }

    
} 