package tophundread.newoops.pesudo;

public class amrst {
    public static void main(String[] args) {
        int num = 371;
        int count = 0;
        int temp = num;
        int temp2 = num;
        int sum = 0;
        while(temp!=0){
            
           
            count++;
            temp = temp/10;
        }
         System.out.println(count);
         while(temp2!=0){
            int lastDigit = temp2%10;
            sum = sum + (int)Math.pow(lastDigit, count);
            temp2 = temp2/10;
         }
         System.out.println(sum);
         if(num==sum){
            System.out.println("Amrstrong");
         }else{
            System.out.println("not Amrstrong");
         }
    }
    
}
