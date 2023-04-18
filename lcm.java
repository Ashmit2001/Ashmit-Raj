public class lcm {
    public static void main(String arr[]){
        int n1 = 12 , n2 = 14 , hcf = 1;
        for(int i = 1; i<=n1 || i <= n2; i++ ){
            if(n1%i==0 && n2%i==0){
                hcf = i;
            }

        } 
        System.out.println("hcf : loading..."+" "+hcf);
           int LCM = (n1*n2)/hcf;
           System.out.println("lcm : ..."+LCM);
    }
    
}
