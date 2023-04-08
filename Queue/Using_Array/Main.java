class Main{
    static class Queue{
        static int arr[];
        static int size;
        static int rear =-1;

        Queue(int n){
            arr = new int[n];
            this.size = n;
        }

        public static boolean isEmpty() {
            return rear==-1;
        }

        public static void add(int data) { //enqueue
            if(rear == size-1){
                System.out.println("Full Queue");
                return;
            }
            rear++;
            arr[rear] = data;
        }

        public static int remove() {  //dequeue
            if(isEmpty()){
                return -1;
            }
            int front = arr[0];
            for(int i=0;i<rear;i++){
                arr[i]= arr[i+1];
            }
            rear--;
            return front;
        }

        public static int peek() {
            if(isEmpty()){
                return -1;
            }
            return arr[0];
        }

        public static void size() {
            int a = rear+1;
            System.out.println("Size of queue is: "+a);
        }

    }

    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.size();
        while(!q.isEmpty()){
            System.err.println(q.remove());
        }
        q.size();
    }   
}