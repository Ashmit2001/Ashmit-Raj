package tophundread;


    import java.util.*;
public class series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Range :");
        int lower = sc.nextInt();
        int upper = sc.nextInt();
        for(int i =lower+1; i<upper; i++){
            if(i%2==0){
                System.out.print(i+" ");
            }
        }
            // Fill your code here
        
     }
}
    

