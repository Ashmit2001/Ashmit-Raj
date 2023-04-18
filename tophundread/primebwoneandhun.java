package tophundread;

public class primebwoneandhun {
    public static void main(String arr[]){
        int low = 1 , high = 100;
        for(int i = low+1; i<high; i++){
            boolean flag = true;
            for(int j =2; j<i; j++){
                if(i==2){
                    flag = true;
                } 
                if(i%j == 0){
                    flag = false;
                 }
            }
              if(flag){
                System.out.println(+i +" "+":is prime" );
              } else{
                continue;
              }

            }
                
        }
    }

    

