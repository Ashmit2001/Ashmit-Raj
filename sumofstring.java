public class sumofstring {
    public static void main(String arrgs[]){
        String str = "12ans1h4";

           int sum = 0;
        for(int i =0; i<str.length(); i++){
            if(str.charAt(i) >'0' && str.charAt(i)<'9' ){
              sum = sum + (str.charAt(i)-'0');
            }
        }
        System.out.println(sum);
    }
    
}
