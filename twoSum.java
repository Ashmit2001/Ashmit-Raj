import java.util.Arrays;

public class twoSum {
    public static void main(String arrgs[]){
        int arr[] = {1,3,4,5,6,1,89,23,4};
        Arrays.sort(arr);
        int sum = 5;

        
        int i =0;
        int j = arr.length-1;
        while(i<j){
            int k = arr[i]+arr[j];
            if(sum == k){
                System.out.println(arr[i] +" "+arr[j] +" "+i +" "+j);
                return;
            }else if(k>sum){
                   j--;
            }else if(k<sum){
                i++;
            }
        }
    }
    
}
