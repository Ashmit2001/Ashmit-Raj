package tophundread.newoops;

public class twosum {
    public static void main(String arrgs[]){
        int arr[] = {2,9,4,3,1,10,1,6};
        int n = arr.length;
        int sum = 9;
        
        int ar[]= fun1(arr , n , sum);
       for(int i=0;i<2;i++)
       System.out.print(ar[i]+" ");

    }
      public static int[] fun1(int arr[] , int n ,int sum){
       
        int result[] = new int[2];
        for(int i =0; i<n; i++){
           
            for(int j = i+1; j<n; j++){
               int sum2 = arr[i]+arr[j];
                if(sum2==sum){
            
                    result[0] = i;
                    result[1] = j;
                
                    break;
                }
            }
            
        }
        return result;
    
         
      }
    
}
