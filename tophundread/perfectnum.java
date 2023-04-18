package tophundread;

public class perfectnum {
      public static void main(String arr[]){
        int num = 6;
        if(fun2(num)){
           System.out.println("yes");
        }else{
            System.out.println("no");
        }
      }

        public static int fun1(int n){
            int div = 0;
             for(int i = 1; i< n; i++)
                if(n%i==0)
                div = i;

        
        return div;
        }
        public static boolean fun2(int num){
             int temp = num;
             int sum = 0;
             boolean flag = true;
                  while(temp!=0){
                    int lastdigit = temp%10;
                     sum = sum + fun1(lastdigit);
                    temp = temp/10;
                  }
                  if(sum == num){
                      flag = true;

                  }else{
                    flag = false;
                  }
                  return flag;
        }
          
    
}
