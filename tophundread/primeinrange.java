package tophundread;

public class primeinrange {
    public static void main(String arr[]){
        int n = 2;
        int n2 = 10;

        for(int i =n; i < n2; i++){
            boolean isprime = true;
            for(int j = n; j<i; j++){
                if(i%j==0){
                    isprime = false;
                    break;
                }
            }
              if (isprime)
              System.out.print(i+" ");
        }
    }
    
}
