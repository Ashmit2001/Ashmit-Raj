public class secondWayprime{
    public static void main(String arr[]){
        int n = 123;
        int temp = n;
        int sum = 0;

        while(n!=0){
            int lastdigit = n%10;
            sum += Math.pow(lastdigit,3);
            temp = temp/10; 
        }
          if(sum == n){
            System.out.println("yes");
          }else{
            System.out.println("no");
          }
          }
    }



