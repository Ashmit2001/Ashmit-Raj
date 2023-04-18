package tophundread;

public class productofsubarraymax {
    public static void main(String arrgs[]){
        int arr[] = {10,-20,-30,0,70,-80,-20};
        int n = arr.length;
        int result = arr[0];
        
        for(int i=0; i<n; i++){
            int product = arr[i];
            for(int j = i+1; j<n; j++){
                result = Math.max(result, product);
                product = product*arr[j];
            }
            result = Math.max(result, product);
        }
        System.out.println(result);
    }
    
}
