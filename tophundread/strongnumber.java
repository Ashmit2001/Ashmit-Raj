package tophundread;

public class strongnumber {
    public static void main(String arr[]){
        int num = 144;
    
    
       if(fun2(num)){
        System.out.println("yes");
       }else{
        System.out.println("no");
       }
    }
        public static int fun1(int n){
            int fact = 1;
       for(int i = n; i>1; i--){
         fact = fact * i;
         
       }
    return fact;
        
    }   
       
       public static boolean fun2(int num){
        int temp = num;
        boolean flag = true;
        int sum = 0 ;
        while(temp!=0){
            int lastdigit = temp%10;
            sum += fun1(lastdigit);
            temp = temp/10;
        }
             if(sum == num)
               flag = true;
             else 
             flag = false;
            
             return flag;
    }
    
}

