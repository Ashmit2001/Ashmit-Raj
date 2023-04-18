package tophundread;

public class prime {
    public static void main(String arr[]){
        int n = 12;
        boolean isprime =true;
        if(n<2){
        isprime = false;
        }
        for(int i =2; i<n; i++){
            if(n%i==0){
                isprime = false;
                break;
            }
            
        }
        String temp = isprime?"prime":"not prime";
        System.out.println(temp);
    }
    
    }

