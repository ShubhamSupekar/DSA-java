class ll{
    Node head;
    class Node {
        String data;
        Node next;

        Node(String data){ //
            this.data = data;
            this.next = null;
        }
    }

    public void addFirst(String data) {
        Node newNode = new Node(data);      
         if(head ==null){
            head = newNode;                          
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data) {
        Node newNode = new Node(data);
        if(head ==null){
            head = newNode;
            return;
        }
        Node currNode = head;                  
        while(currNode.next !=null){               
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    public void deleteFirst() {
        if(head==null){
            System.out.println("The list is empty");
            return;
        }
        head = head.next;
    }

    public void printll() {
        Node currNode = head;
        while(currNode !=null){
            System.out.print(currNode.data+" -> ");
            currNode = currNode.next;
        }
        System.out.print("null.");
        System.out.println("");
    }

    public void reverse() {
        if(head==null || head.next == null){
            return;
        }
        Node prevNode  = head;
        Node currNode  = head.next;
        while(currNode!=null){                            
            Node nextNode = currNode.next;
            currNode.next = prevNode;

            //update
            prevNode = currNode;
            currNode = nextNode;
        }  
        head.next =null;
        head = prevNode;
    }
    public Node reverseRecursive(Node head) {
    
        Node newHead=reverseRecursive(head.next);                    
        head.next.next = head;
        head.next =null;
        return newHead;
    }

    public static void main(String[] args) {
        ll list = new ll();
        list.addFirst("4");
        list.addFirst("3");
        list.addFirst("2");
        list.addLast("5");    
        list.addFirst("1");
        list.printll();
     //   list.deleteFirst();
       // list.printll();
        list.reverse();
        list.printll();
    }
}