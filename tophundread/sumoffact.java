package tophundread;

public class sumoffact {
    public static void main(String arr[]){
        int num1 = 6;
        int num2  = 11;
        int sum1 = fun1(num1);
        int sum2 = fun1(num2);
        if(sum1/num1 == sum2/num2){
            System.out.println("friendly pair");
        }else{
            System.out.println("not friendly");
        }
    }
      public static int fun1(int num){
        int sum = 0;
        for(int i =1; i<num; i++){
             if(num%i==0){
                sum = sum + i;
             }
         }
            return sum;
      }
    
}
