public class linearsearch {
    public static void main(String a[]){
       int arr[]= {1,2,34,5,6,7,8,9};
       int target = 0;

       for(int i=0; i<arr.length; i++){
         if(arr[i]==target){
            System.out.println("index : " + i);
            break;
         } else{
            System.out.println(" not found the value ");
         }
       }
    }
}
