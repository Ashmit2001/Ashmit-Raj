package tophundread;

public class fibonaci {
    public static void main (String arr[]){
        int num = 5;
        int a = 0;
        int b = 1;
        System.out.print(a+" "+b );


        for(int i = 2; i<num; i++){
        int    c = a+b;
           a = b;
           b = c;
           System.out.print(" "+c);
        }
    }
    
}
