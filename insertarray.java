public class insertarray {
    public static void main(String[] args) {
       int arr[] = new int[6];
       arr[0] = 1;
       arr[1] = 2;
       arr[2]  = 3;
       arr[3]  = 4;
       arr[4]  = 5;
       arr[5]   = 6;
       int cap = 6;
        int n = 5;
        int x = 7;
        int pos = 2;
        n = fun1( arr,  x , pos,  n, cap);
        for(int i =0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        
    }
    static int fun1(int arr[], int x , int pos, int n,int cap){
        int index = pos-1;
        if(cap==n){
          return n;
        }
        for(int i = n-1; i>= index; i--){
            arr[i+1] = arr[i];
            
        }
        arr[index] = x; 
        
    return n+1;
    }
}
