package tophundread.newoops.pesudo;

public class binaraysearchagin {
    public static void main(String[] args) {
        int arr[] = {20,30,40,50,60,64,65};
        int x = 40;
        int n = arr.length;
        System.out.println(fun1(arr , n , x));

    }
      public static int fun1(int arr[], int n , int x){
              int low = 0;
              int high = n-1;
              while(low<=high){
                int mid = (low+high)/2;
                if(arr[mid] == x){
                    return mid;
                }
                else if(arr[mid] > x){
                    high = mid-1;
                }else{
                     low = mid+1;
                }
              }
              return -1;
      }
    
}
