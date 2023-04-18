package tophundread;

public class palindromestr {
    public static void main(String arr[]){
        String str = "man";
        String temp = str;
        int n = str.length();

        int i =0;
        int j = n-1;
        while(i!=j){
          //  boolean flag = true;
             if(temp.charAt(i)!= temp.charAt(j)){
                
                System.out.println("not");
                break;
             }
             i++;
             j--;
        }
          if(i==j){
            System.out.println("yes");
          }
    }
    
}
