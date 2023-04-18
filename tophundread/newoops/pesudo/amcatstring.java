package tophundread.newoops.pesudo;

public class amcatstring {
    public static void main(String[] args) {
        String str = "Prepinst@ #% 123";
        count(str);
    }
    public static void count(String str){
       // char[] ch = str.toCharArray();
        int letter = 0;
        int space = 0;
        int num = 0;
        int special = 0;
        for(int i =0; i<str.length(); i++){
            if(Character.isLetter(str.charAt(i))){
                letter++;
            }if(Character.isSpaceChar(str.charAt(i))){
                space++;
            }if(Character.isDigit(str.charAt(i))){
                num++;
            }else{
                special++;
            }
        }
        System.out.println("letter"+letter);
        System.out.println("num"+num);
        System.out.println("space"+space);
        System.out.println("special"+special);
    }
    
}
