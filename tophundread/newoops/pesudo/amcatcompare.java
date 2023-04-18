package tophundread.newoops.pesudo;

public class amcatcompare {
    public static void main(String[] args) {
        String str = "AlwaysJoeinFriendsJoewithJoeJoe";
        String strr = "Joe";
        print(str,strr);
    }
    public static void print(String str, String strr){
       int count = 0;
        int len1 = str.length();
        int len2 = strr.length();
        for(int i =0; i<=(len1-len2); i++){
            int j ;
            //count = 0;
            for( j =0; j<len2; j++ ){
                if(str.charAt(i+j) != strr.charAt(j)){
                    break;
                }
            }
                if(j == len2 ){
                    count++;
                    j =0;
                }
                
            }
            System.out.println(count);
        }
    }
    

