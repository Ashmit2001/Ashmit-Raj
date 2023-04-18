package tophundread;

public class nonrepeating {
    public static void main(String arrgs[]){
       int arr[] = {10,10,20,30,20,20};
       int n = arr.length;
       for(int i =0; i<n; i++){
        boolean flag = true; 
           for(int j = i+1; j<n; j++){
              if(arr[i]==arr[j]){
                 flag = false;
                 break;
                 
              }
           }
             if(flag==true){
                System.out.println(arr[i]+" ");
             }
       }
    }
    
}
