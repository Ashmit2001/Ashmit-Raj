public class dltarray {
   
        public static void main(String[] args) {
            int arr[] = {1,2,3,4,5};
            int n = 5;
            int dlt = 3;
            n = fun1(arr,dlt,n);
            for(int i =0; i<n; i++){
                System.out.println(arr[i]+" ");
            }
    
        }
    
         static int fun1(int arr[],int dlt,int n){
           int i =0;
            for( i =0; i<n; i++){
                if(arr[i]== dlt)
                    break;
                
            }
                    for(int j =i; j<n-1; j++){
                        arr[j] = arr[j+1];
                    }
                return n-1;
        }
    }
    

