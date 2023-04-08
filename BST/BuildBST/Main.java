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
        public static Node BuildTree(Node root,int val) {
            if(root==null){
                root = new Node(val);
                return root;
            }
            if(root.data>val){
                root.left = BuildTree(root.left,val);
            }
            else{
                root.right = BuildTree(root.right, val);
            }
            return root;
        }

        public static void inorder(Node root) {
            if(root==null) return;
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }
    }

    public static void main(String[] args) {
        int[] node = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree bt = new BinaryTree();
        Node base =null;
        for(int val:node){
            base = bt.BuildTree(base,val);
        }
        bt.inorder(base);
    }
}