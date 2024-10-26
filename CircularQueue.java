import java.util.*;
public class CircularQueue {
    static class Queue{
        static int arr[];
        static int size;
        static int rear;
        static int front;

        Queue(int n){
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }
        public static boolean isEmpty(){
            return rear == -1 && front == -1;
        }

        public static boolean isfull(){
            return (rear + 1)% size == front;
        }

        //add
        public static void add(int data){
            if(isfull()){
                System.out.print("Queue is full");
                return;
            }
            //add 1st element
            if(front == -1){
                front = 0;
            }
            rear = (rear + 1)% size;
            arr[rear] = data;
        }

        //remove
        public static int remove(){
            if(isEmpty()){
                System.out.print("Empty queue");
                return -1;
            }
            int result = arr[front];

            //last element
            if(rear == front){
                rear = (rear + 1)% size;
            }else{
                front = (front + 1)% size;
            }
            return result;
        }

        //peek
        public static int peek(){
            if(isEmpty()){
                System.out.print("Empty queue");
                return -1;
            }
            return arr[front]; //front
        }
    }
    public static void main(String[] args) {
        main.Queue q = new main.Queue(3);
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.print(q.remove());
        q.add(4);
        System.out.print(q.remove());
        q.add(5);


        while(!q.isEmpty()){
            System.out.print(q.peek());
            q.remove();
        }

    }
}
