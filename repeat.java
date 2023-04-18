
import java.util.Arrays;

public class repeat {
    public static void  fun1(int arr[] , int n){
        Arrays.sort(arr);
    
        int mix = arr[0];
        System.out.print(arr[0]+" ");
        for(int i = 1; i<n; i++){
            if(arr[i] != mix){
                 mix = arr[i];
                 System.out.print(mix+" ");
            }
        
        }
        
    }
    public static void main(String arrgs[]){
        int arr[] = {10,20,10,20,30,40,40};
        int n = arr.length;
        fun1(arr , n);
    }
      
    
}
