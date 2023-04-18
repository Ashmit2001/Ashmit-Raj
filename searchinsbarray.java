public class searchinsbarray{

 public static void main(String arr[]){
    String str = "abcd";
    String match = "bd";
    int len = str.length();
    int j =0;
    for(int i =0; i<len; i++){
        if(str.charAt(i)== match.charAt(j)){
            j++;
        }
    } 
        System.out.println(j==match.length() ? "pattern found" :"not");

}
}
