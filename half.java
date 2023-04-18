import java.util.Arrays;

public class half {

   public static void fun1(int arr[] , int n){
    Arrays.sort(arr);
    int temp;
       for(int i = n/2; i<n-1; i++ ){
        for(int j = i+1; j<n; j++){
           if(arr[i]<arr[j]){
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
           }
        }
       }
       for(int i =0; i<n; i++){
        System.out.print(arr[i] +" ");
       }
    }

    public static void main(String arrgs[]){
        int arr [] = {30, 40 , 5, 7, 10};
        int n = arr.length;
        fun1(arr , n);

    }
    
}
