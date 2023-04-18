package tophundread.newoops.pesudo;

public class linksearch {
   static class Node{
        int data;
        Node next;
         Node(int x){
        data = x;
        next = null;
         }
    }
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        printf(head);
        System.out.println(search(head,20));
        
    }
      public static int search(Node head , int y){
        int pos = 1;
        Node curr = head;
        while(curr != null){
            if(curr.data == y){
                return pos;
            }else{
                pos++;
                curr = curr.next;
            }
        }
        return -1;
    }
           public static void printf(Node head){
            Node curr=head;
        while(curr!=null){
        System.out.print(curr.data+" ");
        curr=curr.next;
    }System.out.println();
    }
}
           
