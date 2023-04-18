package tophundread;

public class countvowel {
    public static void main(String arrgs[]){
        String str = "asih";
        int n = str.length();
        int count = 0;
        for(int i =0; i<n; i++){
            if(str.charAt(i)=='a' || str.charAt(i)== 'e' || str.charAt(i)== 'i' || str.charAt(i)=='o' || str.charAt(i)=='u'){
                count++;
            }
            
        }
        System.out.println(count);
    }
    
}
