package tophundread.newoops.pesudo;

public class amstrinrange {
    /**
     * @param args
     */
    public static void main(String[] args) {
        int num1 = 1;
        
        int num2 = 1000;
        
        
        
        for(int i = num1; i<=num2; i++){
            int yo = i;
            int yup = i;
            int count = 0;
        int sum = 0;
             while(yo != 0){
                count++;
                yo = yo/10;
             }
             
             while(yup !=0){
                int lastDigit = yup %10;
                sum = sum + (int)Math.pow(lastDigit, count);
                yup = yup/10;
             }
            if(i == sum){
                System.out.println(i+" ");
            }
            }
        }
}



