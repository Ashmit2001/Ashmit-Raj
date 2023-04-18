public class leaders {
    public static void main(String arrgs[]){
        int arr[] = {5,6,7,8,4,8};
        int n = arr.length;
        int count = 1;
        for(int i =1; i<n; i++){
            if(arr[i]>=arr[n-1]){
                count++;
            }
        }
             System.out.println(count);
        
    }
    
}
