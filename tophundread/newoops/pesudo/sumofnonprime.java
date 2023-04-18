package tophundread.newoops.pesudo;

public class sumofnonprime {
   public static void main(String[] args) {
    
   
    int n = 597586;
     int temp = n;
     int sum =0;
     int count ;

    while(temp!=0){
        count = 0;
        int digit = temp%10;
        for(int i =1; i<=digit; i++){
            if(digit%i == 0){
            count++;
            }
        }if(count != 2){
            sum = sum +digit;
        }
            
            
           
        
        temp = temp/10;

    }
     System.out.println(sum);
} 
}
