package tophundread.newoops;

public class secondlargest {
    public static void main(String arrgs[]){
        int arr[] = {10,20,5,15,11,12,20};
        int n = arr.length;
        System.out.println(fun1(arr, n));
        
    }
    public static int fun1(int arr[] , int n){
        int max = arr[0];
        int secondlargest = -1;

        for(int i =1; i<n; i++){
            if(arr[i]>max){
                secondlargest = max;
                max = arr[i];
            }
            if(arr[i]!=max){

            
            if(arr[i]>secondlargest){
                secondlargest = arr[i];
            }
        }
    }
       return secondlargest  ;
    }
    
}
