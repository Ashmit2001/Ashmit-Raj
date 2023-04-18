public class patternmatchbruet {
    public static void main(String arr[]){
    String str = "ABCAABBBABCABD";
    String match = "ABC";
    int s = str.length();
    int m = match.length();

    for(int i =0; i<=(s-m) ; i++ ){
        int j;   
        for( j = 0; j<m; j++){
            if(match.charAt(j) != str.charAt(i+j)  ){
                break;
            }
           }
             if(j==m){
                System.out.println("pattern found"+i);

             }
    }
    
}
}
