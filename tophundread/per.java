package tophundread;
import java.util.*;
public class per {
    public static void main(String[] args) {
     
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                int temp = n;
                int i =1;
                int sum =0;
                while(i<temp){
                    if(temp%i==0){
                      sum +=i;
                    }
                    i++;
                }
                if(sum==n){
                    System.out.println("Perfect number");
                }else{
                    System.out.println("Not a perfect number");
                }
                    // Fill your code here
                
             }
        }
   
