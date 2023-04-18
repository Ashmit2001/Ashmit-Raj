package tophundread.newoops.pesudo;

public class amcatstringsec {
    public static void main(String[] args) {
        String str = "PrepINst@ #$ Virt&al";
        print(str);
    }
    public static void print(String str){
        
          String capital =str.replaceAll("[^A-Z]", "");
          System.out.println(capital);
          String small =str.replaceAll("[^a-z]", "");
          System.out.println(small);
    }
    
}
