package tophundread.newoops.pesudo;

public class friendlypair {
    public static void main(String[] args) {
        int num1 = 6;
        int num2 = 28;
        int sum1 = fun1(num1);
       int sum2 = fun1(num2);
       if(num1/sum1 == num2/sum2){
        System.out.println("yes");
       }else{
        System.out.println("no");
       }

    }
     public static int fun1(int n ){
       int sum = 0;
        for(int i = 1; i< n; i++ ){
           
            if(n % i ==0){
               sum += i; 
            }
        }
        return sum;
            
        
     }
    
}
