package tophundread.newoops.pesudo;

public class amcatrange {
    public static void main(String[] args) {
        
        int max  = 7;
        int min = 2;
        for(int i = 1; i<=max; i++){
            if(i%min == 0 && i%max == 0){
                System.out.println("prepinsta");
            }else if(i%min== 0 ){
                System.out.println("prep");
            }else if(i%max == 0){
                System.out.println("Insta");
            }else {
                System.out.println("prepster");
            }
        }

    }
    
    
    
}
