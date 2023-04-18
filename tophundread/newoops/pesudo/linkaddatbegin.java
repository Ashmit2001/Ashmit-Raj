package tophundread.newoops.pesudo;

public class linkaddatbegin {
    static class Node{
        int data ;
        Node next;
        Node(int x){
            data = x;
            next = null;

        }
    }
     public static void main(String[] args) {
        Node head = null;
        head = insertb(head,20);
        head = insertb(head,30);
        head = insertb(head,40);
        printf(head);
     }
     public static Node insertb(Node head , int x){
        Node temp = new Node(x);
        temp.next = head;
        return temp;
     }
     public static void printf(Node head){
             Node curr = head;
             while(curr != null){
                System.out.print(curr.data+" ");
                curr = curr.next;
             }
     }
    
}
