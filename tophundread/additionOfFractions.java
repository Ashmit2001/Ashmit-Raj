package tophundread;

public class additionOfFractions {
    public static void main(String arr[]){
        int num1 = 1;
        int num2 = 3;
        int dem1 = 3;
        int dem2 = 9; 
        int hcf = 1;

        for(int i =1; i<=dem1 || i<= dem2; i++){
           if(dem1%i ==0 && dem2%i == 0){
            hcf = i;
           }
        }
          System.out.println(hcf);
         int lcm = (dem1*dem2)/hcf;
         System.out.println(lcm);
         int div1 = (lcm/dem1);
         System.out.println(div1);
         int div2 = (lcm/dem2);
         int sum = (num1*div1) + (num2*div2);
         System.out.println(sum);
         int result = 0;
        for(int i =0; i<= sum || i<=lcm; i++){
            if(sum%i==0 && sum%i == 0){
                result = sum/i;
            }
        }
         System.out.println(+sum+"/"+lcm ); 
    }
    
}
