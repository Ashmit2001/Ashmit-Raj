public class productofdigit {
    public static void main(String arr[]){
        int n = 3234;
        int temp = n;
        int product = 1;
         //int i =0;
         //int j = n;
        while(temp>0){
            int lastdigit = temp%10;
              product *=lastdigit;
              temp = temp/10;

        }
          System.out.println(product);

    }
    
}
