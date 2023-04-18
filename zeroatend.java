import java.util.Arrays;

public class zeroatend {
    public static void main(String ar[]){
        int arr[] = {6,0,1,8,0,2};
        int n = arr.length;
        Arrays.sort(arr);
        int i =0;
        int j= n-1;
        int temp = 0;
        while(i<=j){
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for(int e : arr){
            System.out.print(e+" ");

        }
    }
    
}
