public class endzero {
    public static void main(String arrgs[]){
        int arr[] = {6,0,1,8,0,2};
        int n = arr.length;
        int j = n-1;
    
        for(int i = arr.length-2; i<=0; i--){
            if(arr[i]==0){
                
                arr[j] = arr[i];
                j++;
            }
            for(int e : arr){
                System.out.println(e);
            }
        }
    }
    
}
