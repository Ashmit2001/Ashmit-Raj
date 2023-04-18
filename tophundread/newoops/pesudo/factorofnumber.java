package tophundread.newoops.pesudo;
import java.util.*;
public class factorofnumber {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("enter the number");   
     int n = sc.nextInt();
        fun1(n);
    }
      static void fun1(int n){
        for(int i = 1; i<=n; i++){
            if(n%i==0){
                System.out.println(i);
            }
        }
      
    }
    
}
