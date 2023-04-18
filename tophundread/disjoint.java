package tophundread;

public class disjoint {
    public static void main(String arrgs[]){
        int arr1[] = {12,34,11,9,3};
        int arr2[] = {2,1,3,5};
        
        int n = arr1.length;
        for(int i =0; i<n; i++){
            boolean flag = true;
            for(int j =0; j<arr2.length; j++ ){
                if(arr1[i]==arr2[j]){
                    flag = false;
                    break;
                }
            }
        
            if(flag==true){
                System.out.println("yes");
            }else{
                System.out.println("false"+i);
            }

        }   
    }
    
}
