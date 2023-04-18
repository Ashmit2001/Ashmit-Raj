public class palindrome {
    public static void main(String[] arr){
        
        String name = "nitin";
        
    
        StringBuilder sb = new StringBuilder(name);
    sb.reverse();
    System.out.println(name);
    System.out.println(sb);
    System.out.println(sb.toString().equals(name)?"palindrome":"not");
    }
}
