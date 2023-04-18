package tophundread.newoops.pesudo;

public class strongnumberinjava {
    public static void main(String[] args) {
       int n = 14;
      if(fun2(n)){
        System.out.println("yes");
      }else{
        System.out.println("NO");
      }
    }
       public static int fun1(int n){
        int fact = 1;
           for(int i = n; i>=1; i--){
             fact = fact*i;
           }
        
       return fact;
      
        }
           public static boolean fun2(int n){
            int temp = n;
            int sum = 0;
            boolean flag = true;
            while(temp!=0){
                  int lastDigit = 0;
                  lastDigit = temp%10;
                sum = sum + fun1(lastDigit);
                temp = temp/10;
            }
              if(sum == n)
                flag = true;
              else
                flag = false;
                  
               return flag; 
              }
           }    
    


