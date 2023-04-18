import java.util.Scanner;

public class vote {
              public static void main(String arr[]){
                  try (Scanner sc = new Scanner(System.in)) {
                    System.out.println("enter the age");
                      int age = sc.nextInt();
                      
                      String result = age>=18?"vote":"not";
                       System.out.println(result);
                }
              }    
}
