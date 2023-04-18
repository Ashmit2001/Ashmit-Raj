package tophundread.newoops;

public class stockbuy {
    public static void main(String arrgs[]){
        int arr[] = {1,5,3,8,12};
      //  int n = arr.length;
        System.out.println(fun1(arr ));
    }
     public static int fun1(int arr[] ){
        int sum = 0;
        int profit ;
        for(int i = 1; i<arr.length; i++){
          if(arr[i]>arr[i-1]){
            profit = arr[i] - arr[i-1];
            
             sum = sum + profit;
          }
          
        }
        return sum;
     }
    
}
