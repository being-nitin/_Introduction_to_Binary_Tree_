package com.Codeforces;
import java.util.*;

public class PostOrderTraversal {
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class Binarytree{
        static int indexx = -1;
        public Node buildtree(int[] nodes){
            indexx++;
            if(nodes[indexx]==-1){
                return null;
            }
            Node newNode = new Node(nodes[indexx]);
            newNode.left = buildtree(nodes);
            newNode.right = buildtree(nodes);
            return newNode;
        }
        public static void postOrder(Node root){
            if(root==null){
                return;
            }
            postOrder(root.left);
            postOrder(root.right);
            System.out.println(root.data+" ");
        }

        public static void main(String[] args) {
            int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
            Binarytree tree = new Binarytree();
            Node root = tree.buildtree(nodes);
            postOrder(root);
        }
    }

}
