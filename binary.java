public class binary{
    public static void main(String[] args) {
  int num [] = {1,2,3,4,5,6,7,8,9,0};
  int low = 0;
  int high = num.length ;
  int target = 9;
  while (low <= high) {
    int mid =( low + high) /2;
    if (num[mid] == target) {
        System.out.println(" found index : " + mid);
        break;
    }
       else if (num[mid] < target) {
         low = mid + 1;
       } else {
        high = mid -1;
       }
  }
    }
}