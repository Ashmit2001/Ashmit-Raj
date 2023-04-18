package tophundread;

public class repeatingelement {
    public static void main(String arrgs[]){
      int arr[] = {2,5,7,2,8,9,5};
       int n = arr.length;
       for(int i =0; i<n; i++){
        boolean flag = false;
            for(int j =i+1; j<n; j++){
                if(arr[i]==arr[j]){
                    flag = true;
                    break;
                }
            }
                if(flag){
                    System.out.print(arr[i]+" ");
                }
            }
       }


    }

