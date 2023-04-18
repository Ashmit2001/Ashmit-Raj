import java.util.Scanner;
  
      
public class mathuse {
    public static void main(String arr[]){
        try (Scanner sc = new Scanner(System.in)) {
            double num  = sc.nextDouble();
            System.out.println("enter num:"+num +"result is:"+(fun1(num)));
        }


    }

    private static double fun1(double n) {
        double result;
        result = Math.round(n);
        return result;
    }

    
}
