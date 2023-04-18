package tophundread.newoops.pesudo;

public class linknsertend {
    static class Node{
        int data;
        Node next;
        Node(int x){        
            data = x;
            next = null;
        }
    }
     public static void main(String[] args) {
        Node head = null;
        head = inseratend(head , 10);
        head = inseratend(head , 20);
        head = inseratend(head , 30);
        head = inseratend(head , 40);
        printf(head);
        
     }
     public static Node inseratend(Node head ,int x){
        Node temp = new Node(x);
        if(head == null) return temp;
        Node curr = head;
        while(curr.next != null){
            curr = curr.next;
        }
            curr.next = temp; 
           return head;
     }
     public static void printf(Node head ){
             Node curr = head;
             while(curr != null){
                    System.out.print(curr.data+" ");
                    curr = curr.next;
             }
     }
    
}
