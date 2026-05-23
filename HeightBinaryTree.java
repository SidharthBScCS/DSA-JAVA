class Node{
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
    }
}

public class HeightBinaryTree {
    public static int calculateHeight(Node root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(calculateHeight(root.left), calculateHeight(root.right));
    }
    
    public static void main(String[] args){
        Node root=new Node(0);
        root.left=new Node(1);
        root.right=new Node(2);
        root.left.left=new Node(3);
        root.left.right=new Node(4);
        root.right.left = new Node(5);
        root.right.right = new Node(5);
        root.left.left.left = new Node(10);

        int height=calculateHeight(root);

        System.out.println(height);
    }
}