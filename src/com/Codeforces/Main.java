package com.Codeforces;
import java.util.*;
public class Main {

    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

        static class Binarytree{
            static int indx =-1;
            public Node buildtree(int[] nodes){
                indx++;
                if(nodes[indx]==-1){
                    return null;
                }
                Node newNode = new Node(nodes[indx]);
                newNode.left = buildtree(nodes);
                newNode.right = buildtree(nodes);

                return newNode;
            }
    }
    public static void main(String[] args) {
        int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Binarytree tree = new Binarytree();
        Node root = tree.buildtree(nodes);
        System.out.println(root.data);
    }
}