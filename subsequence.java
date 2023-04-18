import java.util.ArrayList;

public class subsequence {
   public static void main(String arr[]){
       String str = "abcd";
       ArrayList<String> list = new ArrayList<>();
       int len = str.length();
       for(int i =0; i<len; i++){
          char firstchar = str.charAt(i);
          if(list.size() == 0){
          list.add("");
          list.add("" + firstchar); 
          continue;
       }
    
           //  int listsize = list.size();
                int listlen  = list.size();
            for (int j=0; j<listlen; j++){
               String temp = list.get(j) + firstchar;
               list.add(temp);
               
             }
        }
        System.out.println(list);
    }
   }    

