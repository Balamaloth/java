public class bubble {
    public static void main(String[] args) {
        int num[] = {6,9,8,2,4,4};
          int size = num.length;

          int j =0;
          

          if(num[j] < num[j+1]){
    
            int temp = num[j];
            num[j] = num[j+1];
            num [j+1 ] = temp;
 System.out.println(num[0]);
 System.out.println(num[1]);
          }
    }
    
}
