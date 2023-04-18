import java.util.Arrays;

public class maxdiffrence {
    public static void main(String[] args) {
        int arr[] = {1,2,3,11,5};
        int n = arr.length;
        int j = n-1;
        int i =0;
        int max =0;
       Arrays.sort(arr);
       max = arr[j] -arr[i] ; 
        System.out.println(max);

    }
    
}
