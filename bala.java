public class bala{
    public static void main (String a[]){
        int arr[] = {8,3,6,9,0,1,2,4,6,8,3,5,6,7};
        int size = arr.length;
        int temp =0;
       System.out.println("before sorting");
       for(int num : arr){
        System.out.print(num + " ");
       }
        for(int i =0; i<size; i++){
            for (int j=0; j<size-i-1; j++){
               if (arr[j] > arr[j+1]) {
                temp=arr[j];
                arr[j] = arr[j+1];
                arr[j+1]=temp;
                
               }
            }
            System.out.println( );
            for(int num : arr){
                System.out.print(num + " ");

            }
        }
        
        System.out.println( );
       System.out.println("after sorting");
       for(int num : arr){
        System.out.print(num + " ") ;
       }
     
    }

}