import java.util.*;
public class QueuesinLinkedList {
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static class Queues{

        static Node head = null;
        static Node tail = null;


        public static boolean isEmpty(){
            return head == null && tail == null;
        }


        //add
        public static void add(int data){
           Node newnode = new Node(data);
           if(head == null){
               head = tail = newnode;
               return;
           }
           tail.next = newnode;
           tail = newnode;
        }

        //remove
        public static int remove(){
            if(isEmpty()){
                System.out.print("Empty queue");
                return -1;
            }
            int front = head.data;
            if(tail == head){
                tail = head = null;
            }else{
                head = head.next;
            }
            return front;
        }

        //peek
        public static int peek(){
            if(isEmpty()){
                System.out.print("Empty queue");
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String[] args) {
        Queues q = new Queues();
        q.add(1);
        q.add(2);
        q.add(3);


        while(!q.isEmpty()){
            System.out.print(q.peek());
            q.remove();
        }
    }
}
