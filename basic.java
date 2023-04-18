import java.util.Scanner;

public class basic{
       public static void main(String arr[]){
           try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter thr num");
               int num = sc.nextInt();

               int i =0;
               while(i<=num){
                   System.out.println(i +" ");
                   i++;
               }
        }
       }
}
