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
    public static void LevelOrder(Node root){   
        int h = height(root);
        int i;
        for(i=1;i<=h;i++){
            PrintCurrLevel(root,i);
            System.out.println();
        }
    }

    public static void PrintCurrLevel(Node root,int level) {
         if (root == null) return;
        if (level == 1) System.out.print(root.data + " ");
        else if (level > 1) {
            PrintCurrLevel(root.left, level - 1);
            PrintCurrLevel(root.right, level - 1);
        }
    }

    public static int height(Node root) {
        if(root==null) return 0;
        int lt = height(root.left);
        int rt = height(root.right);
        return Math.max(lt, rt)+1;
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