package tophundread.newoops.pesudo;

public class perfectnuminjava {
    public static void main(String[] args) {
        int n = 6;
       if(fun1(n)==n){
        System.out.println("yes");
       }else{
        System.out.println("no");
       }
    }
    public static int fun1(int m){
       
        int sum = 0;
          for(int i = 1; i<m; i++){
            if(m%i==0){
             sum += i;
            }
           
          }
             return sum;
    }
      
       }
    

