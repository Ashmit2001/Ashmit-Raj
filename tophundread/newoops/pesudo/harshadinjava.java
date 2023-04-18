package tophundread.newoops.pesudo;

public class harshadinjava {
    public static void main(String[] args) {
        int n = 24;
        if(fun1(n)==true){
          System.out.println("yes");
        }else{
            System.out.println("no");
        }

    }
    public static boolean fun1(int m){
       boolean flag = true;
       // int result = 1;
        int sum = 0; 
        int temp = m;
         while(temp !=0){
            int lastDigit = 0;
            lastDigit = temp%10;
              sum += lastDigit;
              temp = temp/10;
         }
          if(m%sum==0){
            flag = true;
          }else{
            flag = false;
          }
          return flag;
         
    }
    

    }
    

