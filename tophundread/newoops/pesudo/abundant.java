package tophundread.newoops.pesudo;

public class abundant {
    public static void main(String[] args) {
        int n = 17 ;
        if(fun1(n)==true){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
    public static boolean fun1(int m){
       boolean flag = true;
        int sum = 0;
        for(int i = 1; i<m; i++){
            if(m%i==0){
               sum += i;
            }
        }
        if(sum>m){
           flag = true;
        }else{
            flag = false;
        }
        return flag;
        
    }
    
}
