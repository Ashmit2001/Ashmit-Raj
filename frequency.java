public class frequency {

        public static void fun1(int arr[] , int n ){
            int i = 1;
            int fr = 1;
            while(i<n){
                 while(i<n && arr[i] == arr[i-1] ){
                     fr++;
                     i++; 
                 }
                   System.out.println(arr[i-1] +" "+fr);
                   i++;
                   fr = 1;
            }
               if(n == 1 || arr[n-1] != arr[n-2]);
               System.out.println(arr[n-1] +" "+1);
        }

    public static void main(String args[]){
        int arr[] = {34,34,34,89};
        int n = arr.length;
        fun1(arr , n);

        
    }
    
}
