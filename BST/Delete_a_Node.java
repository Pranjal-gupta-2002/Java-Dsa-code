package BST;

import java.util.LinkedList;
import java.util.Queue;

public class Delete_a_Node {
    public static class Node{
        int val;
        Node left;
        Node right;
        public Node(int val){
            this.val = val;
        }
    }
    public static Node constructBfs(String[] arr){
        int x = Integer.parseInt(arr[0]);
        int n = arr.length;
        Node root = new Node(x);
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int i = 1 ;
        while(i<n-1){
            Node temp = q.remove();
            Node left = new Node(0);
            Node right = new Node(0);
            if(arr[i].equals("")){
                left = null;
            }
            else{
                int l = Integer.parseInt(arr[i]);
                left.val = l;
                q.add(left);
            }
            if(arr[i+1].equals("")){
                right = null;
            }
            else{
                int r = Integer.parseInt(arr[i+1]);
                right.val = r;
                q.add(right);
            }
            temp.left = left;
            temp.right = right;
            i = i+2;
        }
        return root;
    }
    public static void preOrder(Node root) {
        if (root == null) return;

        System.out.print(root.val + " ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void delete(Node root,int target){
        if(root==null) return;
        if(root.val>target){
            if(root.left.val==target){
                if(root.left.left==null && root.left.right==null){
                    root.left = null;
                }
                else if (root.left.left==null || root.left.right==null) {
                    if(root.left.left!=null){
                        root.left = root.left.left;
                    }
                    else {
                        root.left = root.left.right;
                    }
                }
            }
            else{
                delete(root.left,target);
            }
        }
        else{
            if(root.right.val==target){
                if(root.right.left==null && root.right.right==null){
                    root.right = null;
                }
                else if (root.right.left==null || root.right.right==null) {
                    if(root.right.left!=null){
                        root.right = root.right.left;
                    }
                    else {
                        root.right = root.right.right;
                    }
                }
            }
            else{
                delete(root.right,target);
            }
        }
    }
    public static void main(String[] args) {
        String[] arr = {"50","20","60","17","34","55","89","10","","28","","","","70","","","14"};
        Node root = constructBfs(arr);
        preOrder(root);
        delete(root,10);
        System.out.println();
        preOrder(root);
    }
}
