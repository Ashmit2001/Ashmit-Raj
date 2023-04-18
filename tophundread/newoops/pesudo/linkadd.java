package tophundread.newoops.pesudo;

public class linkadd{
    static class LL{
        static Node head; 
        static Node tail;
         int size ;
        LL(){
            this.size = 0;
        }
    
    static class Node{
        int value;
        Node next;
        Node(int value){
           this.value = value;

        }
        Node(int value , Node next){
            this.value = value;
            this.next = null;
        }
    }
       public void insertatend(int value){
             if(tail == null){
                insertatend(value);
             }
             Node temp = new Node(value);
             temp.next = tail;
             tail = temp;
             size++;

       }
        public void insert(int value){
            Node temp = new Node(value);
            temp.next = head;
            head = temp;
            if(tail == null){
               tail = head;
            }
            size++;
        }
    
         public static void print(){
            Node curr = head;
            while(curr != null){
                System.out.print(curr.value+" ");
                curr = curr.next;
            } 
         }
         public static void main(String[] args) {
            LL List =  new LL(); 
            List.insert(3);
            List.insert(4);
            List.insert(2);
            List.insert(1);
            List.insertatend(9);
            print();
    
           }
    }
       

       }
    
    

    



