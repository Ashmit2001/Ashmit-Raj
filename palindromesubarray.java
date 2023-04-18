public class palindromesubarray {

    public static boolean fun1(String temp){
        int i =0;
        int j= temp.length() - 1;
        while(i<=j){
            if(temp.charAt(i) !=temp.charAt(j)){
                return false;

            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String arr[]){
        String str = "abccba";
        
        for(int i =0; i<str.length(); i++){
           for(int j=i+1; j<=str.length(); j++){
            String temp = str.substring(i, j);
         //   System.out.print(temp +" ");
              if(fun1(temp)==true){
                System.out.println(temp+" "+"is palindrome");
              }
           }
            // System.out.println();
        }
    }
    
}
