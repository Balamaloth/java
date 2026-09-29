public class bubblesort {
    public static void main(String[] args) {
        int num [] = {7,3,9,3,2,4,5,7,8,4,22,2};
        int size = num.length;

        for(int i=0; i<size ; i++){
            for(int j=0; j< size -1; j++){
                if (num[j] < num[j+1]) {
                    int temp = num[j];
                    num[j] = num[j+1];
                    num[j+1]= temp;

                    
                }
               
            }
            
            
        }
        for(int i =0; i<size; i++){
        System.out.print(num[i] + " : ");
        }
    }
    
}
