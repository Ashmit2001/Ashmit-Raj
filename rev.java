

public class rev {
    public static void main(String[] args) {
        String str = "ansh";
        String str2 = "$@a%n###$$%&sh";
       for(int i = str.length()-1; i>=0; i--){
        System.out.print(str.charAt(i));
       }
       System.out.println();
       char[] a = str.toCharArray();
       for(int i =a.length-1; i>=0; i--){
          System.out.print(a[i]);
       }
       System.out.println();
         String str3 = str2.replaceAll("[^a-zA-Z0-9]", "");
         System.out.println(str3);
         System.out.println();
         String k = "a   n    s   h";
         String l = k.replaceAll(" ", "");
         System.out.println(l);
    }

    
}
