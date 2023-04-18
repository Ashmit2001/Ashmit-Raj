public class replaceocurence{
    public static void main(String arrgs[]){
        String str = "annshan";
        char replace = 'n';

        int cnt = 1;
        for(int i =0; i<str.length(); i++){
            char yup = str.charAt(i);
            if(yup  == replace){
                str = str.replaceFirst(String.valueOf(replace), String.valueOf(cnt));
                cnt++;

          }
        }
           System.out.println(str);
    }
}