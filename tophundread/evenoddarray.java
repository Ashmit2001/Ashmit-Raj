package tophundread;

public class evenoddarray {
    public static void main(String arrgs[]){
        int arr[] = {12,13,56,40,2,1};
        int n = arr.length;
        int ecount =0;
        int ocount = 0; 
        for(int i =0; i<n; i++){
            if(arr[i]%2==0){
                ecount++;
            }else{
                ocount++;
            }
        }
           System.out.println("even num"+" "+ecount);
           System.out.println("odd num"+" "+ocount);
    }
    
}
