public class deletearrayjava {
    public static void main(String[] args) {
        int arr[] = {1,3,7,4,6};
        int n = 5; 
        int x = 3;
        n = fun1(arr,x,n);
        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i]);
        }
    }
    static int fun1(int arr[], int x ,int n){
       int i =0;
        for(i =0; i<n; i++){
            if(arr[i]==x)
                break;
            
          }
           for(int j =i; j<n-1; j++){
            arr[j] = arr[j+1];
           }
          return n-1;
    }
    
}
