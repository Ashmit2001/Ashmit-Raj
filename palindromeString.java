public class palindromeString {
    public static void main(String arr[]){
        String name = "nitin";

        int i = 0;
        int j = name.length()-1;
        while(i<j){
            if(name.charAt(i)!= name.charAt(j)){
                System.out.println("not a palinmdrome");
                return;
            }
            i++;
            j--;
            }
            System.out.println("palindrome");
        }    
                
            }
        
        
    
    

