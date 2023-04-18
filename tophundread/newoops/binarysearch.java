package tophundread.newoops;

public class binarysearch {

public static void main(String[] args) {
    int arr[] = {1,3,5,7,11,13,17,19,23,31,37,41,43,47,53,59};
    int n = arr.length;
    int target = 997;
    int mid = 0;
    int low = 0;
    int high = n-1;
    
        
    while(low <= high){
        mid = (low + high)/2; 
        
        if(target==arr[mid]){
            System.out.println("found");
            return;
        }
        if(target>arr[mid]){
          low = mid + 1;
       }if(target < arr[mid]){
              high = mid-1;
         }
         }
          System.out.println("element not found");
         

}
}


