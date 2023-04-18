package tophundread;

public class loop {
    static public void main(String args[]) { //line 2
       int n = 7;
        for(int i = n; i>=1; i--){
          for(int j = n; j>=i; j--){
           System.out.print(j+" ");
          }
          System.out.println();
      }
    }
}
