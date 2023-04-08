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
    public static void PostOrder(Node root){         // left>right>root  == post-order
        if(root==null){
            return;
        }
        PostOrder(root.left);
        PostOrder(root.right);
        System.out.print(root.data+" ");
    }

    public static void main(String[] args) {
        int[] node = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree bt = new BinaryTree();
        Node root = bt.BuildTree(node);
        PostOrder(root);
    }
}
    //                      1              level 1
                    //   2       3          level 2
                    // 4   5        6       level 3