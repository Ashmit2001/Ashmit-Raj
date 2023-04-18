package tophundread.newoops.pesudo;

public class insertstack {
    static class mystack{
             static int arr[];
             static int top ;
            static int cap ;
             mystack(int c){
                cap = c;
                top = -1;
                 arr = new int[c];
             }
             public void  push(int x ){
                top++;
                arr[top] = x;

             }
              public  int pop(){
                int res = arr[top];
                top--;
                return res;
              }
              public int peak(){
                return arr[top];
              }
             public  int size(){
                return top+1;
              }
             public  boolean isempty(){
                if(top == -1){
                    return true;
                } 
                return false;
             }
    }
     public static void main(String[] args) {
        mystack m = new mystack(5);
        m.push(10);
        m.push(20);
        m.push(30);
        System.out.println(m.peak());
     }
    
}
