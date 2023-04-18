package tophundread.newoops.pesudo;

public class automorphic {
    public static void main(String[] args) {
        int n = 5;
        if(fun1(n)==n){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }    
       
        public static int fun1(int n){
           // int lastDigit = 0;
            int temp = (int)Math.pow(n, 2);
            int lastDigit = temp%10;
            return lastDigit;
        }
    }
    
        
        
        
    
    

