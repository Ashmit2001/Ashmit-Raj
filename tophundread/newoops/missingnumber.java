package tophundread.newoops;

public class missingnumber {
    public static void main(String arrgs[]){
        int arr[] = {1,2,3,4,6};
        int n = arr.length;
        int m = arr.length+1;
        int sum  = m* (m+1)/2;
        System.out.println(fun1(arr , sum , n));
       // System.out.println(sum);
    }
    public static int fun1(int arr[] , int sum , int n ){
        //int lk ;    
        int result = 0;
            for(int i =0; i<n; i++){
                   result +=arr[i];
            }
               int lk = sum - result;
               return lk;
    }
    
}
