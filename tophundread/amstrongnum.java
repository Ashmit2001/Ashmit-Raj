package tophundread;

public class amstrongnum {
    public static void main(String arr[]){
        int n = 407;
        int temp = n;
        int count = 0;
        
        while(temp!=0){
          
          count ++;
          temp = temp/10;
        }
        System.out.println(count);
        
        int temp2 =n;
        //int j = temp2; 
        int sum =0;
        //int lastdigit;
        while(temp2!=0){
        int lastdigit = temp2%10;
                sum  = sum + (int)Math.pow(lastdigit, count);
                temp2 = temp2/10;
        }
         if(n == sum){
            System.out.println("armstrong");
         }else{
            System.out.println("not a amrstrong");
         }
    }
    
}
