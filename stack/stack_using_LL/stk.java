public class stk{
   static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
             next = null;
        }
    }

    static class stack{
        public static Node head;
        public static boolean isEmpty() {
            return head==null;
        }
        
        public static void Push(int data) {
            Node newNode = new Node(data);
            if(isEmpty()){
                head = newNode; 
                return;
            }
            newNode.next = head; 
            head = newNode;
        }

        public static int Pop() {
            if(isEmpty()){
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        public static int Peek(){
            if(isEmpty()){
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String[] args) {
        stack s = new stack();
        s.Push(1);
        s.Push(2);
        s.Push(3);
        s.Push(4);
        while(!s.isEmpty()){
            System.out.println(s.Peek());
            s.Pop();
        }
    }  
}