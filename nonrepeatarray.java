public class nonrepeatarray {
    public static void main(String arrgs[]){
        int arr[] = {1,2,3,3,4,5,6,7};
        
         int i =0;
        for( i =0; i<arr.length; i++){
            int count = 0;
            for(int j = 0; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    count++;
            }
                    
                    }
                    if(count==1){
                        System.out.println(arr[i]);
                        break;    
        }
              
              }
            
        }
    }

  

