package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class preInPost {
    public static class Node{
        int val; // 0
        Node left;// null
        Node right;  // null

        public Node(int val) {
            this.val = val;
        }
    }
    public static void pip(int n){
        if (n==0) return ;
        System.out.println("pre" + n); // Pre
        pip(n-1);
        System.out.println("In" + n);  // In
        pip(n-1);
        System.out.println("Post" + n);  // Post
    }
    public static void preOrder(Node root){
        if(root==null) return;

        System.out.print(root.val + " ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void inOrder(Node root){
        if(root==null) return;

        inOrder(root.left);
        System.out.print(root.val + " ");
        inOrder(root.right);
    }
    public static void postOrder(Node root){
        if(root==null) return;

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.val + " ");
    }
    public static void nthLevel(Node root,int n){
        if(root==null) return;

        if(n==1) {
            System.out.print(root.val + " ");
            return;
        }

        nthLevel(root.left,n-1);
        nthLevel(root.right,n-1);


    }
    public static void nthLevel2(Node root,int n){
        if(root==null) return;

        if(n==1) {
            System.out.print(root.val + " ");
            return;
        }

        nthLevel(root.right,n-1);
        nthLevel(root.left,n-1);


    }
    public static void bfs(Node root){
        Queue<Node> q = new LinkedList<>();
        if(root!=null) q.add(root);
        while(q.size()>0){
            Node temp = q.peek();
            if(temp.left!=null) q.add(temp.left);
            if(temp.right!=null) q.add(temp.right);
            System.out.print(temp.val+ " ");
            q.remove();
        }

    }
    public static int height(Node root){
        if(root==null){
            return 0;
        }
        if(root.left==null && root.right==null  ){
            return 0;
        }
        return 1 + Math.max(height(root.left) , height(root.right));
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        Node a = new Node(2);
        Node b = new Node(3);
        root.left = a;
        root.right = b;
        Node c = new Node(4);
        Node d = new Node(5);
        a.left = c;
        a.right = d;
        Node e = new Node(6);
        Node f = new Node(7);
        b.left = e;
        b.right = f;

        System.out.print("Preorder :- ");
        preOrder(root);
        System.out.println();
        System.out.print("Inorder :- ");
        inOrder(root);
        System.out.println();
        System.out.print("Postorder :- ");
        postOrder(root);
        System.out.println();
        int level = height(root)+1;
        System.out.print("Level order traversal (BFS) :- ");
//        bfs(root);
        for (int i = 1; i <= level; i++) {
            if(i%2==1){

            nthLevel(root,i);
            }
            else {
            nthLevel2(root,i);

            }
        }

    }
}
