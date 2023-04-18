import java.util.Arrays;

public class anagarm {
    public static void main(String arrgs[]){
        String str = "abcd";
        String str2 = "acbd";

        char[] arr1 = str.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
         boolean flag = true;
        for(int i  =0; i<arr2.length; i++){
            if(arr1[i]!=arr2[i]){
              flag = false;
              break;
            }
        }
          if(flag){
            System.out.println("anagram");
          }else{
            System.out.println("not");
          }
    }
    
}
