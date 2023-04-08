import java.util.*;

class Main{

    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree{
        static int idx = -1;
        public static Node BuildTree(int nodes[]) {
            idx++;
            if(nodes[idx]==-1){
                return null;
            }        
            Node newNode =  new Node(nodes[idx]);
            newNode.left = BuildTree(nodes);
            newNode.right = BuildTree(nodes);
            return newNode;
        }
    }
    public static void LevelOrder(Node root){    //for level order we cannot use recursion we have to iterate and using QUEUE
        //(we want FIFO property of queue)
        if(root==null) return;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            Node currNode = q.remove(); 
            if(currNode==null){
                System.out.println();
                if(q.isEmpty()) break;
                else q.add(null);
            }else{
                System.out.print(currNode.data+" ");
                if(currNode.left!=null) q.add(currNode.left);
                if(currNode.right!=null) q.add(currNode.right);
            }
        }
    }

    public static void main(String[] args) {
        int[] node = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree bt = new BinaryTree();
        Node root = bt.BuildTree(node);
        LevelOrder(root);
    }
}
     //                      1              level 1
                    //   2       3          level 2
                    // 4   5        6       level 3
// output is: 1 2 3 4 5 6